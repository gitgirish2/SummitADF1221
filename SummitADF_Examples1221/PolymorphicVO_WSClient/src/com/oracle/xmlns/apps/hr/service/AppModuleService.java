
package com.oracle.xmlns.apps.hr.service;

import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;

import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

import com.oracle.xmlns.adf.svc.types.FindControl;
import com.oracle.xmlns.adf.svc.types.FindCriteria;
import com.oracle.xmlns.adf.svc.types.ProcessControl;

import oracle.summit.model.polymorphicvo.views.common.SDeptViewSDO;
import oracle.summit.model.polymorphicvo.views.common.SEmpViewSDO;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.10-b140319.1121
 * Generated source version: 2.2
 *
 */
@WebService(name = "AppModuleService", targetNamespace = "http://xmlns.oracle.com/apps/hr/service/")
@XmlSeeAlso({
            com.oracle.xmlns.adf.svc.errors.ObjectFactory.class, com.oracle.xmlns.adf.svc.types.ObjectFactory.class,
            com.oracle.xmlns.apps.hr.service.types.ObjectFactory.class,
            oracle.summit.model.polymorphicvo.views.common.ObjectFactory.class, sdo.commonj.ObjectFactory.class,
            sdo.commonj.java.ObjectFactory.class, sdo.commonj.xml.ObjectFactory.class
    })
public interface AppModuleService {


    /**
     *
     * @param id
     * @return
     *     returns oracle.summit.model.polymorphicvo.views.common.SDeptViewSDO
     * @throws ServiceException
     */
    @WebMethod(action = "http://xmlns.oracle.com/apps/hr/service/getSDeptView1")
    @WebResult(name = "result", targetNamespace = "http://xmlns.oracle.com/apps/hr/service/types/")
    @RequestWrapper(localName = "getSDeptView1", targetNamespace = "http://xmlns.oracle.com/apps/hr/service/types/",
                    className = "com.oracle.xmlns.apps.hr.service.types.GetSDeptView1")
    @ResponseWrapper(localName = "getSDeptView1Response",
                     targetNamespace = "http://xmlns.oracle.com/apps/hr/service/types/",
                     className = "com.oracle.xmlns.apps.hr.service.types.GetSDeptView1Response")
    public SDeptViewSDO getSDeptView1(@WebParam(name = "id",
                                                targetNamespace = "http://xmlns.oracle.com/apps/hr/service/types/")
                                      int id) throws ServiceException;

    /**
     *
     * @param sDeptView1
     * @return
     *     returns oracle.summit.model.polymorphicvo.views.common.SDeptViewSDO
     * @throws ServiceException
     */
    @WebMethod(action = "http://xmlns.oracle.com/apps/hr/service/createSDeptView1")
    @WebResult(name = "result", targetNamespace = "http://xmlns.oracle.com/apps/hr/service/types/")
    @RequestWrapper(localName = "createSDeptView1", targetNamespace = "http://xmlns.oracle.com/apps/hr/service/types/",
                    className = "com.oracle.xmlns.apps.hr.service.types.CreateSDeptView1")
    @ResponseWrapper(localName = "createSDeptView1Response",
                     targetNamespace = "http://xmlns.oracle.com/apps/hr/service/types/",
                     className = "com.oracle.xmlns.apps.hr.service.types.CreateSDeptView1Response")
    public SDeptViewSDO createSDeptView1(@WebParam(name = "sDeptView1",
                                                   targetNamespace = "http://xmlns.oracle.com/apps/hr/service/types/")
                                         SDeptViewSDO sDeptView1) throws ServiceException;

