package oracle.summit.model.rowfinder;

import oracle.jbo.ApplicationModule;
import oracle.jbo.NameValuePairs;
import oracle.jbo.Row;
import oracle.jbo.RowFinderFetchLimitExceededException;
import oracle.jbo.RowIterator;
import oracle.jbo.client.Configuration;
import oracle.jbo.server.RowFinder;
import oracle.jbo.server.ViewObjectImpl;

public class TestClient {
    public TestClient() {
        super();
    }

    public static void main(String[] args) {
        TestClient testClient = new TestClient();
        String amDef = "oracle.summit.model.rowfinder.EmpService";
           String config = "EmpServiceLocal";
           ApplicationModule am = Configuration.createRootApplicationModule(amDef, config);

           // 1. Find the view object with the row finder
           ViewObjectImpl vo = (ViewObjectImpl)am.findViewObject("EmpView1");
           Row r;
           RowIterator ri = null;

           // 2. Find the row finder
           RowFinder finder = vo.lookupRowFinder("EmpByTitleId");
           // 3. Create name value pairs for the row finder
           NameValuePairs nvp = new NameValuePairs();
           // 4. Set the row-finder mapped transient attribute
           nvp.setAttribute("TrTitleId", "1");
           // 5. Invoke the row finder
           try
           {
              ri = finder.execute(nvp, vo);
           }
           // 6. Throw an exception when row match exceeds specified limit
           catch(RowFinderFetchLimitExceededException e)
           {
              System.out.println("Warning: more than one row match exists.");
           }

           while (ri.hasNext())
           {
             r = ri.next();
             System.out.println("Find emp row by title id finder: " +
                r.getAttribute("FirstName") + "/" + r.getAttribute("LastName"));
           }

           Configuration.releaseRootApplicationModule(am, true);
        }
    }
