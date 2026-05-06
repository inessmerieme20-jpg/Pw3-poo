class BankAccount {
    private String ownerName;
    private double balance;

    public BankAccount(String ownerName, double balance) {
        this.ownerName = ownerName;
        this.balance = balance;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        if (balance >= amount)
            balance -= amount;
        else
            System.out.println("Insufficient balance");
    }

    public double getBalance() { return balance; }
    public String getOwnerName() { return ownerName; }

    public void setOwnerName(String name) { ownerName = name; }
    public void setBalance(double balance) { this.balance = balance; }

    public String toString() {
        return "Owner: " + ownerName + ", Balance: " + balance;
    }
}

public class TestBankAccount {
    public static void main(String[] args) {
        BankAccount acc = new BankAccount("Ali", 1000);

        acc.deposit(500);
        acc.withdraw(200);

        System.out.println(acc);
    }
}
