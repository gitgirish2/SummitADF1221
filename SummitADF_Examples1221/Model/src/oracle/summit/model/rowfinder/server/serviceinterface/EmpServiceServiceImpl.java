package oracle.summit.model.rowfinder.server.serviceinterface;

import java.lang.reflect.Method;

import javax.ejb.Remote;
import javax.ejb.Stateless;

import javax.interceptor.Interceptors;

import oracle.adf.share.logging.ADFLogger;

import oracle.jbo.common.Diagnostic;
import oracle.jbo.common.sdo.SDOHelper;
import oracle.jbo.server.svc.ServiceContextInterceptor;
import oracle.jbo.server.svc.ServiceImpl;
import oracle.jbo.service.errors.ServiceException;

import oracle.summit.model.rowfinder.common.EmpViewSDO;
import oracle.summit.model.rowfinder.common.serviceinterface.EmpServiceService;

import oracle.webservices.annotations.PortableWebService;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Wed Jan 21 15:17:00 CST 2015
// ---------------------------------------------------------------------
@Stateless(name = "oracle.summit.model.rowfinder.common.EmpServiceServiceBean", mappedName = "EmpServiceServiceBean")
@Remote(EmpServiceService.class)
@PortableWebService(targetNamespace = "/oracle/summit/model/rowfinder/common/", serviceName = "EmpServiceService",
                    portName = "EmpServiceServiceSoapHttpPort",
                    endpointInterface = "oracle.summit.model.rowfinder.common.serviceinterface.EmpServiceService")
@Interceptors({ ServiceContextInterceptor.class })
public class EmpServiceServiceImpl extends ServiceImpl implements EmpServiceService {
    private static boolean _isInited = false;

    /**
     * This is the default constructor (do not remove).
     */
    public EmpServiceServiceImpl() {
        init();
        setApplicationModuleDefName("oracle.summit.model.rowfinder.EmpService");
        setConfigurationName("EmpServiceService");
    }

    /**
     * Generated method. Do not modify. Do initialization in the constructor
     */
    protected void init() {
        if (_isInited) {
            return;
        }
        synchronized (EmpServiceServiceImpl.class) {
            if (_isInited) {
                return;
            }
            try {
                SDOHelper.INSTANCE.defineSchema("oracle/summit/model/rowfinder/common/serviceinterface/",
                                                "EmpServiceService.xsd");
                _isInited = true;
            } catch (Throwable t) {
                ADFLogger.createADFLogger(Diagnostic.SERVINT_RT_LOGGER).severe(t);
            }
        }
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
}

