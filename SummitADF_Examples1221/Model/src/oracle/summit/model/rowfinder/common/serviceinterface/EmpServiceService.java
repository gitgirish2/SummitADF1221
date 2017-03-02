package oracle.summit.model.rowfinder.common.serviceinterface;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.soap.SOAPBinding;

import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

import oracle.jbo.service.errors.ServiceException;

import oracle.summit.model.rowfinder.common.EmpViewSDO;

import oracle.webservices.annotations.PortableWebService;
import oracle.webservices.annotations.SDODatabinding;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Wed Jan 21 15:17:00 CST 2015
// ---------------------------------------------------------------------
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.WRAPPED, style = SOAPBinding.Style.DOCUMENT)
@PortableWebService(targetNamespace = "/oracle/summit/model/rowfinder/common/", name = "EmpServiceService",
                    wsdlLocation = "oracle/summit/model/rowfinder/common/serviceinterface/EmpServiceService.wsdl")
@SDODatabinding(schemaLocation = "oracle/summit/model/rowfinder/common/serviceinterface/EmpServiceService.xsd")
public interface EmpServiceService {
    public static final String NAME = "{/oracle/summit/model/rowfinder/common/}EmpServiceService";

    @WebMethod(action = "/oracle/summit/model/rowfinder/common/createEmpView1", operationName = "createEmpView1")
    @RequestWrapper(targetNamespace = "/oracle/summit/model/rowfinder/common/types/", localName = "createEmpView1")
    @ResponseWrapper(targetNamespace = "/oracle/summit/model/rowfinder/common/types/",
                     localName = "createEmpView1Response")
    @WebResult(name = "result")
    EmpViewSDO createEmpView1(@WebParam(mode = WebParam.Mode.IN, name = "empView1")
                              EmpViewSDO empView1) throws ServiceException;

    @WebMethod(action = "/oracle/summit/model/rowfinder/common/updateEmpView1", operationName = "updateEmpView1")
    @RequestWrapper(targetNamespace = "/oracle/summit/model/rowfinder/common/types/", localName = "updateEmpView1")
    @ResponseWrapper(targetNamespace = "/oracle/summit/model/rowfinder/common/types/",
                     localName = "updateEmpView1Response")
    @WebResult(name = "result")
    EmpViewSDO updateEmpView1(@WebParam(mode = WebParam.Mode.IN, name = "empView1")
                              EmpViewSDO empView1) throws ServiceException;

    @WebMethod(action = "/oracle/summit/model/rowfinder/common/deleteEmpView1", operationName = "deleteEmpView1")
    @RequestWrapper(targetNamespace = "/oracle/summit/model/rowfinder/common/types/", localName = "deleteEmpView1")
    @ResponseWrapper(targetNamespace = "/oracle/summit/model/rowfinder/common/types/",
                     localName = "deleteEmpView1Response")
    void deleteEmpView1(@WebParam(mode = WebParam.Mode.IN, name = "empView1")
                        EmpViewSDO empView1) throws ServiceException;
}
