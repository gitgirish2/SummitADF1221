
package com.oracle.xmlns.apps.hr.service.types;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

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
 *         &lt;element name="sEmpView1" type="{/oracle/summit/model/polymorphicvo/views/common/}SEmpViewSDO"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = { "sEmpView1" })
@XmlRootElement(name = "deleteSEmpView1")
public class DeleteSEmpView1 {

    @XmlElement(required = true)
    protected SEmpViewSDO sEmpView1;

    /**
     * Gets the value of the sEmpView1 property.
     *
     * @return
     *     possible object is
     *     {@link SEmpViewSDO }
     *
     */
    public SEmpViewSDO getSEmpView1() {
        return sEmpView1;
    }

    /**
     * Sets the value of the sEmpView1 property.
     *
     * @param value
     *     allowed object is
     *     {@link SEmpViewSDO }
     *
     */
    public void setSEmpView1(SEmpViewSDO value) {
        this.sEmpView1 = value;
    }

}
