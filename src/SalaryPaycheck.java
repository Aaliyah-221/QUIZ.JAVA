import java.util.Scanner;

public class SalaryPaycheck {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("***** SalaryPaycheck *****");
        System.out.println("Choose your status");
        System.out.println("1. Manager");
        System.out.println("2. Developer");

        int choice = input.nextInt();
        input.nextLine();

        String status = "";

        if (choice == 1) {
            status = "Manager";
        } else if (choice == 2) {
            status = "Developer";
        } else {
            System.out.println("Invalid choice");
            return;
        }

        System.out.print("Enter Employee ID: ");
        int id = input.nextInt();
        input.nextLine();

        System.out.print("Enter Employee Name: ");
        String name = input.nextLine();

        System.out.print("Enter Salary: ");
        double salary = input.nextDouble();

        Employee emp = new Employee(id, name, status, salary);

        emp.displayInfo();

        input.close();
    }
}