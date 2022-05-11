import java.util.ArrayList;
import java.util.Scanner;
public class Banking {
    public static Scanner in = new Scanner(System.in);
    public static int input;
    public static void main(String[] args) {
        ArrayList<BankAccount> accounts = new ArrayList<BankAccount>();
        System.out.println("Hello world! Welcome to the bank of Xavier!");
        System.out.println("Are you an existing customer? (-1 exit) \n1. Yes \n2. No");
        while(true) {
            try {
                input = Integer.parseInt(in.nextLine());
                if(input != 1 && input !=2 && input != -1) {
                    System.out.println("Please enter 1. Yes, 2. No, or -1 to exit: ");
                } else {
                    break;
                }
            } catch(Exception e) {
                System.out.println("Please enter 1. Yes, 2. No, or -1 to exit: ");
            }
        }

        if(input == 1) {
            //choose account to use
        } else if(input == 2) {
            System.out.println("Let's make a new account!");
            BankAccount b = new BankAccount();
            accounts.add(b);
            b.setAccountNumber(accounts.size()-1);
            System.out.println("What is the name for the account?");
            b.setName(in.nextLine());
            System.out.println("What is the beginning balance for the account?");
            b.setBalance(Integer.parseInt(in.nextLine()));
            mainMenu(b);
        }

    }

    public static void mainMenu(BankAccount b) {
        System.out.println("Hello " + b.getName());
        System.out.println("Welcome to the Main Menu, what would you like to do today?");
        System.out.println(
                "1. To check account balance" +
                "\n2. To make a withdraw" +
                "\n3. To make a deposit" +
                "\n4. To make a transfer to another account" +
                "\n0. To exit."
        );
        while(true) {
            try {
                input = Integer.parseInt(in.nextLine());
                if(input != 1 && input !=2 && input != 3 && input != 4 && input != 0) {
                    System.out.println("Please enter one of the options above: ");
                } else {
                    break;
                }
            } catch(Exception e) {
                System.out.println("Please enter one of the options above: ");
            }
        }
        switch(input) {
            case 1:
                System.out.println("Your account balance is : $" + b.getBalance());
                break;
            case 2:
                System.out.println("How much would you like to withdraw?");
                double withdrawalAmount;
                while(true) {
                    try {
                        withdrawalAmount = Integer.parseInt(in.nextLine());
                        break;
                    } catch(Exception e) {
                        System.out.println("Please enter a valid number:");
                    }
                }
                b.withdrawal(withdrawalAmount);
                System.out.println("Withdrawal of " + withdrawalAmount + " successful.");
                System.out.println("Your new balance is " + b.getBalance());
                break;
            case 3:
                System.out.println("How much would you like to deposite?");
                double depositAmount;
                while(true) {
                    try {
                        depositAmount = Integer.parseInt(in.nextLine());
                        break;
                    } catch(Exception e) {
                        System.out.println("Please enter a valid number:");
                    }
                }
                b.deposit(depositAmount);
                System.out.println("Deposit of " + depositAmount + " successful.");
                System.out.println("Your new balance is " + b.getBalance());
                break;
            case 4:

        }
    }

}
