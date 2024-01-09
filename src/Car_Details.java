public  class Car_Details {
    private String carID;
    private String brand;
    private String carModel;
    private double basePricePerDay;
    private boolean isAvaialble;

    public Car_Details(String carID, String brand, String carModel, double basePricePerDay, boolean isAvaialble) {
        this.carID = carID;
        this.brand = brand;
        this.carModel = carModel;
        this.basePricePerDay = basePricePerDay;
        this.isAvaialble = isAvaialble;
    }

    public String getCarID() {
        return carID;
    }

    public void setCarID(String carID) {
        this.carID = carID;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getCarModel() {
        return carModel;
    }

    public void setCarModel(String carModel) {
        this.carModel = carModel;
    }

    public double getBasePricePerDay() {
        return basePricePerDay;
    }

    public void setBasePricePerDay(double basePricePerDay) {
        this.basePricePerDay = basePricePerDay;
    }

    public boolean isAvaialble() {
        return isAvaialble;
    }

    public void setAvaialble(boolean avaialble) {
        isAvaialble = avaialble;
    }

    public void rent(){
        isAvaialble=false;
    }
    public void returnCar(){
        isAvaialble=true;
    }

    public double calculatePrice(int rentalDays){
        return basePricePerDay* rentalDays;
    }

    @Override
    public String toString() {
        return "Car_Details{" +
                "carID='" + carID + '\'' +
                ", brand='" + brand + '\'' +
                ", carModel='" + carModel + '\'' +
                ", basePricePerDay=" + basePricePerDay +
                ", isAvaialble=" + isAvaialble +
                '}';
    }
}
