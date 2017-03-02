
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
 *         &lt;element name="empView1" type="{/oracle/summit/model/sdo/views/common/}EmpViewSDO"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = { "empView1" })
@XmlRootElement(name = "createEmpView1")
public class CreateEmpView1 {

    @XmlElement(required = true)
    protected EmpViewSDO empView1;

    /**
     * Gets the value of the empView1 property.
     *
     * @return
     *     possible object is
     *     {@link EmpViewSDO }
     *
     */
    public EmpViewSDO getEmpView1() {
        return empView1;
    }

    /**
     * Sets the value of the empView1 property.
     *
     * @param value
     *     allowed object is
     *     {@link EmpViewSDO }
     *
     */
    public void setEmpView1(EmpViewSDO value) {
        this.empView1 = value;
    }

}
