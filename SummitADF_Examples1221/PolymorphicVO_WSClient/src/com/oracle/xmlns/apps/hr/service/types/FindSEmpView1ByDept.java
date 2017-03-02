
package com.oracle.xmlns.apps.hr.service.types;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import com.oracle.xmlns.adf.svc.types.FindControl;
import com.oracle.xmlns.adf.svc.types.FindCriteria;


/**
 * <p>Java class for anonymous complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="findCriteria" type="{http://xmlns.oracle.com/adf/svc/types/}FindCriteria"/>
 *         &lt;element name="bv_dName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="findControl" type="{http://xmlns.oracle.com/adf/svc/types/}FindControl"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = { "findCriteria", "bvDName", "findControl" })
@XmlRootElement(name = "findSEmpView1ByDept")
public class FindSEmpView1ByDept {

    @XmlElement(required = true)
    protected FindCriteria findCriteria;
    @XmlElement(name = "bv_dName", required = true)
    protected String bvDName;
    @XmlElement(required = true)
    protected FindControl findControl;

    /**
     * Gets the value of the findCriteria property.
     *
     * @return
     *     possible object is
     *     {@link FindCriteria }
     *
     */
    public FindCriteria getFindCriteria() {
        return findCriteria;
    }

    /**
     * Sets the value of the findCriteria property.
     *
     * @param value
     *     allowed object is
     *     {@link FindCriteria }
     *
     */
    public void setFindCriteria(FindCriteria value) {
        this.findCriteria = value;
    }

    /**
     * Gets the value of the bvDName property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getBvDName() {
        return bvDName;
    }

    /**
     * Sets the value of the bvDName property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setBvDName(String value) {
        this.bvDName = value;
    }

    /**
     * Gets the value of the findControl property.
     *
     * @return
     *     possible object is
     *     {@link FindControl }
     *
     */
    public FindControl getFindControl() {
        return findControl;
    }

    /**
     * Sets the value of the findControl property.
     *
     * @param value
     *     allowed object is
     *     {@link FindControl }
     *
     */
    public void setFindControl(FindControl value) {
        this.findControl = value;
    }

}
