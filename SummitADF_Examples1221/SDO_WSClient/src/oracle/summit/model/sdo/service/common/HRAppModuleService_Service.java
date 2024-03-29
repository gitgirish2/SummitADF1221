
package oracle.summit.model.sdo.service.common;

import java.net.MalformedURLException;
import java.net.URL;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.10-b140319.1121
 * Generated source version: 2.2
 *
 */
@WebServiceClient(name = "HRAppModuleService", targetNamespace = "/oracle/summit/model/sdo/service/common/",
                  wsdlLocation =
                  "http://127.0.0.1:7101/SummitADF-Model-context-root/HRAppModuleService?WSDL#%7B%2Foracle%2Fsummit%2Fmodel%2Fsdo%2Fservice%2Fcommon%2F%7DHRAppModuleService")
public class HRAppModuleService_Service extends Service {

    private final static URL HRAPPMODULESERVICE_WSDL_LOCATION;
    private final static WebServiceException HRAPPMODULESERVICE_EXCEPTION;
    private final static QName HRAPPMODULESERVICE_QNAME =
        new QName("/oracle/summit/model/sdo/service/common/", "HRAppModuleService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url =
                new URL("http://127.0.0.1:7101/SummitADF-Model-context-root/HRAppModuleService?WSDL#%7B%2Foracle%2Fsummit%2Fmodel%2Fsdo%2Fservice%2Fcommon%2F%7DHRAppModuleService");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        HRAPPMODULESERVICE_WSDL_LOCATION = url;
        HRAPPMODULESERVICE_EXCEPTION = e;
    }

    public HRAppModuleService_Service() {
        super(__getWsdlLocation(), HRAPPMODULESERVICE_QNAME);
    }

    public HRAppModuleService_Service(WebServiceFeature... features) {
        super(__getWsdlLocation(), HRAPPMODULESERVICE_QNAME, features);
    }

    public HRAppModuleService_Service(URL wsdlLocation) {
        super(wsdlLocation, HRAPPMODULESERVICE_QNAME);
    }

    public HRAppModuleService_Service(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, HRAPPMODULESERVICE_QNAME, features);
    }

    public HRAppModuleService_Service(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public HRAppModuleService_Service(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     *
     * @return
     *     returns HRAppModuleService
     */
    @WebEndpoint(name = "HRAppModuleServiceSoapHttpPort")
    public HRAppModuleService getHRAppModuleServiceSoapHttpPort() {
        return super.getPort(new QName("/oracle/summit/model/sdo/service/common/", "HRAppModuleServiceSoapHttpPort"),
                             HRAppModuleService.class);
    }

    /**
     *
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns HRAppModuleService
     */
    @WebEndpoint(name = "HRAppModuleServiceSoapHttpPort")
    public HRAppModuleService getHRAppModuleServiceSoapHttpPort(WebServiceFeature... features) {
        return super.getPort(new QName("/oracle/summit/model/sdo/service/common/", "HRAppModuleServiceSoapHttpPort"),
                             HRAppModuleService.class, features);
    }

    private static URL __getWsdlLocation() {
        if (HRAPPMODULESERVICE_EXCEPTION != null) {
            throw HRAPPMODULESERVICE_EXCEPTION;
        }
        return HRAPPMODULESERVICE_WSDL_LOCATION;
    }

}
