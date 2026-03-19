package seven.BankAcc;

abstract class BankAccount {
    private double balance;
    private String owner;
    private int AccNumber;

    public BankAccount(double balance, String owner, int AccNumber){
        this.balance = balance;
        this.owner = owner;
        this.AccNumber = AccNumber;
    }
    //========Геттеры=======
    public String GetName(){
        return owner; 
    }
    public int GetAccNumber(){
        return AccNumber;
    }
    public double GetBalance(){
        return balance;
    }
    //========Сеттеры=======
    public void SetOwnerName(String owner) {
        if (owner != null && !owner.isEmpty()) {
            this.owner = owner;
        }
    }

    protected void SetBalance(double balance) {
        this.balance = balance;
    }

    //========Методы=======
     public void deposit(double amount) {
        if (amount > 0) {
            SetBalance(GetBalance() + amount);
            System.out.println("Deposit successful: " + amount);
        } else {
            System.out.println("Invalid deposit amount!");
        }
    }

    public abstract void withdraw(double amount);

    public abstract void monthlyUpdate();

    public void showInfo() {
        System.out.println("----- ACCOUNT INFO -----");
        System.out.println("Number: " + AccNumber);
        System.out.println("Owner: " + owner);
        System.out.println("Balance: " + balance);
    }
}

