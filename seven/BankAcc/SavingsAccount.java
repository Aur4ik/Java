package seven.BankAcc;

class SavingsAccount extends BankAccount {
    private double interestRate;

    public SavingsAccount(double balance, String owner, int AccNumber, double interestRate) {
        super(balance, owner, AccNumber);
        this.interestRate = interestRate;
    }

    @Override
    public void withdraw(double amount) {
        if (amount > 0 && GetBalance() >= amount) {
            SetBalance(GetBalance() - amount);
            System.out.println("Withdraw successful: " + amount);
        } else {
            System.out.println("Not enough money!");
        }
    }

    @Override
    public void monthlyUpdate() {
        double interest = GetBalance() * (interestRate / 100);
        SetBalance(GetBalance() + interest);
        System.out.println("Interest added: " + interest);
    }
}