    /**
     *
     * @param sDeptView1
     * @return
     *     returns oracle.summit.model.polymorphicvo.views.common.SDeptViewSDO
     * @throws ServiceException
     */
    @WebMethod(action = "http://xmlns.oracle.com/apps/hr/service/updateSDeptView1")
    @WebResult(name = "result", targetNamespace = "http://xmlns.oracle.com/apps/hr/service/types/")
    @RequestWrapper(localName = "updateSDeptView1", targetNamespace = "http://xmlns.oracle.com/apps/hr/service/types/",
                    className = "com.oracle.xmlns.apps.hr.service.types.UpdateSDeptView1")
    @ResponseWrapper(localName = "updateSDeptView1Response",
                     targetNamespace = "http://xmlns.oracle.com/apps/hr/service/types/",
                     className = "com.oracle.xmlns.apps.hr.service.types.UpdateSDeptView1Response")
    public SDeptViewSDO updateSDeptView1(@WebParam(name = "sDeptView1",
                                                   targetNamespace = "http://xmlns.oracle.com/apps/hr/service/types/")
                                         SDeptViewSDO sDeptView1) throws ServiceException;

    /**
     *
     * @param sDeptView1
     * @throws ServiceException
     */
    @WebMethod(action = "http://xmlns.oracle.com/apps/hr/service/deleteSDeptView1")
    @RequestWrapper(localName = "deleteSDeptView1", targetNamespace = "http://xmlns.oracle.com/apps/hr/service/types/",
                    className = "com.oracle.xmlns.apps.hr.service.types.DeleteSDeptView1")
    @ResponseWrapper(localName = "deleteSDeptView1Response",
                     targetNamespace = "http://xmlns.oracle.com/apps/hr/service/types/",
                     className = "com.oracle.xmlns.apps.hr.service.types.DeleteSDeptView1Response")
    public void deleteSDeptView1(@WebParam(name = "sDeptView1",
                                           targetNamespace = "http://xmlns.oracle.com/apps/hr/service/types/")
                                 SDeptViewSDO sDeptView1) throws ServiceException;

    /**
     *
     * @param sDeptView1
     * @return
     *     returns oracle.summit.model.polymorphicvo.views.common.SDeptViewSDO
     * @throws ServiceException
     */
    @WebMethod(action = "http://xmlns.oracle.com/apps/hr/service/mergeSDeptView1")
    @WebResult(name = "result", targetNamespace = "http://xmlns.oracle.com/apps/hr/service/types/")
    @RequestWrapper(localName = "mergeSDeptView1", targetNamespace = "http://xmlns.oracle.com/apps/hr/service/types/",
                    className = "com.oracle.xmlns.apps.hr.service.types.MergeSDeptView1")
    @ResponseWrapper(localName = "mergeSDeptView1Response",
                     targetNamespace = "http://xmlns.oracle.com/apps/hr/service/types/",
                     className = "com.oracle.xmlns.apps.hr.service.types.MergeSDeptView1Response")
    public SDeptViewSDO mergeSDeptView1(@WebParam(name = "sDeptView1",
                                                  targetNamespace = "http://xmlns.oracle.com/apps/hr/service/types/")
                                        SDeptViewSDO sDeptView1) throws ServiceException;

    /**
     *
     * @param findControl
     * @param findCriteria
     * @return
     *     returns java.util.List<oracle.summit.model.polymorphicvo.views.common.SDeptViewSDO>
     * @throws ServiceException
     */
    @WebMethod(action = "http://xmlns.oracle.com/apps/hr/service/findSDeptView1")
    @WebResult(name = "result", targetNamespace = "http://xmlns.oracle.com/apps/hr/service/types/")
    @RequestWrapper(localName = "findSDeptView1", targetNamespace = "http://xmlns.oracle.com/apps/hr/service/types/",
                    className = "com.oracle.xmlns.apps.hr.service.types.FindSDeptView1")
    @ResponseWrapper(localName = "findSDeptView1Response",
                     targetNamespace = "http://xmlns.oracle.com/apps/hr/service/types/",
                     className = "com.oracle.xmlns.apps.hr.service.types.FindSDeptView1Response")
    public List<SDeptViewSDO> findSDeptView1(@WebParam(name = "findCriteria",
                                                       targetNamespace =
                                                       "http://xmlns.oracle.com/apps/hr/service/types/")
                                             FindCriteria findCriteria,
                                             @WebParam(name = "findControl",
                                                       targetNamespace =
                                                       "http://xmlns.oracle.com/apps/hr/service/types/")
                                             FindControl findControl) throws ServiceException;

