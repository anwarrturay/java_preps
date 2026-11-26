import java.util.Scanner;

public class BankingApp {

    static double deposit(double balance, double amount){
        return balance + amount;
    }

    static double withdraw(double balance, double amount){
        return balance - amount;
    }

    static double calculateAverage(double[] transactions){
        double total = 0;

        for(double transaction : transactions){
            total += transaction;
        }

        return total / transactions.length;
    }
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        double balance = 0.00;

        // CREATING A BANK ACCOUNT.
        System.out.println("Welcome to UBA bank of sierra Leone. \n");
        System.out.println("First name: ");
        String firstName = scanner.nextLine().trim();

        System.out.println("Lastname: ");
        String lastName = scanner.nextLine().trim();

        System.out.println("Date of Birth: ");
        String dob = scanner.nextLine().trim();

        System.out.println("Phone Number: ");
        String phoneNumber = scanner.nextLine().trim();

        System.out.println("Gender: (M-Male / F-Female): ");
        String gender = scanner.nextLine();
        String userGender = "";

        if(gender.equalsIgnoreCase("male") || gender.equalsIgnoreCase("female")){
            userGender = gender;
        }

        // STORING USERS INFORMATION TO UBA DB.
        String[] ubaUsers = {firstName, lastName, dob, phoneNumber, userGender};
        System.out.println("Account created successfully");

        // DEPOSITING A CERTAIN AMOUNT.
        System.out.println("Deposit 250 for newly created account: ");
        double amountForNewAccount = scanner.nextDouble();
        if(amountForNewAccount < 250){
            System.out.println("Newly opened account should have a balance of atleast 250.");
        }

        balance = deposit(balance, amountForNewAccount);
        System.out.println("You've successfully deposited: "+amountForNewAccount);
        

        System.out.println("Do you wish to withdraw: y - Yes / n - No: ");
        String userInput = scanner.next();
        if(userInput.equalsIgnoreCase("y")){
            System.out.println("Please kindly enter withdraw amount: ");
            double amountToWithdraw = scanner.nextDouble();
            if(amountToWithdraw < 0){
                System.out.println("Invalid amount entered.");
            }else if(amountToWithdraw > balance){
                System.out.println("You don't have enough balance to withdraw such amount.");
            }

            if(amountToWithdraw > 0){
                balance = withdraw(balance, amountToWithdraw);
                System.out.println("Amount withdrawn is: "+amountToWithdraw);
                System.out.println("Your balance is: "+balance);
            }
        }else if(userInput.equalsIgnoreCase("n")){
            System.out.println("Ok then thanks for banking with UBA. 😂💐💐");
        }else{
            System.out.println("Invalid entered character.");
        }

        scanner.close();

    }
}
