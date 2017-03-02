
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
 *         &lt;element name="deptView1" type="{/oracle/summit/model/sdo/views/common/}DeptViewSDO"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = { "deptView1" })
@XmlRootElement(name = "updateDeptView1")
public class UpdateDeptView1 {

    @XmlElement(required = true)
    protected DeptViewSDO deptView1;

    /**
     * Gets the value of the deptView1 property.
     *
     * @return
     *     possible object is
     *     {@link DeptViewSDO }
     *
     */
    public DeptViewSDO getDeptView1() {
        return deptView1;
    }

    /**
     * Sets the value of the deptView1 property.
     *
     * @param value
     *     allowed object is
     *     {@link DeptViewSDO }
     *
     */
    public void setDeptView1(DeptViewSDO value) {
        this.deptView1 = value;
    }

}
