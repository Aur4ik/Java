package seven.BankAcc;

class CreditAccount extends BankAccount {
    private double creditLimit;

    public CreditAccount(double balance, String owner, int AccNumber, double creditLimit) {
        super(balance, owner, AccNumber);
        this.creditLimit = creditLimit;
    }

    @Override
    public void withdraw(double amount) {
        if (amount > 0 && (GetBalance() - amount) >= -creditLimit) {
            SetBalance(GetBalance() - amount);
            System.out.println("Withdraw successful: " + amount);
        } else {
            System.out.println("Credit limit exceeded!");
        }
    }

    @Override
    public void monthlyUpdate() {
        SetBalance(GetBalance() - 1000);
        System.out.println("Monthly fee charged: 1000");
    }
}