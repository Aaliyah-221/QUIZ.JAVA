import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("===== Vehicle Rental System =====");
        System.out.println("Choose Vehicle Type");
        System.out.println("1. Car");
        System.out.println("2. Bike");

        int choice = input.nextInt();
        input.nextLine();

        System.out.print("Enter vehicle brand: ");
        String brand = input.nextLine();

        System.out.print("Enter rental price per day: ");
        double rentalPrice = input.nextDouble();

        System.out.print("Enter number of rental days: ");
        int days = input.nextInt();

        Vehicle vehicle;

        if (choice == 1) {
            vehicle = new Car(brand, rentalPrice);
        } else {
            vehicle = new Bike(brand, rentalPrice);
        }

        double totalCost = vehicle.calculateRentalCost(days);

        System.out.println("\n===== Rental Bill =====");
        System.out.println("Vehicle Brand: " + vehicle.brand);
        System.out.println("Rental Days: " + days);
        System.out.println("Total Cost: $" + totalCost);

        input.close();
    }
}
