package org.TravelPackage;

public class PremiumPassenger extends Passenger{

    public PremiumPassenger(String name, int number) {
        super(name, number);
    }

    @Override
    public void enrollActivity(Activity activity, double pricePaid) {
        super.enrollActivity(activity, 0);
    }
}
