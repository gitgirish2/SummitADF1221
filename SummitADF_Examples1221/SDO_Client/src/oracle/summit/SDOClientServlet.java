package oracle.summit;

import commonj.sdo.DataObject;
import commonj.sdo.helper.DataFactory;
import commonj.sdo.helper.XMLHelper;

import java.io.IOException;
import java.io.PrintWriter;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

import oracle.summit.model.sdo.service.common.serviceinterface.HRAppModuleService;
import oracle.summit.model.sdo.views.common.EmpViewSDO;

import oracle.jbo.client.svc.ServiceFactory;
import oracle.jbo.common.service.types.FindCriteria;
import oracle.jbo.common.service.types.SortOrder;
import oracle.jbo.common.service.types.ViewCriteria;
import oracle.jbo.common.service.types.ViewCriteriaItem;
import oracle.jbo.common.service.types.ViewCriteriaRow;


@WebServlet(name = "SDOClientServlet", urlPatterns = { "/sdoclientservlet" })
public class SDOClientServlet extends HttpServlet {
    private static final String CONTENT_TYPE = "text/html; charset=UTF-8";

    private PrintWriter out;
    private DataFactory mDataFactory;
    private XMLHelper mXMLHelper;
    private List<TestResult> mTestResults = new ArrayList<TestResult>();



    public void init(ServletConfig config) throws ServletException {
        super.init(config);
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType(CONTENT_TYPE);
        out = response.getWriter();
        out.println("<html>");
        out.println("<head><title>SDOClientServlet</title></head>");
        out.println("<body>");
        
        HRAppModuleService proxy = (HRAppModuleService) ServiceFactory.getServiceProxy(HRAppModuleService.NAME);
        mDataFactory = ServiceFactory.getDataFactory(proxy);
        mXMLHelper = ServiceFactory.getXMLHelper(proxy);

        testFinders(proxy);

        out.println("<p>********** TEST RESULTS **********</p>");
        writeResults();
        
        
        out.println("</body></html>");
        out.close();
    }
    
    protected void testFinders(HRAppModuleService proxy)
    {
       testFindEmps(proxy);
//       testFindDepts(proxy);
//       testFindClerks(proxy);
//       testFindEmpsByJob(proxy);
    }
    
    protected void writeResults()
    {
       out.println("<pre>");
       for (int i = 0; i < mTestResults.size(); i++)
       {
          TestResult result = mTestResults.get(i);
          out.printf("<p>%4d  %-28s %s", i + 1, result.name, result.result);
          if (result.message != null)
             out.printf(": %s", result.message);
          out.printf("</p>\n");
       }
       out.println("</pre>");
       out.flush();
       mTestResults.clear();
    }
    
    void testFindEmps(HRAppModuleService proxy)
    {
       try
       {
          out.println("<p>********** findEmps() **********</p>");

          //
          out.println("<p>WHERE dept name in ('Administration', 'Sales')</p>");
          //

          ViewCriteriaItem vci = makeViewCriteriaItem("Name", "IN", "Administration", null);
          vci.getValue().add("Sales");
          ViewCriteriaRow vcr = makeViewCriteriaRow(vci, null);
          ViewCriteria vc = makeViewCriteria(vcr);
          FindCriteria findCriteria = makeFindCriteria(0, -1, vc, null);
          writeDataObject(findCriteria);

          List<EmpViewSDO> empList = proxy.findEmpView1(findCriteria, null);
          boolean success = verifyFindEmpResult("1 3 5 11 13 14 15 23", empList);

          if (success)
             mTestResults.add(new TestResult("findEmps", Result.Succeeded));
          else
             mTestResults.add(new TestResult("findEmps", Result.FAILED));
       }
       catch (Exception e)
       {
          printStackTrace(e);
          mTestResults.add(new TestResult("findEmps", Result.FAILED, e.getMessage()));
       }
    }
    
    private boolean verifyFindEmpResult(String expected, List<EmpViewSDO> result)
    {
          out.print("<p>Expect: " + expected + "</p>");
          out.print("<p>Actual: ");

       StringBuilder sb = new StringBuilder();
       if (result != null)
       {
          for (int i = 0, size = result.size(); i < size; i++)
          {
             if (i > 0)
                sb.append(' ');
             sb.append(result.get(i).getId());
          }
             out.print(sb + "</p>");
       }

       return expected.equals(sb.toString());
    }
    
    private void printStackTrace(Exception e)
    {
       out.println("<pre><font color=\"red\">");
       e.printStackTrace(out);
       out.println("</font></pre>");
    }
    
    enum Result
    {
       Succeeded,
       FAILED;
    }

    static class TestResult
    {
       String name;
       Result result;
       String message;

       TestResult(String name, Result result)
       {
          this.name = name;
          this.result = result;
       }

       TestResult(String name, Result result, String message)
       {
          this.name = name;
          this.result = result;
          this.message = message;
       }
       
    }
    
    private ViewCriteriaItem makeViewCriteriaItem(String attribute, String operator, Object value,
                                                  String conjunction)
    {
       ViewCriteriaItem vci = (ViewCriteriaItem) mDataFactory.create(ViewCriteriaItem.class);
       vci.setAttribute(attribute);
       vci.setOperator(operator);
       vci.getValue().add(value);
       if (conjunction != null)
          vci.setConjunction(conjunction);
       return vci;
    }
    
    private ViewCriteriaRow makeViewCriteriaRow(ViewCriteriaItem vci, String conjunction)
    {
       ViewCriteriaRow vcr = (ViewCriteriaRow) mDataFactory.create(ViewCriteriaRow.class);
       vcr.getItem().add(vci);
       if (conjunction != null)
          vcr.setConjunction(conjunction);
       return vcr;
    }
    
    private ViewCriteria makeViewCriteria(ViewCriteriaRow vcr)
    {
       ViewCriteria vc = (ViewCriteria) mDataFactory.create(ViewCriteria.class);
       vc.getGroup().add(vcr);
       return vc;
    }
    
    private FindCriteria makeFindCriteria(int fetchStart, int fetchSize, ViewCriteria vc,
                                          SortOrder so)
    {
       FindCriteria fc = (FindCriteria) mDataFactory.create(FindCriteria.class);
       fc.setFetchStart(fetchStart);
       fc.setFetchSize(fetchSize);
       fc.setFilter(vc);
       fc.setSortOrder(so);
       return fc;
    }
    
    private void writeDataObject(Object object)
    {
       out.println("<pre>");

       try
       {
          DataObject dataObject = (DataObject) object;
          String xml =
             mXMLHelper.save(dataObject, dataObject.getType().getURI(), dataObject.getType().getName());
          xml = xml.replaceAll("<", "&lt;");
          xml = xml.replaceAll(">", "&gt;");
          out.print(xml);
       }
       catch (Exception e)
       {
          printStackTrace(e);
       }

       out.println("</pre>");
    }
}
