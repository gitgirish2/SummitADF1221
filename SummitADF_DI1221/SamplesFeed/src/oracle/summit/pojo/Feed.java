package oracle.summit.pojo;

import java.util.ArrayList;
import java.util.List;

public class Feed {
    private List<Sample> samples;

    public Feed() {
        super();
        samples = new ArrayList<Sample>();
        Sample sa =
            new Sample("Edit Customers Sample", "/excel/EditCustomers.xlsx",
                       "/images/EditCustomers.png",
                       "This sample illustrates the most commonly used ADF Desktop Integration Table features. You can download, insert, update and commit data. It also demonstrates multiple ways to choose a value from a list of choices.");
        samples.add(sa);
        sa =
            new Sample("Edit Warehouse Inventory Sample", "/excel/EditWarehouseInventory.xlsx",
                       "/images/EditWarehouseInventory.png",
                       "This sample illustrates how to use ADF Desktop Integration Form components with a detail table. You can download and update data in a master form and its detail table. This sample also demonstrates how to use workbook parameters to control the workbook initialization.");
        samples.add(sa);
        sa =
            new Sample("Edit All Inventory Sample", "/excel/EditAllInventory.xlsx",
                       "/images/EditAllInventory.png",
                       "This sample demonstrates how to create an editable table with a denormalized master-detail relationship. You can also see how to use the date picker, group columns, and delete existing data records.");
        samples.add(sa);
        sa =
            new Sample("Search Customers Sample", "/excel/CustomerSearch.xlsx",
                       "/images/CustomerSearch.png",
                       "This sample demonstrates how a custom web page can be used to perform a search prior to downloading data into a Table configured to be read-only.");
        samples.add(sa);
    }

    public void setSamples(List samples) {
        this.samples = samples;
    }

    public List<Sample> getSamples() {
        return samples;
    }
}
