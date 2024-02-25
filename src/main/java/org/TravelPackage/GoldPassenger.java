package org.TravelPackage;

public class GoldPassenger extends Passenger{

    private double balance;

    public GoldPassenger(String name, int number, double balance) {
        super(name, number);
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    @Override
    public void enrollActivity(Activity activity, double pricePaid) {
        double discountedCost = 0.9 * activity.getCost();
        if (balance >= discountedCost) {
            super.enrollActivity(activity, discountedCost);
            balance -= discountedCost;
        }
    }
}
