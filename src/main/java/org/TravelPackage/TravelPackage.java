package org.TravelPackage;

import java.util.ArrayList;
import java.util.List;

public class TravelPackage {
    private String name;
    private int passengerCapacity;
    private List<Destination> destinations;
    private List<Passenger> passengers;

    public TravelPackage(String name, int passengerCapacity) {
        this.name = name;
        this.passengerCapacity = passengerCapacity;
        this.destinations = new ArrayList<>();
        this.passengers = new ArrayList<>();
    }

    public void addDestination(Destination destination) {
        destinations.add(destination);
    }

    public void addPassenger(Passenger passenger) {
        if (passengers.size() < passengerCapacity) {
            passengers.add(passenger);
        }
    }

    public void printItinerary() {
        System.out.println("Travel Package: " + name);
        for (Destination destination : destinations) {
            System.out.println("\nDestination: " + destination.getName());
            for (Activity activity : destination.getActivities()) {
                System.out.println("Activity: " + activity.getName() + ", Cost: " + activity.getCost() +
                        ", Capacity: " + activity.getCapacity() + ", Description: " + activity.getDescription());
            }
        }
    }

    public void printPassengerList() {
        System.out.println("Passenger List for Travel Package " + name);
        System.out.println("Passenger Capacity: " + passengerCapacity);
        System.out.println("Number of Passengers Enrolled: " + passengers.size());
        for (Passenger passenger : passengers) {
            System.out.println("Passenger Name: " + passenger.getName() + ", Passenger Number: " + passenger.getNumber());
        }
    }

    public void printPassengerDetails(Passenger passenger) {
        System.out.println("Passenger Details - Name: " + passenger.getName() + ", Number: " + passenger.getNumber());
        if (passenger instanceof StandardPassenger) {
            System.out.println("Balance: " + ((StandardPassenger) passenger).getBalance());
        } else if (passenger instanceof GoldPassenger) {
            System.out.println("Balance: " + ((GoldPassenger) passenger).getBalance() + ", Discount: 10% on activity cost");
        } else {
            System.out.println("Premium Passenger - No balance or discount");
        }

        System.out.println("Activities Enrolled:");
        for (ActivityEnrollment enrollment : passenger.getEnrolledActivities()) {
            Activity activity = enrollment.getActivity();
            System.out.println("Activity: " + activity.getName() + ", Destination: " +
                    activity.getDestination().getName() + ", Price Paid: " + enrollment.getPricePaid());
        }
    }

    public void printAvailableActivities() {
        System.out.println("Available Activities:");
        for (Destination destination : destinations) {
            for (Activity activity : destination.getActivities()) {
                int availableSpaces = activity.getAvailableSpaces();
                System.out.println("Activity: " + activity.getName() + ", Destination: " +
                        destination.getName() + ", Available Spaces: " + availableSpaces);
            }
        }
    }
}
