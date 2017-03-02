package oracle.summit.model.sdo.views.common;

import org.eclipse.persistence.sdo.SDODataObject;

@SuppressWarnings("serial")
public class DeptViewSDOImpl extends SDODataObject implements DeptViewSDO {

   public static final int START_PROPERTY_INDEX = 0;

   public static final int END_PROPERTY_INDEX = START_PROPERTY_INDEX + 3;

   public DeptViewSDOImpl() {}

   public java.lang.Integer getId() {
      return getInt(START_PROPERTY_INDEX + 0);
   }

   public void setId(java.lang.Integer value) {
      set(START_PROPERTY_INDEX + 0 , value);
   }

   public java.lang.String getName() {
      return getString(START_PROPERTY_INDEX + 1);
   }

   public void setName(java.lang.String value) {
      set(START_PROPERTY_INDEX + 1 , value);
   }

   public java.lang.Integer getRegionId() {
      return getInt(START_PROPERTY_INDEX + 2);
   }

   public void setRegionId(java.lang.Integer value) {
      set(START_PROPERTY_INDEX + 2 , value);
   }

   public java.util.List getEmpView() {
      return getList(START_PROPERTY_INDEX + 3);
   }

   public void setEmpView(java.util.List value) {
      set(START_PROPERTY_INDEX + 3 , value);
   }


}

