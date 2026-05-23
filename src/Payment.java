

abstract class Payment {

    abstract double calculateBonus(double salary);
}

class Employee extends Payment {

    private int employeeId;
    private String employeeName;
    private String employeeStatus;
    private double salary;

    Employee(int employeeId, String employeeName,
             String employeeStatus, double salary) {

        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.employeeStatus = employeeStatus;
        if (salary < 0) {
            System.out.println("Salary cannot be negative.");
            this.salary = 0;
        } else {
            this.salary = salary;
        }
    }

    // Method overriding
    @Override
    double calculateBonus(double salary) {

        if (employeeStatus.equalsIgnoreCase("Manager")) {
            return salary * 0.20;
        } else {
            return salary * 0.10;
        }
    }

    void displayInfo() {

        double bonus = calculateBonus(salary);

        System.out.println("\n===== Employee Information =====");
        System.out.println("Employee ID: " + employeeId);
        System.out.println("Employee Name: " + employeeName);
        System.out.println("Employee Status: " + employeeStatus);
        System.out.println("Salary: $" + salary);
        System.out.println("Bonus Amount: $" + bonus);
    }
}




