import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Optional;
import java.util.Scanner;
import java.io.FileWriter;
import java.io.IOException;
import java.io.FileReader;

public class App {
    public static void main(String[] args) {
        // load accounts
        // BankAccount[] accounts;
        ArrayList<BankAccount> accounts = new ArrayList<>();
        loadAccounts(accounts);

        // login
        Scanner sc = new Scanner(System.in);
        System.out.println("WELCOME TO JAVA ATM");
        System.out.println("Enter account number to proceed:");
        String acctNo = sc.nextLine();
        System.out.println("Enter PIN:");
        int pin = sc.nextInt();

        // checking if the account is present then authenticate with the pin
        Optional<BankAccount> newSessionUser = accounts.stream().filter(b -> b.getAcctNo().equals(acctNo)).findFirst();

        if (newSessionUser.isPresent()) {
            if (newSessionUser.get().isValidPin(pin)) {
                System.out.println("Welcome...");
                // begin transaction
                beginTransaction(newSessionUser.get(), accounts);
            } else {
                System.out.println("Invalid credentials...");
            }
        }

    }

    public static void beginTransaction(BankAccount account, ArrayList<BankAccount> accounts) {
        while (true) {
            System.out.println("""
                        Menu
                        1. Balance Inquiry
                        2. Deposit
                        3. Withdraw
                        0. Exit
                    """);
            System.out.println("Choice: ");
            Scanner sc = new Scanner(System.in);
            int c = sc.nextInt();
            switch (c) {
                case 1:
                    System.out.println("Current Balance: " + account.getBalance() + "\n");
                    break;

                case 2:
                    System.out.println("Enter deposit amount");
                    float deposit = sc.nextFloat();
                    account.deposit(deposit);
                    saveAccounts(accounts); // save changes to csv file
                    System.out.println("Deposit success...\n");
                    break;

                case 3:
                    System.out.println("Enter withdraw amount");
                    float withdraw = sc.nextFloat();
                    account.withdraw(withdraw);
                    saveAccounts(accounts); // save changes to csv file
                    break;

                case 0:
                    System.out.println("Exiting program...");
                    return; // stops the program

                default:
                    System.out.println("Invalid choice...\n");
                    break;
            }
        }
    }

    // Method for reading acc from csv and loads it to arraylist
    public static void loadAccounts(ArrayList<BankAccount> accounts) {
        try {
            BufferedReader br = new BufferedReader(new FileReader("accounts.csv"));
            String line;
            br.readLine(); // skips the header
            while ((line = br.readLine()) != null) {
                String[] cols = line.split(",");
                String acctNo = cols[0];
                String fullName = cols[1];
                float balance = Float.parseFloat(cols[2]);
                int pin = Integer.parseInt(cols[3]);

                BankAccount acc = new BankAccount(acctNo, pin, balance, fullName);
                accounts.add(acc);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Method for writing updated accounts
    public static void saveAccounts(ArrayList<BankAccount> accounts) {
        try (FileWriter writer = new FileWriter("accounts.csv")) {
            writer.write("Account Number,Full Name,Balance,PIN\n");
            for (BankAccount acc : accounts) {
                writer.write(acc.getAcctNo() + "," + acc.getFullName() + "," + acc.getBalance() + "," + acc.getPin() + "\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
}