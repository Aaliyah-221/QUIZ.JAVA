public class Bike extends Car{
    Bike(String brand, double rentalPrice) {
        super(brand, rentalPrice);
    }
    @Override
    double calculateRentalCost(int days) {
        return (rentalPrice * days) - 10;
    }
    }

