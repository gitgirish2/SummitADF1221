
package oracle.summit.model.sdo.views.common;

import java.math.BigDecimal;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for EmpViewSDO complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="EmpViewSDO">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Id" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="LastName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FirstName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Userid" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Email" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="StartDate" type="{http://xmlns.oracle.com/adf/svc/types/}date-Date" minOccurs="0"/>
 *         &lt;element name="Comments" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ManagerId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="TitleId" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="DeptId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="Salary" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="CommissionPct" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="Id1" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RegionId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="EmpView" type="{/oracle/summit/model/sdo/views/common/}EmpViewSDO" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EmpViewSDO", propOrder = {
         "id", "lastName", "firstName", "userid", "email", "startDate", "comments", "managerId", "titleId", "deptId",
         "salary", "commissionPct", "id1", "name", "regionId", "empView"
    })
public class EmpViewSDO {

    @XmlElement(name = "Id")
    protected Integer id;
    @XmlElement(name = "LastName")
    protected String lastName;
    @XmlElementRef(name = "FirstName", namespace = "/oracle/summit/model/sdo/views/common/", type = JAXBElement.class,
                   required = false)
    protected JAXBElement<String> firstName;
    @XmlElementRef(name = "Userid", namespace = "/oracle/summit/model/sdo/views/common/", type = JAXBElement.class,
                   required = false)
    protected JAXBElement<String> userid;
    @XmlElementRef(name = "Email", namespace = "/oracle/summit/model/sdo/views/common/", type = JAXBElement.class,
                   required = false)
    protected JAXBElement<String> email;
    @XmlElementRef(name = "StartDate", namespace = "/oracle/summit/model/sdo/views/common/", type = JAXBElement.class,
                   required = false)
    protected JAXBElement<XMLGregorianCalendar> startDate;
    @XmlElementRef(name = "Comments", namespace = "/oracle/summit/model/sdo/views/common/", type = JAXBElement.class,
                   required = false)
    protected JAXBElement<String> comments;
    @XmlElementRef(name = "ManagerId", namespace = "/oracle/summit/model/sdo/views/common/", type = JAXBElement.class,
                   required = false)
    protected JAXBElement<Integer> managerId;
    @XmlElementRef(name = "TitleId", namespace = "/oracle/summit/model/sdo/views/common/", type = JAXBElement.class,
                   required = false)
    protected JAXBElement<BigDecimal> titleId;
    @XmlElementRef(name = "DeptId", namespace = "/oracle/summit/model/sdo/views/common/", type = JAXBElement.class,
                   required = false)
    protected JAXBElement<Integer> deptId;
    @XmlElementRef(name = "Salary", namespace = "/oracle/summit/model/sdo/views/common/", type = JAXBElement.class,
                   required = false)
    protected JAXBElement<BigDecimal> salary;
    @XmlElementRef(name = "CommissionPct", namespace = "/oracle/summit/model/sdo/views/common/",
                   type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> commissionPct;
    @XmlElement(name = "Id1")
    protected Integer id1;
    @XmlElement(name = "Name")
    protected String name;
    @XmlElementRef(name = "RegionId", namespace = "/oracle/summit/model/sdo/views/common/", type = JAXBElement.class,
                   required = false)
    protected JAXBElement<Integer> regionId;
    @XmlElement(name = "EmpView")
    protected List<EmpViewSDO> empView;

    /**
     * Gets the value of the id property.
     *
     * @return
     *     possible object is
     *     {@link Integer }
     *
     */
    public Integer getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     *
     * @param value
     *     allowed object is
     *     {@link Integer }
     *
     */
    public void setId(Integer value) {
        this.id = value;
    }

    /**
     * Gets the value of the lastName property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * Sets the value of the lastName property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setLastName(String value) {
        this.lastName = value;
    }

    /**
     * Gets the value of the firstName property.
     *
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public JAXBElement<String> getFirstName() {
        return firstName;
    }

    /**
     * Sets the value of the firstName property.
     *
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public void setFirstName(JAXBElement<String> value) {
        this.firstName = value;
    }

    /**
     * Gets the value of the userid property.
     *
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public JAXBElement<String> getUserid() {
        return userid;
    }

    /**
     * Sets the value of the userid property.
     *
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public void setUserid(JAXBElement<String> value) {
        this.userid = value;
    }

    /**
     * Gets the value of the email property.
     *
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public JAXBElement<String> getEmail() {
        return email;
    }

    /**
     * Sets the value of the email property.
     *
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public void setEmail(JAXBElement<String> value) {
        this.email = value;
    }

    /**
     * Gets the value of the startDate property.
     *
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *
     */
    public JAXBElement<XMLGregorianCalendar> getStartDate() {
        return startDate;
    }

    /**
     * Sets the value of the startDate property.
     *
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *
     */
    public void setStartDate(JAXBElement<XMLGregorianCalendar> value) {
        this.startDate = value;
    }

    /**
     * Gets the value of the comments property.
     *
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public JAXBElement<String> getComments() {
        return comments;
    }

    /**
     * Sets the value of the comments property.
     *
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public void setComments(JAXBElement<String> value) {
        this.comments = value;
    }

    /**
     * Gets the value of the managerId property.
     *
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *
     */
    public JAXBElement<Integer> getManagerId() {
        return managerId;
    }

    /**
     * Sets the value of the managerId property.
     *
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *
     */
    public void setManagerId(JAXBElement<Integer> value) {
        this.managerId = value;
    }

    /**
     * Gets the value of the titleId property.
     *
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *
     */
    public JAXBElement<BigDecimal> getTitleId() {
        return titleId;
    }

    /**
     * Sets the value of the titleId property.
     *
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *
     */
    public void setTitleId(JAXBElement<BigDecimal> value) {
        this.titleId = value;
    }

    /**
     * Gets the value of the deptId property.
     *
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *
     */
    public JAXBElement<Integer> getDeptId() {
        return deptId;
    }

    /**
     * Sets the value of the deptId property.
     *
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *
     */
    public void setDeptId(JAXBElement<Integer> value) {
        this.deptId = value;
    }

    /**
     * Gets the value of the salary property.
     *
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *
     */
    public JAXBElement<BigDecimal> getSalary() {
        return salary;
    }

    /**
     * Sets the value of the salary property.
     *
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *
     */
    public void setSalary(JAXBElement<BigDecimal> value) {
        this.salary = value;
    }

    /**
     * Gets the value of the commissionPct property.
     *
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *
     */
    public JAXBElement<BigDecimal> getCommissionPct() {
        return commissionPct;
    }

    /**
     * Sets the value of the commissionPct property.
     *
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *
     */
    public void setCommissionPct(JAXBElement<BigDecimal> value) {
        this.commissionPct = value;
    }

    /**
     * Gets the value of the id1 property.
     *
     * @return
     *     possible object is
     *     {@link Integer }
     *
     */
    public Integer getId1() {
        return id1;
    }

    /**
     * Sets the value of the id1 property.
     *
     * @param value
     *     allowed object is
     *     {@link Integer }
     *
     */
    public void setId1(Integer value) {
        this.id1 = value;
    }

    /**
     * Gets the value of the name property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the regionId property.
     *
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *
     */
    public JAXBElement<Integer> getRegionId() {
        return regionId;
    }

    /**
     * Sets the value of the regionId property.
     *
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *
     */
    public void setRegionId(JAXBElement<Integer> value) {
        this.regionId = value;
    }

    /**
     * Gets the value of the empView property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the empView property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEmpView().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EmpViewSDO }
     *
     *
     */
    public List<EmpViewSDO> getEmpView() {
        if (empView == null) {
            empView = new ArrayList<EmpViewSDO>();
        }
        return this.empView;
    }

}