    /**
     *
     * @param processControl
     * @param sDeptView1
     * @param changeOperation
     * @return
     *     returns java.util.List<oracle.summit.model.polymorphicvo.views.common.SDeptViewSDO>
     * @throws ServiceException
     */
    @WebMethod(action = "http://xmlns.oracle.com/apps/hr/service/processSDeptView1")
    @WebResult(name = "result", targetNamespace = "http://xmlns.oracle.com/apps/hr/service/types/")
    @RequestWrapper(localName = "processSDeptView1", targetNamespace = "http://xmlns.oracle.com/apps/hr/service/types/",
                    className = "com.oracle.xmlns.apps.hr.service.types.ProcessSDeptView1")
    @ResponseWrapper(localName = "processSDeptView1Response",
                     targetNamespace = "http://xmlns.oracle.com/apps/hr/service/types/",
                     className = "com.oracle.xmlns.apps.hr.service.types.ProcessSDeptView1Response")
    public List<SDeptViewSDO> processSDeptView1(@WebParam(name = "changeOperation",
                                                          targetNamespace =
                                                          "http://xmlns.oracle.com/apps/hr/service/types/")
                                                String changeOperation,
                                                @WebParam(name = "sDeptView1",
                                                          targetNamespace =
                                                          "http://xmlns.oracle.com/apps/hr/service/types/")
                                                List<SDeptViewSDO> sDeptView1,
                                                @WebParam(name = "processControl",
                                                          targetNamespace =
                                                          "http://xmlns.oracle.com/apps/hr/service/types/")
                                                ProcessControl processControl) throws ServiceException;

    /**
     *
     * @param id
     * @return
     *     returns oracle.summit.model.polymorphicvo.views.common.SEmpViewSDO
     * @throws ServiceException
     */
    @WebMethod(action = "http://xmlns.oracle.com/apps/hr/service/getSEmpView1")
    @WebResult(name = "result", targetNamespace = "http://xmlns.oracle.com/apps/hr/service/types/")
    @RequestWrapper(localName = "getSEmpView1", targetNamespace = "http://xmlns.oracle.com/apps/hr/service/types/",
                    className = "com.oracle.xmlns.apps.hr.service.types.GetSEmpView1")
    @ResponseWrapper(localName = "getSEmpView1Response",
                     targetNamespace = "http://xmlns.oracle.com/apps/hr/service/types/",
                     className = "com.oracle.xmlns.apps.hr.service.types.GetSEmpView1Response")
    public SEmpViewSDO getSEmpView1(@WebParam(name = "id",
                                              targetNamespace = "http://xmlns.oracle.com/apps/hr/service/types/")
                                    int id) throws ServiceException;

    /**
     *
     * @param sEmpView1
     * @return
     *     returns oracle.summit.model.polymorphicvo.views.common.SEmpViewSDO
     * @throws ServiceException
     */
    @WebMethod(action = "http://xmlns.oracle.com/apps/hr/service/createSEmpView1")
    @WebResult(name = "result", targetNamespace = "http://xmlns.oracle.com/apps/hr/service/types/")
    @RequestWrapper(localName = "createSEmpView1", targetNamespace = "http://xmlns.oracle.com/apps/hr/service/types/",
                    className = "com.oracle.xmlns.apps.hr.service.types.CreateSEmpView1")
    @ResponseWrapper(localName = "createSEmpView1Response",
                     targetNamespace = "http://xmlns.oracle.com/apps/hr/service/types/",
                     className = "com.oracle.xmlns.apps.hr.service.types.CreateSEmpView1Response")
    public SEmpViewSDO createSEmpView1(@WebParam(name = "sEmpView1",
                                                 targetNamespace = "http://xmlns.oracle.com/apps/hr/service/types/")
                                       SEmpViewSDO sEmpView1) throws ServiceException;

