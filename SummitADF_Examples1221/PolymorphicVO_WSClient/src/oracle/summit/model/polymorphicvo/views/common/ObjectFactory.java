
package oracle.summit.model.polymorphicvo.views.common;

import java.math.BigDecimal;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each
 * Java content interface and Java element interface
 * generated in the oracle.summit.model.polymorphicvo.views.common package.
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

    private final static QName _SalespersonViewExSDOCommissionPct_QNAME =
        new QName("/oracle/summit/model/polymorphicvo/views/common/", "CommissionPct");
    private final static QName _SDeptViewSDO_QNAME =
        new QName("/oracle/summit/model/polymorphicvo/views/common/", "sDeptViewSDO");
    private final static QName _SEmpViewSDO_QNAME =
        new QName("/oracle/summit/model/polymorphicvo/views/common/", "sEmpViewSDO");
    private final static QName _SalespersonViewExSDO_QNAME =
        new QName("/oracle/summit/model/polymorphicvo/views/common/", "salespersonViewExSDO");
    private final static QName _SEmpViewSDOStartDate_QNAME =
        new QName("/oracle/summit/model/polymorphicvo/views/common/", "StartDate");
    private final static QName _SEmpViewSDOEmail_QNAME =
        new QName("/oracle/summit/model/polymorphicvo/views/common/", "Email");
    private final static QName _SEmpViewSDOComments_QNAME =
        new QName("/oracle/summit/model/polymorphicvo/views/common/", "Comments");
    private final static QName _SEmpViewSDODeptId_QNAME =
        new QName("/oracle/summit/model/polymorphicvo/views/common/", "DeptId");
    private final static QName _SEmpViewSDOManagerId_QNAME =
        new QName("/oracle/summit/model/polymorphicvo/views/common/", "ManagerId");
    private final static QName _SEmpViewSDOTitleId_QNAME =
        new QName("/oracle/summit/model/polymorphicvo/views/common/", "TitleId");
    private final static QName _SEmpViewSDOUserid_QNAME =
        new QName("/oracle/summit/model/polymorphicvo/views/common/", "Userid");
    private final static QName _SEmpViewSDOTitle_QNAME =
        new QName("/oracle/summit/model/polymorphicvo/views/common/", "Title");
    private final static QName _SEmpViewSDOSalary_QNAME =
        new QName("/oracle/summit/model/polymorphicvo/views/common/", "Salary");
    private final static QName _SEmpViewSDOFirstName_QNAME =
        new QName("/oracle/summit/model/polymorphicvo/views/common/", "FirstName");
    private final static QName _SDeptViewSDORegionId_QNAME =
        new QName("/oracle/summit/model/polymorphicvo/views/common/", "RegionId");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: oracle.summit.model.polymorphicvo.views.common
     *
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link SDeptViewSDO }
     *
     */
    public SDeptViewSDO createSDeptViewSDO() {
        return new SDeptViewSDO();
    }

    /**
     * Create an instance of {@link SEmpViewSDO }
     *
     */
    public SEmpViewSDO createSEmpViewSDO() {
        return new SEmpViewSDO();
    }

    /**
     * Create an instance of {@link SalespersonViewExSDO }
     *
     */
    public SalespersonViewExSDO createSalespersonViewExSDO() {
        return new SalespersonViewExSDO();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "/oracle/summit/model/polymorphicvo/views/common/", name = "CommissionPct",
                    scope = SalespersonViewExSDO.class)
    public JAXBElement<BigDecimal> createSalespersonViewExSDOCommissionPct(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_SalespersonViewExSDOCommissionPct_QNAME, BigDecimal.class,
                                           SalespersonViewExSDO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SDeptViewSDO }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "/oracle/summit/model/polymorphicvo/views/common/", name = "sDeptViewSDO")
    public JAXBElement<SDeptViewSDO> createSDeptViewSDO(SDeptViewSDO value) {
        return new JAXBElement<SDeptViewSDO>(_SDeptViewSDO_QNAME, SDeptViewSDO.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SEmpViewSDO }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "/oracle/summit/model/polymorphicvo/views/common/", name = "sEmpViewSDO")
    public JAXBElement<SEmpViewSDO> createSEmpViewSDO(SEmpViewSDO value) {
        return new JAXBElement<SEmpViewSDO>(_SEmpViewSDO_QNAME, SEmpViewSDO.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SalespersonViewExSDO }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "/oracle/summit/model/polymorphicvo/views/common/", name = "salespersonViewExSDO")
    public JAXBElement<SalespersonViewExSDO> createSalespersonViewExSDO(SalespersonViewExSDO value) {
        return new JAXBElement<SalespersonViewExSDO>(_SalespersonViewExSDO_QNAME, SalespersonViewExSDO.class, null,
                                                     value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "/oracle/summit/model/polymorphicvo/views/common/", name = "StartDate",
                    scope = SEmpViewSDO.class)
    public JAXBElement<XMLGregorianCalendar> createSEmpViewSDOStartDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_SEmpViewSDOStartDate_QNAME, XMLGregorianCalendar.class,
                                                     SEmpViewSDO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "/oracle/summit/model/polymorphicvo/views/common/", name = "Email",
                    scope = SEmpViewSDO.class)
    public JAXBElement<String> createSEmpViewSDOEmail(String value) {
        return new JAXBElement<String>(_SEmpViewSDOEmail_QNAME, String.class, SEmpViewSDO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "/oracle/summit/model/polymorphicvo/views/common/", name = "Comments",
                    scope = SEmpViewSDO.class)
    public JAXBElement<String> createSEmpViewSDOComments(String value) {
        return new JAXBElement<String>(_SEmpViewSDOComments_QNAME, String.class, SEmpViewSDO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "/oracle/summit/model/polymorphicvo/views/common/", name = "DeptId",
                    scope = SEmpViewSDO.class)
    public JAXBElement<Integer> createSEmpViewSDODeptId(Integer value) {
        return new JAXBElement<Integer>(_SEmpViewSDODeptId_QNAME, Integer.class, SEmpViewSDO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "/oracle/summit/model/polymorphicvo/views/common/", name = "ManagerId",
                    scope = SEmpViewSDO.class)
    public JAXBElement<Integer> createSEmpViewSDOManagerId(Integer value) {
        return new JAXBElement<Integer>(_SEmpViewSDOManagerId_QNAME, Integer.class, SEmpViewSDO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "/oracle/summit/model/polymorphicvo/views/common/", name = "TitleId",
                    scope = SEmpViewSDO.class)
    public JAXBElement<BigDecimal> createSEmpViewSDOTitleId(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_SEmpViewSDOTitleId_QNAME, BigDecimal.class, SEmpViewSDO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "/oracle/summit/model/polymorphicvo/views/common/", name = "Userid",
                    scope = SEmpViewSDO.class)
    public JAXBElement<String> createSEmpViewSDOUserid(String value) {
        return new JAXBElement<String>(_SEmpViewSDOUserid_QNAME, String.class, SEmpViewSDO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "/oracle/summit/model/polymorphicvo/views/common/", name = "Title",
                    scope = SEmpViewSDO.class)
    public JAXBElement<String> createSEmpViewSDOTitle(String value) {
        return new JAXBElement<String>(_SEmpViewSDOTitle_QNAME, String.class, SEmpViewSDO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "/oracle/summit/model/polymorphicvo/views/common/", name = "Salary",
                    scope = SEmpViewSDO.class)
    public JAXBElement<BigDecimal> createSEmpViewSDOSalary(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_SEmpViewSDOSalary_QNAME, BigDecimal.class, SEmpViewSDO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "/oracle/summit/model/polymorphicvo/views/common/", name = "FirstName",
                    scope = SEmpViewSDO.class)
    public JAXBElement<String> createSEmpViewSDOFirstName(String value) {
        return new JAXBElement<String>(_SEmpViewSDOFirstName_QNAME, String.class, SEmpViewSDO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "/oracle/summit/model/polymorphicvo/views/common/", name = "RegionId",
                    scope = SDeptViewSDO.class)
    public JAXBElement<Integer> createSDeptViewSDORegionId(Integer value) {
        return new JAXBElement<Integer>(_SDeptViewSDORegionId_QNAME, Integer.class, SDeptViewSDO.class, value);
    }

}
