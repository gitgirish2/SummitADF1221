
package oracle.summit.model.sdo.service.common.types;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import oracle.summit.model.sdo.views.common.DeptViewSDO;


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
 *         &lt;element name="result" type="{/oracle/summit/model/sdo/views/common/}DeptViewSDO"/>
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
@XmlRootElement(name = "createDeptView1Response")
public class CreateDeptView1Response {

    @XmlElement(required = true)
    protected DeptViewSDO result;

    /**
     * Gets the value of the result property.
     *
     * @return
     *     possible object is
     *     {@link DeptViewSDO }
     *
     */
    public DeptViewSDO getResult() {
        return result;
    }

    /**
     * Sets the value of the result property.
     *
     * @param value
     *     allowed object is
     *     {@link DeptViewSDO }
     *
     */
    public void setResult(DeptViewSDO value) {
        this.result = value;
    }

}
