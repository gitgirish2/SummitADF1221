
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
 *         &lt;element name="result" type="{/oracle/summit/model/polymorphicvo/views/common/}SEmpViewSDO"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = { "result" })
@XmlRootElement(name = "mergeSEmpView1Response")
public class MergeSEmpView1Response {

    @XmlElement(required = true)
    protected SEmpViewSDO result;

    /**
     * Gets the value of the result property.
     *
     * @return
     *     possible object is
     *     {@link SEmpViewSDO }
     *
     */
    public SEmpViewSDO getResult() {
        return result;
    }

    /**
     * Sets the value of the result property.
     *
     * @param value
     *     allowed object is
     *     {@link SEmpViewSDO }
     *
     */
    public void setResult(SEmpViewSDO value) {
        this.result = value;
    }

}
