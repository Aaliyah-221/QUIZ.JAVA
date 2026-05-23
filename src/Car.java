public class Car extends Vehicle{

    Car(String brand, double rentalPrice) {
        super(brand, rentalPrice);
    }

    @Override
    double calculateRentalCost(int days) {
        return rentalPrice * days;

    }
}
