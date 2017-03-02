
package com.oracle.xmlns.apps.hr.service.types;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import com.oracle.xmlns.adf.svc.types.ProcessControl;

import oracle.summit.model.polymorphicvo.views.common.SEmpViewSDO;


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
 *         &lt;element name="changeOperation" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="sEmpView1" type="{/oracle/summit/model/polymorphicvo/views/common/}SEmpViewSDO" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="processControl" type="{http://xmlns.oracle.com/adf/svc/types/}ProcessControl"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = { "changeOperation", "sEmpView1", "processControl" })
@XmlRootElement(name = "processSEmpView1")
public class ProcessSEmpView1 {

    @XmlElement(required = true)
    protected String changeOperation;
    protected List<SEmpViewSDO> sEmpView1;
    @XmlElement(required = true)
    protected ProcessControl processControl;

    /**
     * Gets the value of the changeOperation property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getChangeOperation() {
        return changeOperation;
    }

    /**
     * Sets the value of the changeOperation property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setChangeOperation(String value) {
        this.changeOperation = value;
    }

    /**
     * Gets the value of the sEmpView1 property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the sEmpView1 property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSEmpView1().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SEmpViewSDO }
     *
     *
     */
    public List<SEmpViewSDO> getSEmpView1() {
        if (sEmpView1 == null) {
            sEmpView1 = new ArrayList<SEmpViewSDO>();
        }
        return this.sEmpView1;
    }

    /**
     * Gets the value of the processControl property.
     *
     * @return
     *     possible object is
     *     {@link ProcessControl }
     *
     */
    public ProcessControl getProcessControl() {
        return processControl;
    }

    /**
     * Sets the value of the processControl property.
     *
     * @param value
     *     allowed object is
     *     {@link ProcessControl }
     *
     */
    public void setProcessControl(ProcessControl value) {
        this.processControl = value;
    }

}
