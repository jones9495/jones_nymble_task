package org.TravelPackage;

public class StandardPassenger extends Passenger{
    private double balance;

    public StandardPassenger(String name, int number, double balance) {
        super(name, number);
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    @Override
    public void enrollActivity(Activity activity, double pricePaid) {
        if (balance >= pricePaid) {
            super.enrollActivity(activity, pricePaid);
            balance -= pricePaid;
        }
    }
}
