import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public abstract class Vehicle {
    protected String owner; // the name of the owner
    private LocalDateTime arrivalTime; // arrivaltime of vehicle

    /**
     * Constructor for objects of class Vehicle
     *
     */

    public Vehicle(String ownerName) {
        // initialise instance variables

        owner = ownerName;
        arrivalTime = LocalDateTime.now();
    }

    /**
     * Getting the owner of the vehicle
     *
     * @return owner, the owner of the vehicle
     */

    public String getOwner() {
        // put your code here
        return owner;
    }

    /**
     * Getting the arrival time from LocalDateTime
     *
     */
    public LocalDateTime getArrivalTime() {
        // put your code here
        return arrivalTime;
    }

    /**
     * Getting the time in the parking once vehicle is parked
     *
     */

    public long getTimeIn() {
        return arrivalTime.until(LocalDateTime.now(), ChronoUnit.MINUTES);
    }

    /**
     * Displaying information about vehicle
     *
     */

    public String toString() {
        return "Owner: " + owner + " Arrival Time : " + arrivalTime + "\n Time In : " + getTimeIn() + "\n***********";
    }

}