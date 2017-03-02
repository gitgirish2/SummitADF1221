
package com.oracle.xmlns.apps.hr.service.types;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import oracle.summit.model.polymorphicvo.views.common.SDeptViewSDO;


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
 *         &lt;element name="sDeptView1" type="{/oracle/summit/model/polymorphicvo/views/common/}SDeptViewSDO"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = { "sDeptView1" })
@XmlRootElement(name = "createSDeptView1")
public class CreateSDeptView1 {

    @XmlElement(required = true)
    protected SDeptViewSDO sDeptView1;

    /**
     * Gets the value of the sDeptView1 property.
     *
     * @return
     *     possible object is
     *     {@link SDeptViewSDO }
     *
     */
    public SDeptViewSDO getSDeptView1() {
        return sDeptView1;
    }

    /**
     * Sets the value of the sDeptView1 property.
     *
     * @param value
     *     allowed object is
     *     {@link SDeptViewSDO }
     *
     */
    public void setSDeptView1(SDeptViewSDO value) {
        this.sDeptView1 = value;
    }

}