    /**
     *
     * @param sEmpView1
     * @return
     *     returns oracle.summit.model.polymorphicvo.views.common.SEmpViewSDO
     * @throws ServiceException
     */
    @WebMethod(action = "http://xmlns.oracle.com/apps/hr/service/updateSEmpView1")
    @WebResult(name = "result", targetNamespace = "http://xmlns.oracle.com/apps/hr/service/types/")
    @RequestWrapper(localName = "updateSEmpView1", targetNamespace = "http://xmlns.oracle.com/apps/hr/service/types/",
                    className = "com.oracle.xmlns.apps.hr.service.types.UpdateSEmpView1")
    @ResponseWrapper(localName = "updateSEmpView1Response",
                     targetNamespace = "http://xmlns.oracle.com/apps/hr/service/types/",
                     className = "com.oracle.xmlns.apps.hr.service.types.UpdateSEmpView1Response")
    public SEmpViewSDO updateSEmpView1(@WebParam(name = "sEmpView1",
                                                 targetNamespace = "http://xmlns.oracle.com/apps/hr/service/types/")
                                       SEmpViewSDO sEmpView1) throws ServiceException;

    /**
     *
     * @param sEmpView1
     * @throws ServiceException
     */
    @WebMethod(action = "http://xmlns.oracle.com/apps/hr/service/deleteSEmpView1")
    @RequestWrapper(localName = "deleteSEmpView1", targetNamespace = "http://xmlns.oracle.com/apps/hr/service/types/",
                    className = "com.oracle.xmlns.apps.hr.service.types.DeleteSEmpView1")
    @ResponseWrapper(localName = "deleteSEmpView1Response",
                     targetNamespace = "http://xmlns.oracle.com/apps/hr/service/types/",
                     className = "com.oracle.xmlns.apps.hr.service.types.DeleteSEmpView1Response")
    public void deleteSEmpView1(@WebParam(name = "sEmpView1",
                                          targetNamespace = "http://xmlns.oracle.com/apps/hr/service/types/")
                                SEmpViewSDO sEmpView1) throws ServiceException;

    /**
     *
     * @param sEmpView1
     * @return
     *     returns oracle.summit.model.polymorphicvo.views.common.SEmpViewSDO
     * @throws ServiceException
     */
    @WebMethod(action = "http://xmlns.oracle.com/apps/hr/service/mergeSEmpView1")
    @WebResult(name = "result", targetNamespace = "http://xmlns.oracle.com/apps/hr/service/types/")
    @RequestWrapper(localName = "mergeSEmpView1", targetNamespace = "http://xmlns.oracle.com/apps/hr/service/types/",
                    className = "com.oracle.xmlns.apps.hr.service.types.MergeSEmpView1")
    @ResponseWrapper(localName = "mergeSEmpView1Response",
                     targetNamespace = "http://xmlns.oracle.com/apps/hr/service/types/",
                     className = "com.oracle.xmlns.apps.hr.service.types.MergeSEmpView1Response")
    public SEmpViewSDO mergeSEmpView1(@WebParam(name = "sEmpView1",
                                                targetNamespace = "http://xmlns.oracle.com/apps/hr/service/types/")
                                      SEmpViewSDO sEmpView1) throws ServiceException;

