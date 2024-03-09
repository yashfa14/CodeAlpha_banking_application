import java.util.*;
public class banking {
        static double balance = 0;

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int n = 0;
            while (n != 4) {
                System.out.println("Welcome to the Bank");
                System.out.println("press the correct button for the following option");
                System.out.println("1. Check Balance");
                System.out.println("2. Deposit");
                System.out.println("3. Withdraw");
                System.out.println("4. Exit");
                System.out.print("choose an option: ");
                n = sc.nextInt();

                switch (n) {
                    case 1:
                        Balance();
                        break;
                    case 2:
                        deposit();
                        break;
                    case 3:
                        withdraw();
                        break;
                    case 4:
                        exit();
                        break;
                    default:
                        System.out.println("Invalid input Try again.");
                        break;
                }
            }
        }


        public static void Balance() {
            System.out.println("Your current balance is " + balance+ "Rs.");
        }

        public static void deposit() {
            Scanner sc = new Scanner(System.in);

            System.out.print("Enter the amount to deposit: Rs.");
            double amount = sc.nextDouble();
            balance = balance + amount;
            System.out.println( amount + "Rs." + " has been deposited to your account.");
            Balance();
        }

        public static void withdraw() {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter the amount to withdraw: Rs.");
            double amount = scanner.nextDouble();
            if (amount > balance) {
                System.out.println("Insufficient funds.");
            } else {
                balance =balance - amount;
                System.out.println(amount +"Rs"+ " has been withdrawn from your account.");
            }
            Balance();
        }

        public static void exit() {
            System.out.println("Thank you for banking with us. Have a great day!");
        }
    }

