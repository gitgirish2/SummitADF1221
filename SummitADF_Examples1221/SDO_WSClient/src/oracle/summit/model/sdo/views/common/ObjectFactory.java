
package oracle.summit.model.sdo.views.common;

import java.math.BigDecimal;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each
 * Java content interface and Java element interface
 * generated in the oracle.summit.model.sdo.views.common package.
 * <p>An ObjectFactory allows you to programatically
 * construct new instances of the Java representation
 * for XML content. The Java representation of XML
 * content can consist of schema derived interfaces
 * and classes representing the binding of schema
 * type definitions, element declarations and model
 * groups.  Factory methods for each of these are
 * provided in this class.
 *
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _EmpViewSDO_QNAME = new QName("/oracle/summit/model/sdo/views/common/", "empViewSDO");
    private final static QName _DeptViewSDO_QNAME = new QName("/oracle/summit/model/sdo/views/common/", "deptViewSDO");
    private final static QName _EmpViewSDOStartDate_QNAME =
        new QName("/oracle/summit/model/sdo/views/common/", "StartDate");
    private final static QName _EmpViewSDOEmail_QNAME = new QName("/oracle/summit/model/sdo/views/common/", "Email");
    private final static QName _EmpViewSDORegionId_QNAME =
        new QName("/oracle/summit/model/sdo/views/common/", "RegionId");
    private final static QName _EmpViewSDOManagerId_QNAME =
        new QName("/oracle/summit/model/sdo/views/common/", "ManagerId");
    private final static QName _EmpViewSDOTitleId_QNAME =
        new QName("/oracle/summit/model/sdo/views/common/", "TitleId");
    private final static QName _EmpViewSDOUserid_QNAME = new QName("/oracle/summit/model/sdo/views/common/", "Userid");
    private final static QName _EmpViewSDOComments_QNAME =
        new QName("/oracle/summit/model/sdo/views/common/", "Comments");
    private final static QName _EmpViewSDODeptId_QNAME = new QName("/oracle/summit/model/sdo/views/common/", "DeptId");
    private final static QName _EmpViewSDOSalary_QNAME = new QName("/oracle/summit/model/sdo/views/common/", "Salary");
    private final static QName _EmpViewSDOFirstName_QNAME =
        new QName("/oracle/summit/model/sdo/views/common/", "FirstName");
    private final static QName _EmpViewSDOCommissionPct_QNAME =
        new QName("/oracle/summit/model/sdo/views/common/", "CommissionPct");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: oracle.summit.model.sdo.views.common
     *
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link DeptViewSDO }
     *
     */
    public DeptViewSDO createDeptViewSDO() {
        return new DeptViewSDO();
    }

    /**
     * Create an instance of {@link EmpViewSDO }
     *
     */
    public EmpViewSDO createEmpViewSDO() {
        return new EmpViewSDO();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EmpViewSDO }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "/oracle/summit/model/sdo/views/common/", name = "empViewSDO")
    public JAXBElement<EmpViewSDO> createEmpViewSDO(EmpViewSDO value) {
        return new JAXBElement<EmpViewSDO>(_EmpViewSDO_QNAME, EmpViewSDO.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeptViewSDO }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "/oracle/summit/model/sdo/views/common/", name = "deptViewSDO")
    public JAXBElement<DeptViewSDO> createDeptViewSDO(DeptViewSDO value) {
        return new JAXBElement<DeptViewSDO>(_DeptViewSDO_QNAME, DeptViewSDO.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "/oracle/summit/model/sdo/views/common/", name = "StartDate", scope = EmpViewSDO.class)
    public JAXBElement<XMLGregorianCalendar> createEmpViewSDOStartDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_EmpViewSDOStartDate_QNAME, XMLGregorianCalendar.class,
                                                     EmpViewSDO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "/oracle/summit/model/sdo/views/common/", name = "Email", scope = EmpViewSDO.class)
    public JAXBElement<String> createEmpViewSDOEmail(String value) {
        return new JAXBElement<String>(_EmpViewSDOEmail_QNAME, String.class, EmpViewSDO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "/oracle/summit/model/sdo/views/common/", name = "RegionId", scope = EmpViewSDO.class)
    public JAXBElement<Integer> createEmpViewSDORegionId(Integer value) {
        return new JAXBElement<Integer>(_EmpViewSDORegionId_QNAME, Integer.class, EmpViewSDO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "/oracle/summit/model/sdo/views/common/", name = "ManagerId", scope = EmpViewSDO.class)
    public JAXBElement<Integer> createEmpViewSDOManagerId(Integer value) {
        return new JAXBElement<Integer>(_EmpViewSDOManagerId_QNAME, Integer.class, EmpViewSDO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "/oracle/summit/model/sdo/views/common/", name = "TitleId", scope = EmpViewSDO.class)
    public JAXBElement<BigDecimal> createEmpViewSDOTitleId(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_EmpViewSDOTitleId_QNAME, BigDecimal.class, EmpViewSDO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "/oracle/summit/model/sdo/views/common/", name = "Userid", scope = EmpViewSDO.class)
    public JAXBElement<String> createEmpViewSDOUserid(String value) {
        return new JAXBElement<String>(_EmpViewSDOUserid_QNAME, String.class, EmpViewSDO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "/oracle/summit/model/sdo/views/common/", name = "Comments", scope = EmpViewSDO.class)
    public JAXBElement<String> createEmpViewSDOComments(String value) {
        return new JAXBElement<String>(_EmpViewSDOComments_QNAME, String.class, EmpViewSDO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "/oracle/summit/model/sdo/views/common/", name = "DeptId", scope = EmpViewSDO.class)
    public JAXBElement<Integer> createEmpViewSDODeptId(Integer value) {
        return new JAXBElement<Integer>(_EmpViewSDODeptId_QNAME, Integer.class, EmpViewSDO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "/oracle/summit/model/sdo/views/common/", name = "Salary", scope = EmpViewSDO.class)
    public JAXBElement<BigDecimal> createEmpViewSDOSalary(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_EmpViewSDOSalary_QNAME, BigDecimal.class, EmpViewSDO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "/oracle/summit/model/sdo/views/common/", name = "FirstName", scope = EmpViewSDO.class)
    public JAXBElement<String> createEmpViewSDOFirstName(String value) {
        return new JAXBElement<String>(_EmpViewSDOFirstName_QNAME, String.class, EmpViewSDO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "/oracle/summit/model/sdo/views/common/", name = "CommissionPct",
                    scope = EmpViewSDO.class)
    public JAXBElement<BigDecimal> createEmpViewSDOCommissionPct(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_EmpViewSDOCommissionPct_QNAME, BigDecimal.class, EmpViewSDO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "/oracle/summit/model/sdo/views/common/", name = "RegionId", scope = DeptViewSDO.class)
    public JAXBElement<Integer> createDeptViewSDORegionId(Integer value) {
        return new JAXBElement<Integer>(_EmpViewSDORegionId_QNAME, Integer.class, DeptViewSDO.class, value);
    }

}
