 public class Main{
        public static void main(String[] args) {
            CarRentalSystem rentalSystem = new CarRentalSystem();

            Car_Details car1 = new Car_Details("1","Toyota","Fortuner",10000,true); // Different base price per day for each car
            rentalSystem.addCar(car1);

            rentalSystem.menu();
        }
    }