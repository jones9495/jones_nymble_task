package org.TravelPackage;

public class ActivityEnrollment {

    private Activity activity;
    private double pricePaid;

    public ActivityEnrollment(Activity activity, double pricePaid) {
        this.activity = activity;
        this.pricePaid = pricePaid;
    }

    public Activity getActivity() {
        return activity;
    }

    public double getPricePaid() {
        return pricePaid;
    }
}
