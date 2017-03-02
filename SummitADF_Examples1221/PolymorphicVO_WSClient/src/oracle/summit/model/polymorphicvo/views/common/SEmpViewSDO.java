
package oracle.summit.model.polymorphicvo.views.common;

import java.math.BigDecimal;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for SEmpViewSDO complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="SEmpViewSDO">
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
 *         &lt;element name="Title" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TitleId1" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Id1" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="SEmpView" type="{/oracle/summit/model/polymorphicvo/views/common/}SEmpViewSDO" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SEmpViewSDO", propOrder = {
         "id", "lastName", "firstName", "userid", "email", "startDate", "comments", "managerId", "titleId", "deptId",
         "salary", "title", "titleId1", "name", "id1", "sEmpView"
    })
@XmlSeeAlso({ SalespersonViewExSDO.class })
public class SEmpViewSDO {

    @XmlElement(name = "Id")
    protected Integer id;
    @XmlElement(name = "LastName")
    protected String lastName;
    @XmlElementRef(name = "FirstName", namespace = "/oracle/summit/model/polymorphicvo/views/common/",
                   type = JAXBElement.class, required = false)
    protected JAXBElement<String> firstName;
    @XmlElementRef(name = "Userid", namespace = "/oracle/summit/model/polymorphicvo/views/common/",
                   type = JAXBElement.class, required = false)
    protected JAXBElement<String> userid;
    @XmlElementRef(name = "Email", namespace = "/oracle/summit/model/polymorphicvo/views/common/",
                   type = JAXBElement.class, required = false)
    protected JAXBElement<String> email;
    @XmlElementRef(name = "StartDate", namespace = "/oracle/summit/model/polymorphicvo/views/common/",
                   type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> startDate;
    @XmlElementRef(name = "Comments", namespace = "/oracle/summit/model/polymorphicvo/views/common/",
                   type = JAXBElement.class, required = false)
    protected JAXBElement<String> comments;
    @XmlElementRef(name = "ManagerId", namespace = "/oracle/summit/model/polymorphicvo/views/common/",
                   type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> managerId;
    @XmlElementRef(name = "TitleId", namespace = "/oracle/summit/model/polymorphicvo/views/common/",
                   type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> titleId;
    @XmlElementRef(name = "DeptId", namespace = "/oracle/summit/model/polymorphicvo/views/common/",
                   type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> deptId;
    @XmlElementRef(name = "Salary", namespace = "/oracle/summit/model/polymorphicvo/views/common/",
                   type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> salary;
    @XmlElementRef(name = "Title", namespace = "/oracle/summit/model/polymorphicvo/views/common/",
                   type = JAXBElement.class, required = false)
    protected JAXBElement<String> title;
    @XmlElement(name = "TitleId1")
    protected Integer titleId1;
    @XmlElement(name = "Name")
    protected String name;
    @XmlElement(name = "Id1")
    protected Integer id1;
    @XmlElement(name = "SEmpView")
    protected List<SEmpViewSDO> sEmpView;

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
     * Gets the value of the title property.
     *
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public JAXBElement<String> getTitle() {
        return title;
    }

    /**
     * Sets the value of the title property.
     *
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public void setTitle(JAXBElement<String> value) {
        this.title = value;
    }

    /**
     * Gets the value of the titleId1 property.
     *
     * @return
     *     possible object is
     *     {@link Integer }
     *
     */
    public Integer getTitleId1() {
        return titleId1;
    }

    /**
     * Sets the value of the titleId1 property.
     *
     * @param value
     *     allowed object is
     *     {@link Integer }
     *
     */
    public void setTitleId1(Integer value) {
        this.titleId1 = value;
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
     * Gets the value of the sEmpView property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the sEmpView property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSEmpView().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SEmpViewSDO }
     *
     *
     */
    public List<SEmpViewSDO> getSEmpView() {
        if (sEmpView == null) {
            sEmpView = new ArrayList<SEmpViewSDO>();
        }
        return this.sEmpView;
    }

}
