public class Customer {

    private String customereName;
    private String CustomereID;

    public Customer(String customereName, String customereID) {
        this.customereName = customereName;
        CustomereID = customereID;
    }
    public String getCustomereName() {
        return customereName;
    }

    public void setCustomereName(String customereName) {
        this.customereName = customereName;
    }

    public String getCustomereID() {
        return CustomereID;
    }

    public void setCustomereID(String customereID) {
        CustomereID = customereID;
    }

}
