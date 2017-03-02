package oracle.summit.model.rowfinder.common;

import org.eclipse.persistence.sdo.SDODataObject;

@SuppressWarnings("serial")
public class EmpViewSDOImpl extends SDODataObject implements EmpViewSDO {

   public static final int START_PROPERTY_INDEX = 0;

   public static final int END_PROPERTY_INDEX = START_PROPERTY_INDEX + 12;

   public EmpViewSDOImpl() {}

   public java.lang.Integer getId() {
      return getInt(START_PROPERTY_INDEX + 0);
   }

   public void setId(java.lang.Integer value) {
      set(START_PROPERTY_INDEX + 0 , value);
   }

   public java.lang.String getLastName() {
      return getString(START_PROPERTY_INDEX + 1);
   }

   public void setLastName(java.lang.String value) {
      set(START_PROPERTY_INDEX + 1 , value);
   }

   public java.lang.String getFirstName() {
      return getString(START_PROPERTY_INDEX + 2);
   }

   public void setFirstName(java.lang.String value) {
      set(START_PROPERTY_INDEX + 2 , value);
   }

   public java.lang.String getUserid() {
      return getString(START_PROPERTY_INDEX + 3);
   }

   public void setUserid(java.lang.String value) {
      set(START_PROPERTY_INDEX + 3 , value);
   }

   public java.lang.String getEmail() {
      return getString(START_PROPERTY_INDEX + 4);
   }

   public void setEmail(java.lang.String value) {
      set(START_PROPERTY_INDEX + 4 , value);
   }

   public java.sql.Date getStartDate() {
      return (java.sql.Date)get(START_PROPERTY_INDEX + 5);
   }

   public void setStartDate(java.sql.Date value) {
      set(START_PROPERTY_INDEX + 5 , value);
   }

   public java.lang.String getComments() {
      return getString(START_PROPERTY_INDEX + 6);
   }

   public void setComments(java.lang.String value) {
      set(START_PROPERTY_INDEX + 6 , value);
   }

   public java.lang.Integer getManagerId() {
      return getInt(START_PROPERTY_INDEX + 7);
   }

   public void setManagerId(java.lang.Integer value) {
      set(START_PROPERTY_INDEX + 7 , value);
   }

   public java.math.BigDecimal getTitleId() {
      return getBigDecimal(START_PROPERTY_INDEX + 8);
   }

   public void setTitleId(java.math.BigDecimal value) {
      set(START_PROPERTY_INDEX + 8 , value);
   }

   public java.lang.Integer getDeptId() {
      return getInt(START_PROPERTY_INDEX + 9);
   }

   public void setDeptId(java.lang.Integer value) {
      set(START_PROPERTY_INDEX + 9 , value);
   }

   public java.math.BigDecimal getSalary() {
      return getBigDecimal(START_PROPERTY_INDEX + 10);
   }

   public void setSalary(java.math.BigDecimal value) {
      set(START_PROPERTY_INDEX + 10 , value);
   }

   public java.math.BigDecimal getCommissionPct() {
      return getBigDecimal(START_PROPERTY_INDEX + 11);
   }

   public void setCommissionPct(java.math.BigDecimal value) {
      set(START_PROPERTY_INDEX + 11 , value);
   }

   public java.lang.Long getTrTitleId() {
      return getLong(START_PROPERTY_INDEX + 12);
   }

   public void setTrTitleId(java.lang.Long value) {
      set(START_PROPERTY_INDEX + 12 , value);
   }


}

