public class Account {

    private double balance;

    public Account() {
        this.balance = 0.0;
    }

    public void deposit(Double amount) {
        this.balance += amount;
    }

    public double withdraw(Double amount) {
        if (this.balance >= amount) {
            this.balance -= amount;
            System.out.println(this.balance);
            return amount;
        } else {
            System.out.println("This account does not have that much money");
            return 0.0;
        }
    }

    public double getBalance() {
        return this.balance;
    }


}
