package seven.BankAcc;

class DebitAccount extends BankAccount {

    public DebitAccount(double balance, String owner, int AccNumber) {
        super(balance, owner, AccNumber);
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
        System.out.println("Monthly update: no changes.");
    }
}