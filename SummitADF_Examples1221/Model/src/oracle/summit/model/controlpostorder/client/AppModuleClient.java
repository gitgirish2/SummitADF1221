package oracle.summit.model.controlpostorder.client;

import oracle.jbo.client.remote.ApplicationModuleImpl;

import oracle.summit.model.controlpostorder.Result;
import oracle.summit.model.controlpostorder.common.AppModule;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Wed Mar 14 07:23:54 CDT 2012
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class AppModuleClient extends ApplicationModuleImpl implements AppModule {
    /**
     * This is the default constructor (do not remove).
     */
    public AppModuleClient() {
    }

    public Result newEmployeeForNewDepartment(String deptName, oracle.jbo.domain.Number regionId, String lastName,
                                              String firstName, oracle.jbo.domain.Number salary) {
        Object _ret =
            this.riInvokeExportedMethod(this,"newEmployeeForNewDepartment",new String [] {"java.lang.String","oracle.jbo.domain.Number","java.lang.String","java.lang.String","oracle.jbo.domain.Number"},new Object[] {deptName, regionId, lastName, firstName, salary});
        return (Result)_ret;
    }
}