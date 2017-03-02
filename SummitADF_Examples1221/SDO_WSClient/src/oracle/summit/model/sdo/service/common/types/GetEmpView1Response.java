
package oracle.summit.model.sdo.service.common.types;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import oracle.summit.model.sdo.views.common.EmpViewSDO;


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
 *         &lt;element name="result" type="{/oracle/summit/model/sdo/views/common/}EmpViewSDO"/>
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
@XmlRootElement(name = "getEmpView1Response")
public class GetEmpView1Response {

    @XmlElement(required = true)
    protected EmpViewSDO result;

    /**
     * Gets the value of the result property.
     *
     * @return
     *     possible object is
     *     {@link EmpViewSDO }
     *
     */
    public EmpViewSDO getResult() {
        return result;
    }

    /**
     * Sets the value of the result property.
     *
     * @param value
     *     allowed object is
     *     {@link EmpViewSDO }
     *
     */
    public void setResult(EmpViewSDO value) {
        this.result = value;
    }

}
