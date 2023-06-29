import java.util.Scanner;

public class Atm {
    float balance = 1000;
    int PIN = 7112;
    String userid = "user";

    public void login() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your userID:");
        String id = scanner.nextLine();
        System.out.println("Enter your pin/passcode:");
        int enteredpin = scanner.nextInt();
        if ((id.equals(userid)) && (enteredpin == PIN)) {
            System.out.println("You are now Logged In..");
            showMenu();
        } else {
            System.out.println("Enter a valid Pin!");
        }
    }

    public void showMenu() {
        while (true) {
            System.out.println(" ");
            System.out.println("   ATM INTERFACE   ");
            System.out.println("1. Check Your Balance ");
            System.out.println("2. Withdraw  ");
            System.out.println("3. Deposit");
            System.out.println("4. Exit");
            System.out.println();
            System.out.print("Enter Your Choice : ");

            Scanner sc = new Scanner(System.in);

            int opt = sc.nextInt();
            switch (opt) {
                case 1: checkBalance();
                case 2 : withdrawCash();
                case 3 : depositCash();
                case 4 : System.exit(0);
                default : System.out.print("Enter a valid choice");
            }

        }
    }

    public void checkBalance() {
        System.out.println("Your Balance is :" + "$" + balance);
        showMenu();
    }

    public void withdrawCash() {
        System.out.println("Enter the withdraw amount in $:");
        Scanner sc = new Scanner(System.in);
        float amt = sc.nextFloat();
        if (amt > balance) {
            System.out.println("Can't Withdraw !your balance is insufficient...  ");
        } else {
            balance = balance - amt;
            System.out.printf("\nWithdraw was Success! your current balance is %f", balance);
        }
        showMenu();
    }

    public void depositCash() {
        System.out.println("Enter deposit amount in $:");
        Scanner scanner = new Scanner(System.in);
        float amt = scanner.nextFloat();
        balance = balance + amt;
        System.out.printf("Amount Deposit was Success! Current balance is %f", balance);
    }
    
        
    }


