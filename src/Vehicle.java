import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age;
        try {
            System.out.print("Enter your name:");
            String name = sc.nextLine();
            System.out.print("Enter your age:");
            age = sc.nextInt();

        } catch (Exception e) {
            throw new RuntimeException(e);
        } finally {
            sc.close();
        }

        if (age < 18) {
            System.out.print("you are not allowed to drink");
        } else {
            System.out.print("you are allowed to drink");
        }


    }
}