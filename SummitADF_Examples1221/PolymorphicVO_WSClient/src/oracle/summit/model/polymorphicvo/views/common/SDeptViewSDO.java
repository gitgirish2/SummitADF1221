
package oracle.summit.model.polymorphicvo.views.common;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SDeptViewSDO complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="SDeptViewSDO">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Id" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RegionId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
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
@XmlType(name = "SDeptViewSDO", propOrder = { "id", "name", "regionId", "sEmpView" })
public class SDeptViewSDO {

    @XmlElement(name = "Id")
    protected Integer id;
    @XmlElement(name = "Name")
    protected String name;
    @XmlElementRef(name = "RegionId", namespace = "/oracle/summit/model/polymorphicvo/views/common/",
                   type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> regionId;
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
