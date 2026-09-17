package Talleres.Taller01.Ejercicio3;
public class wallet {
    private String owner;
    private double balance;
    private static final double MAXIMUM_PAYMENT_LIMIT = 500000.0;

    public wallet(String owner) {
        this.owner = owner;
        this.balance = 0.0;
    }

    public String getOwner() {
        return owner;
    }

    public double getBalance() {
        return balance;
    }

    public boolean topUp(double amount) {
        if (amount > 0) {
            this.balance += amount;
            return true;
        }
        return false;
    }

    public boolean pay(double amount) {
        if (amount > 0 && amount <= this.balance && amount <= MAXIMUM_PAYMENT_LIMIT) {
            this.balance -= amount;
            return true;
        }
        return false;
    }
}