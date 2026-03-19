package seven.BankAcc;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<BankAccount> accounts = new ArrayList<>();

        accounts.add(new DebitAccount(1001, "Alex", 120000));
        accounts.add(new DebitAccount(1002, "John", 80000));

        accounts.add(new SavingsAccount(2001, "Alice", 100000, 5));
        accounts.add(new SavingsAccount(2002, "Emma", 150000, 3));

        accounts.add(new CreditAccount(3001, "Bob", 10000, 50000));
        accounts.add(new CreditAccount(3002, "Mike", 5000, 30000));

        double totalBalance = 0;
        BankAccount maxAccount = accounts.get(0);

        int debitCount = 0;
        int savingsCount = 0;
        int creditCount = 0;

        for (BankAccount acc : accounts) {
            acc.showInfo();

            acc.deposit(20000);
            acc.withdraw(30000);
            acc.monthlyUpdate();

            System.out.println("Balance after update: " + acc.GetBalance());
            System.out.println("------------------------");


            totalBalance += acc.GetBalance();

            if (acc.GetBalance() > maxAccount.GetBalance()) {
                maxAccount = acc;
            }

            if (acc instanceof DebitAccount) debitCount++;
            if (acc instanceof SavingsAccount) savingsCount++;
            if (acc instanceof CreditAccount) creditCount++;
        }

        System.out.println("\n===== STATISTICS =====");
        System.out.println("Total balance: " + totalBalance);
        System.out.println("Max balance: " + maxAccount.GetBalance() + " (Owner: " + maxAccount.GetName() + ")");
        System.out.println("Debit accounts: " + debitCount);
        System.out.println("Savings accounts: " + savingsCount);
        System.out.println("Credit accounts: " + creditCount);
    }
}