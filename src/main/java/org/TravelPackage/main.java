package org.TravelPackage;


public class main {
    public static void  main(String[] args) {


            TravelPackage travelPackage = new TravelPackage("Summer Vacation", 50);

            Destination destination1 = new Destination("Beach City");
            Activity activity1 = new Activity("Beach Day", "Relaxing day at the beach", 40, 25, destination1);
            destination1.addActivity(activity1);

            Destination destination2 = new Destination("Mountain Town");
            Activity activity2 = new Activity("Hiking Adventure", "Explore scenic trails", 30, 20, destination2);
            destination2.addActivity(activity2);

            travelPackage.addDestination(destination1);
            travelPackage.addDestination(destination2);


            travelPackage.printItinerary();



    }
}