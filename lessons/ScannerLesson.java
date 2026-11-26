package lessons;
import java.util.Scanner;

public class ScannerLesson {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking inputs from user.
        System.out.println("Please enter your fullname: ");
        String name = scanner.nextLine().trim();

        System.out.println("Please enter your age: ");
        int age = Integer.parseInt(scanner.nextLine().trim());

        System.out.println("Please enter your NIN: ");
        String voterNIN = scanner.nextLine().trim();

        System.out.println("Please enter the price paid: ");
        double priceForRegistration = Double.parseDouble(scanner.nextLine().trim());

        System.out.println("Are you registered before: ");
        boolean isRegistered = Boolean.parseBoolean(scanner.nextLine().trim());
        scanner.nextLine(); 

        System.out.println("\n\n");

        System.out.println("name: " + name + "\n" + "age: " + age + "\n" + "voterNIN: " + voterNIN + "\n"
                + "priceForRegistration: " + priceForRegistration + "\n" + "isRegistered: " + isRegistered + "\n");

        System.out.println("Confirm your information: Yes / No");
        String input = scanner.nextLine().trim();
        if (input.equalsIgnoreCase("yes") || input.equalsIgnoreCase("y")) {
            System.out.println("Registration successful.");
        } else if (input.equalsIgnoreCase("no") || input.equalsIgnoreCase("n")) {
            System.out.println("Registration cancelled.");
        } else {
            System.out.println("Invalid input. Please enter Yes or No.");
        }

        scanner.close();
    }
}