    /**
     *
     * @param findControl
     * @param findCriteria
     * @return
     *     returns java.util.List<oracle.summit.model.polymorphicvo.views.common.SEmpViewSDO>
     * @throws ServiceException
     */
    @WebMethod(action = "http://xmlns.oracle.com/apps/hr/service/findSEmpView1")
    @WebResult(name = "result", targetNamespace = "http://xmlns.oracle.com/apps/hr/service/types/")
    @RequestWrapper(localName = "findSEmpView1", targetNamespace = "http://xmlns.oracle.com/apps/hr/service/types/",
                    className = "com.oracle.xmlns.apps.hr.service.types.FindSEmpView1")
    @ResponseWrapper(localName = "findSEmpView1Response",
                     targetNamespace = "http://xmlns.oracle.com/apps/hr/service/types/",
                     className = "com.oracle.xmlns.apps.hr.service.types.FindSEmpView1Response")
    public List<SEmpViewSDO> findSEmpView1(@WebParam(name = "findCriteria",
                                                     targetNamespace = "http://xmlns.oracle.com/apps/hr/service/types/")
                                           FindCriteria findCriteria,
                                           @WebParam(name = "findControl",
                                                     targetNamespace = "http://xmlns.oracle.com/apps/hr/service/types/")
                                           FindControl findControl) throws ServiceException;

    /**
     *
     * @param findControl
     * @param bvDName
     * @param findCriteria
     * @return
     *     returns java.util.List<oracle.summit.model.polymorphicvo.views.common.SEmpViewSDO>
     * @throws ServiceException
     */
    @WebMethod(action = "http://xmlns.oracle.com/apps/hr/service/findSEmpView1ByDept")
    @WebResult(name = "result", targetNamespace = "http://xmlns.oracle.com/apps/hr/service/types/")
    @RequestWrapper(localName = "findSEmpView1ByDept",
                    targetNamespace = "http://xmlns.oracle.com/apps/hr/service/types/",
                    className = "com.oracle.xmlns.apps.hr.service.types.FindSEmpView1ByDept")
    @ResponseWrapper(localName = "findSEmpView1ByDeptResponse",
                     targetNamespace = "http://xmlns.oracle.com/apps/hr/service/types/",
                     className = "com.oracle.xmlns.apps.hr.service.types.FindSEmpView1ByDeptResponse")
    public List<SEmpViewSDO> findSEmpView1ByDept(@WebParam(name = "findCriteria",
                                                           targetNamespace =
                                                           "http://xmlns.oracle.com/apps/hr/service/types/")
                                                 FindCriteria findCriteria,
                                                 @WebParam(name = "bv_dName",
                                                           targetNamespace =
                                                           "http://xmlns.oracle.com/apps/hr/service/types/")
                                                 String bvDName,
                                                 @WebParam(name = "findControl",
                                                           targetNamespace =
                                                           "http://xmlns.oracle.com/apps/hr/service/types/")
                                                 FindControl findControl) throws ServiceException;

    /**
     *
     * @param processControl
     * @param sEmpView1
     * @param changeOperation
     * @return
     *     returns java.util.List<oracle.summit.model.polymorphicvo.views.common.SEmpViewSDO>
     * @throws ServiceException
     */
    @WebMethod(action = "http://xmlns.oracle.com/apps/hr/service/processSEmpView1")
    @WebResult(name = "result", targetNamespace = "http://xmlns.oracle.com/apps/hr/service/types/")
    @RequestWrapper(localName = "processSEmpView1", targetNamespace = "http://xmlns.oracle.com/apps/hr/service/types/",
                    className = "com.oracle.xmlns.apps.hr.service.types.ProcessSEmpView1")
    @ResponseWrapper(localName = "processSEmpView1Response",
                     targetNamespace = "http://xmlns.oracle.com/apps/hr/service/types/",
                     className = "com.oracle.xmlns.apps.hr.service.types.ProcessSEmpView1Response")
    public List<SEmpViewSDO> processSEmpView1(@WebParam(name = "changeOperation",
                                                        targetNamespace =
                                                        "http://xmlns.oracle.com/apps/hr/service/types/")
                                              String changeOperation,
                                              @WebParam(name = "sEmpView1",
                                                        targetNamespace =
                                                        "http://xmlns.oracle.com/apps/hr/service/types/")
                                              List<SEmpViewSDO> sEmpView1,
                                              @WebParam(name = "processControl",
                                                        targetNamespace =
                                                        "http://xmlns.oracle.com/apps/hr/service/types/")
                                              ProcessControl processControl) throws ServiceException;

}
