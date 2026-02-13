import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Optional;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        // load accounts
        ArrayList<BankAccount> accounts = new ArrayList<>();
        loadAccounts(accounts);

        // login
        Scanner sc = new Scanner(System.in);
        System.out.println("WELCOME TO JAVA ATM");
        System.out.print("Enter account number to proceed: ");
        String acctNo = sc.nextLine();
        System.out.print("Enter PIN: ");
        int pin = sc.nextInt();

        // Checks if account is present then authenticate with the pin
        Optional<BankAccount> newSessionUser = accounts.stream()
                .filter(b -> b.getAcctNo().equals(acctNo))
                .findFirst();

        if (newSessionUser.isPresent()) {
            if (newSessionUser.get().isValidPin(pin)) {
                System.out.println("Welcome…");
                // begin the transaction
                beginTransaction(newSessionUser.get(), accounts);
            } else {
                System.out.println("Invalid credentials...");
            }
        } else {
            System.out.println("Account not found...");
        }
    }

    // Display the menu
    public static void beginTransaction(BankAccount account, ArrayList<BankAccount> accounts) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("""
                        Menu
                        1. Balance Inquiry
                        2. Deposit
                        3. Withdraw
                        0. Exit
                    """);
            System.out.print("Choice: ");
            int c = sc.nextInt();
            switch (c) {
                case 1:
                    System.out.println("Current Balance: " + account.getBalance() + "\n");
                    break;

                case 2:
                    System.out.print("Enter deposit amount: ");
                    float deposit = sc.nextFloat();
                    if (account.deposit(deposit)) {
                        saveAccounts(accounts);
                        System.out.println("Deposit success...\n");
                    }
                    break;

                case 3:
                    System.out.print("Enter withdraw amount: ");
                    float withdraw = sc.nextFloat();
                    if (account.withdraw(withdraw)) {
                        saveAccounts(accounts);
                        System.out.println("Withdraw success...\n");
                    }
                    break;

                case 0:
                    System.out.println("Exiting program..."); // stops the program
                    System.exit(0); // stops program
                    break;

                default:
                    System.out.println("Invalid choice...\n");
                    break;
            }
        } 
    }

    // Method that loads the existing information in the CSV file
    public static void loadAccounts(ArrayList<BankAccount> accounts) {
        try (BufferedReader br = new BufferedReader(new FileReader("accounts.csv"))) {
            String line;
            br.readLine(); // skip header
            while ((line = br.readLine()) != null) {
                String[] cols = line.split(",");
                String acctNo = cols[0];
                String fullName = cols[1];
                float balance = Float.parseFloat(cols[2]);
                int pin = Integer.parseInt(cols[3]);

                BankAccount acc = new BankAccount(acctNo, pin, balance, fullName);
                accounts.add(acc);
            }
        } catch (IOException | NumberFormatException e) {
            e.printStackTrace();
        }
    }

    // Method for saving progress into the CSV file
    public static void saveAccounts(ArrayList<BankAccount> accounts) {
        try (FileWriter writer = new FileWriter("accounts.csv")) {
            writer.write("Account Number,Full Name,Balance,PIN\n");
            for (BankAccount acc : accounts) {
                writer.write(
                        acc.getAcctNo() + "," + acc.getFullName() + "," + acc.getBalance() + "," + acc.getPin() + "\n");
            }
        } catch (IOException e) {
            System.out.println("Error saving accounts: " + e.getMessage());
        }
    }
}