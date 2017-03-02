package oracle.summit.model.multinamedviewcriteria;

import oracle.summit.base.SummitViewObjectImpl;
import oracle.summit.model.multinamedviewcriteria.common.CustomerView;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Thu Mar 07 15:56:24 CST 2013
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class CustomerViewImpl extends SummitViewObjectImpl implements CustomerView {
    /**
     * This is the default constructor (do not remove).
     */
    public CustomerViewImpl() {
    }


    public void showCustomersForSalesRep() {
     // reset the view criteria   
        setApplyViewCriteriaNames(null);
    // set the view criteria fo showing all the customers for the given sales rep
        setApplyViewCriteriaName("SalesRepIsCriteria");
        executeQuery();
    }


     public void showCustomersForCreditRating() {
         setApplyViewCriteriaNames(null);
         setApplyViewCriteriaName("CreditRatingIsCriteria");
         executeQuery();
     }

     /*
      * Use multiple criteria 
      */
     
     public void showCustomersForSalesRepForCreditRating() {
        // reset the vie criteria
         setApplyViewCriteriaNames(null);
        // apply both view criterion, this will show all the customers that match both criteria
         setApplyViewCriteriaNames(new String[]{"SalesRepIsCriteria", "CreditRatingIsCriteria"});
         executeQuery();
         }
         
    public void showAllCustomers() {
        setApplyViewCriteriaNames(null);
        executeQuery();
    }         

    


    /**
     * Returns the variable value for bv_SalesRepId.
     * @return variable value for bv_SalesRepId
     */
    public Integer getbv_SalesRepId() {
        return (Integer) ensureVariableManager().getVariableValue("bv_SalesRepId");
    }

    /**
     * Sets <code>value</code> for variable bv_SalesRepId.
     * @param value value to bind as bv_SalesRepId
     */
    public void setbv_SalesRepId(Integer value) {
        ensureVariableManager().setVariableValue("bv_SalesRepId", value);
    }

    /**
     * Returns the variable value for bv_CreditRatingId.
     * @return variable value for bv_CreditRatingId
     */
    public Integer getbv_CreditRatingId() {
        return (Integer) ensureVariableManager().getVariableValue("bv_CreditRatingId");
    }

    /**
     * Sets <code>value</code> for variable bv_CreditRatingId.
     * @param value value to bind as bv_CreditRatingId
     */
    public void setbv_CreditRatingId(Integer value) {
        ensureVariableManager().setVariableValue("bv_CreditRatingId", value);
    }
}

