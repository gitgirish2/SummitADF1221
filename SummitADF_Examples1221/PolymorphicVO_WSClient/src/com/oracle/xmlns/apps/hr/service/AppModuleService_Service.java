
package com.oracle.xmlns.apps.hr.service;

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
@WebServiceClient(name = "AppModuleService", targetNamespace = "http://xmlns.oracle.com/apps/hr/service/",
                  wsdlLocation =
                  "http://127.0.0.1:7101/SummitADF-Model-context-root/AppModuleService?WSDL#%7Bhttp%3A%2F%2Fxmlns.oracle.com%2Fapps%2Fhr%2Fservice%2F%7DAppModuleService")
public class AppModuleService_Service extends Service {

    private final static URL APPMODULESERVICE_WSDL_LOCATION;
    private final static WebServiceException APPMODULESERVICE_EXCEPTION;
    private final static QName APPMODULESERVICE_QNAME =
        new QName("http://xmlns.oracle.com/apps/hr/service/", "AppModuleService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url =
                new URL("http://127.0.0.1:7101/SummitADF-Model-context-root/AppModuleService?WSDL#%7Bhttp%3A%2F%2Fxmlns.oracle.com%2Fapps%2Fhr%2Fservice%2F%7DAppModuleService");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        APPMODULESERVICE_WSDL_LOCATION = url;
        APPMODULESERVICE_EXCEPTION = e;
    }

    public AppModuleService_Service() {
        super(__getWsdlLocation(), APPMODULESERVICE_QNAME);
    }

    public AppModuleService_Service(WebServiceFeature... features) {
        super(__getWsdlLocation(), APPMODULESERVICE_QNAME, features);
    }

    public AppModuleService_Service(URL wsdlLocation) {
        super(wsdlLocation, APPMODULESERVICE_QNAME);
    }

    public AppModuleService_Service(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, APPMODULESERVICE_QNAME, features);
    }

    public AppModuleService_Service(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public AppModuleService_Service(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     *
     * @return
     *     returns AppModuleService
     */
    @WebEndpoint(name = "AppModuleServiceSoapHttpPort")
    public AppModuleService getAppModuleServiceSoapHttpPort() {
        return super.getPort(new QName("http://xmlns.oracle.com/apps/hr/service/", "AppModuleServiceSoapHttpPort"),
                             AppModuleService.class);
    }

    /**
     *
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns AppModuleService
     */
    @WebEndpoint(name = "AppModuleServiceSoapHttpPort")
    public AppModuleService getAppModuleServiceSoapHttpPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://xmlns.oracle.com/apps/hr/service/", "AppModuleServiceSoapHttpPort"),
                             AppModuleService.class, features);
    }

    private static URL __getWsdlLocation() {
        if (APPMODULESERVICE_EXCEPTION != null) {
            throw APPMODULESERVICE_EXCEPTION;
        }
        return APPMODULESERVICE_WSDL_LOCATION;
    }

}
