
package oracle.summit.model.sdo.service.common.types;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import com.oracle.xmlns.adf.svc.types.ProcessControl;

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
 *         &lt;element name="changeOperation" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="deptView1" type="{/oracle/summit/model/sdo/views/common/}DeptViewSDO" maxOccurs="unbounded" minOccurs="0"/>
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
@XmlType(name = "", propOrder = { "changeOperation", "deptView1", "processControl" })
@XmlRootElement(name = "processDeptView1")
public class ProcessDeptView1 {

    @XmlElement(required = true)
    protected String changeOperation;
    protected List<DeptViewSDO> deptView1;
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
     * Gets the value of the deptView1 property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the deptView1 property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDeptView1().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DeptViewSDO }
     *
     *
     */
    public List<DeptViewSDO> getDeptView1() {
        if (deptView1 == null) {
            deptView1 = new ArrayList<DeptViewSDO>();
        }
        return this.deptView1;
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
