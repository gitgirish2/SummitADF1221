
package oracle.summit.model.sdo.service.common;

import javax.xml.ws.WebFault;

import com.oracle.xmlns.adf.svc.errors.ServiceErrorMessage;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.10-b140319.1121
 * Generated source version: 2.2
 *
 */
@WebFault(name = "ServiceErrorMessage", targetNamespace = "http://xmlns.oracle.com/adf/svc/errors/")
public class ServiceException extends Exception {

    /**
     * Java type that goes as soapenv:Fault detail element.
     *
     */
    private ServiceErrorMessage faultInfo;

    /**
     *
     * @param message
     * @param faultInfo
     */
    public ServiceException(String message, ServiceErrorMessage faultInfo) {
        super(message);
        this.faultInfo = faultInfo;
    }

    /**
     *
     * @param message
     * @param faultInfo
     * @param cause
     */
    public ServiceException(String message, ServiceErrorMessage faultInfo, Throwable cause) {
        super(message, cause);
        this.faultInfo = faultInfo;
    }

    /**
     *
     * @return
     *     returns fault bean: com.oracle.xmlns.adf.svc.errors.ServiceErrorMessage
     */
    public ServiceErrorMessage getFaultInfo() {
        return faultInfo;
    }

}
