public class Rental {
    private Car_Details car;
    private Customer customer;

    private int days;

    public Rental(Car_Details car, Customer customer, int days) {
        this.car = car;
        this.customer = customer;
        this.days = days;
    }

    public Car_Details getCar() {
        return car;
    }

    public void setCar(Car_Details car) {
        this.car = car;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public int getDays() {
        return days;
    }

    public void setDays(int days) {
        this.days = days;
    }
}
