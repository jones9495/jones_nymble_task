package org.TravelPackage;

import java.util.ArrayList;
import java.util.List;

public class Passenger {
    private String name;
    private int number;
    private List<ActivityEnrollment> enrolledActivities;

    public Passenger(String name, int number) {
        this.name = name;
        this.number = number;
        this.enrolledActivities = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public int getNumber() {
        return number;
    }

    public List<ActivityEnrollment> getEnrolledActivities() {
        return enrolledActivities;
    }

    public void enrollActivity(Activity activity, double pricePaid) {
        enrolledActivities.add(new ActivityEnrollment(activity, pricePaid));
        activity.enrollPassenger(this);
    }
}
