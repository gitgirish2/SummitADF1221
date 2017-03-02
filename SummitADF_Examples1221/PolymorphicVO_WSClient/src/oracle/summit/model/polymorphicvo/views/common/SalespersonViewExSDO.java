
package oracle.summit.model.polymorphicvo.views.common;

import java.math.BigDecimal;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SalespersonViewExSDO complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="SalespersonViewExSDO">
 *   &lt;complexContent>
 *     &lt;extension base="{/oracle/summit/model/polymorphicvo/views/common/}SEmpViewSDO">
 *       &lt;sequence>
 *         &lt;element name="CommissionPct" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SalespersonViewExSDO", propOrder = { "commissionPct" })
public class SalespersonViewExSDO extends SEmpViewSDO {

    @XmlElementRef(name = "CommissionPct", namespace = "/oracle/summit/model/polymorphicvo/views/common/",
                   type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> commissionPct;

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

}
