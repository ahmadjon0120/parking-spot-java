public class Car extends Vehicle {
    private String rego; // registration number of the car

    /**
     * Constructor for a Car
     */

    public Car(String rego, String ownerName) {
        // initialise instance variables
        super(ownerName);
        this.rego = rego;
    }

    /**
     * Gets the registration number of the car
     */

    public String getrego() {
        // put your code here
        return rego;
    }

    /**
     * Displays information about the Car
     *
     */

    public String toString() {
        return "Car" + "," + owner + "," + getArrivalTime() + "," + rego;
    }
}
