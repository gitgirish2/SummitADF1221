package oracle.summit.model.sdo.service.server.serviceinterface;

import java.lang.reflect.Method;

import java.util.List;

import javax.ejb.Remote;
import javax.ejb.Stateless;

import javax.interceptor.Interceptors;

import oracle.adf.share.logging.ADFLogger;

import oracle.jbo.common.Diagnostic;
import oracle.jbo.common.sdo.SDOHelper;
import oracle.jbo.common.service.types.FindControl;
import oracle.jbo.common.service.types.FindCriteria;
import oracle.jbo.common.service.types.ProcessControl;
import oracle.jbo.server.svc.ServiceContextInterceptor;
import oracle.jbo.server.svc.ServiceImpl;
import oracle.jbo.service.errors.ServiceException;

import oracle.summit.model.sdo.service.common.serviceinterface.HRAppModuleService;
import oracle.summit.model.sdo.views.common.DeptViewSDO;
import oracle.summit.model.sdo.views.common.EmpViewSDO;

import oracle.webservices.annotations.PortableWebService;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Tue Jan 13 14:01:05 CST 2015
// ---------------------------------------------------------------------
@Stateless(name = "oracle.summit.model.sdo.service.common.HRAppModuleServiceBean",
           mappedName = "HRAppModuleServiceBean")
@Remote(HRAppModuleService.class)
@PortableWebService(targetNamespace = "/oracle/summit/model/sdo/service/common/", serviceName = "HRAppModuleService",
                    portName = "HRAppModuleServiceSoapHttpPort",
                    endpointInterface = "oracle.summit.model.sdo.service.common.serviceinterface.HRAppModuleService")
@Interceptors({ ServiceContextInterceptor.class })
public class HRAppModuleServiceImpl extends ServiceImpl implements HRAppModuleService {
    private static boolean _isInited = false;

    /**
     * This is the default constructor (do not remove).
     */
    public HRAppModuleServiceImpl() {
        init();
        setApplicationModuleDefName("oracle.summit.model.sdo.service.HRAppModule");
        setConfigurationName("HRAppModuleService");
    }

    /**
     * Generated method. Do not modify. Do initialization in the constructor
     */
    protected void init() {
        if (_isInited) {
            return;
        }
        synchronized (HRAppModuleServiceImpl.class) {
            if (_isInited) {
                return;
            }
            try {
                SDOHelper.INSTANCE.defineSchema("oracle/summit/model/sdo/service/common/serviceinterface/",
                                                "HRAppModuleService.xsd");
                _isInited = true;
            } catch (Throwable t) {
                ADFLogger.createADFLogger(Diagnostic.SERVINT_RT_LOGGER).severe(t);
            }
        }
    }

    /**
     * getDeptView1: generated method. Do not modify.
     */
    public DeptViewSDO getDeptView1(Integer id) throws ServiceException {
        return (DeptViewSDO) get(new Object[] { id }, "DeptView1", DeptViewSDO.class);
    }

    /**
     * createDeptView1: generated method. Do not modify.
     */
    public DeptViewSDO createDeptView1(DeptViewSDO deptView1) throws ServiceException {
        return (DeptViewSDO) create(deptView1, "DeptView1");
    }

    /**
     * updateDeptView1: generated method. Do not modify.
     */
    public DeptViewSDO updateDeptView1(DeptViewSDO deptView1) throws ServiceException {
        return (DeptViewSDO) update(deptView1, "DeptView1");
    }

    /**
     * deleteDeptView1: generated method. Do not modify.
     */
    public void deleteDeptView1(DeptViewSDO deptView1) throws ServiceException {
        delete(deptView1, "DeptView1");
    }

    /**
     * mergeDeptView1: generated method. Do not modify.
     */
    public DeptViewSDO mergeDeptView1(DeptViewSDO deptView1) throws ServiceException {
        return (DeptViewSDO) merge(deptView1, "DeptView1");
    }

    /**
     * findDeptView1: generated method. Do not modify.
     */
    public List<DeptViewSDO> findDeptView1(FindCriteria findCriteria, FindControl findControl) throws ServiceException {
        return (List<DeptViewSDO>) find(findCriteria, findControl, "DeptView1", DeptViewSDO.class);
    }

    /**
     * processDeptView1: generated method. Do not modify.
     */
    public List<DeptViewSDO> processDeptView1(String changeOperation, List<DeptViewSDO> deptView1,
                                              ProcessControl processControl) throws ServiceException {
        return (List<DeptViewSDO>) process(changeOperation, processControl, deptView1, "DeptView1");
    }

    /**
     * getEmpView1: generated method. Do not modify.
     */
    public EmpViewSDO getEmpView1(Integer id) throws ServiceException {
        return (EmpViewSDO) get(new Object[] { id }, "EmpView1", EmpViewSDO.class);
    }

    /**
     * createEmpView1: generated method. Do not modify.
     */
    public EmpViewSDO createEmpView1(EmpViewSDO empView1) throws ServiceException {
        return (EmpViewSDO) create(empView1, "EmpView1");
    }

    /**
     * updateEmpView1: generated method. Do not modify.
     */
    public EmpViewSDO updateEmpView1(EmpViewSDO empView1) throws ServiceException {
        return (EmpViewSDO) update(empView1, "EmpView1");
    }

    /**
     * deleteEmpView1: generated method. Do not modify.
     */
    public void deleteEmpView1(EmpViewSDO empView1) throws ServiceException {
        delete(empView1, "EmpView1");
    }

    /**
     * mergeEmpView1: generated method. Do not modify.
     */
    public EmpViewSDO mergeEmpView1(EmpViewSDO empView1) throws ServiceException {
        return (EmpViewSDO) merge(empView1, "EmpView1");
    }

    /**
     * findEmpView1: generated method. Do not modify.
     */
    public List<EmpViewSDO> findEmpView1(FindCriteria findCriteria, FindControl findControl) throws ServiceException {
        return (List<EmpViewSDO>) find(findCriteria, findControl, "EmpView1", EmpViewSDO.class);
    }

    /**
     * findEmpView1ByDeptVC: generated method. Do not modify.
     */
    public List<EmpViewSDO> findEmpView1ByDeptVC(FindCriteria findCriteria, String bv_dName,
                                                 FindControl findControl) throws ServiceException {
        return (List<EmpViewSDO>) find(findCriteria, findControl, "EmpView1", EmpViewSDO.class, "ByDeptVC", new NamedParam[] {
                                       new NamedParam("bv_dName", bv_dName)
    });
    }

    /**
     * processEmpView1: generated method. Do not modify.
     */
    public List<EmpViewSDO> processEmpView1(String changeOperation, List<EmpViewSDO> empView1,
                                            ProcessControl processControl) throws ServiceException {
        return (List<EmpViewSDO>) process(changeOperation, processControl, empView1, "EmpView1");
    }
}
