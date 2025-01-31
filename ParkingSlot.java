import java.time.LocalDateTime;
import java.util.ArrayList;

public class ParkingSlot {
    private String id; // the id of the parkingslot
    private Vehicle vehicleInParkingSlot; // vehicle instance
    private boolean isOccupied; // if parkingslot is occupied
    private boolean isStaff; // if parkingslot belongs to staff
    private LocalDateTime arrivalTime; // the arrival time

    /**
     * Constructor for Visitor ParkingSlot
     * By default it assigns isOccupied and isStaff to false.
     */

    public ParkingSlot(String sId) {
        this.id = sId;
        isOccupied = false;
        isStaff = false;
    }

    /**
     * Constructor for Staff ParkingSlot
     */

    public ParkingSlot(String sId, boolean isStaff) {
        this.id = sId;
        isOccupied = false;
        this.isStaff = isStaff;
    }

    /**
     * Method to add visitor vehicle to parking spot
     * It sets occupied status to true.
     * It also sets isStaff to false.
     */
    public void addVisitorVehicle(Vehicle vehicleInParkingSlot) {
        this.vehicleInParkingSlot = vehicleInParkingSlot;
        isOccupied = true;
        isStaff = false;
        arrivalTime = LocalDateTime.now();
    }

    /**
     * Method to add staff vehicle to parking spot
     * It sets occupied status to true.
     * It also sets isStaff to true.
     *
     */

    public void addStaffVehicle(Vehicle vehicleInParkingSlot) {
        this.vehicleInParkingSlot = vehicleInParkingSlot;
        isOccupied = true;
        isStaff = true;
        arrivalTime = LocalDateTime.now();
    }

    /**
     * Gets the id of the parkingslot
     *
     */

    public String getParkingSlotId() {
        return id;
    }

    /**
     * Removes the vehicle from parking slot.
     * sets is occupied to false so other vehicles can park
     */

    public Vehicle removeVehicle() {
        isOccupied = false;
        return vehicleInParkingSlot;
    }

    /**
     * Gets the vehicle from parking slot.
     *
     */

    public Vehicle getVehicle() {
        return vehicleInParkingSlot;
    }

    /**
     * Gets the occupied status of the parking slot.
     * Boolean returns true or false.
     *
     * @return isOccupied, the status of the parking slot,if it is occupied then
     *         true else false
     *
     */

    public boolean getIsOccupied() {
        return isOccupied;
    }

    /**
     * Gets the status of parking slot, if it belongs to staff
     * Boolean returns true or false.
     *
     * @return isStaff, the status of the parking slot, if it belongs to staff then
     *         true else false
     *
     */

    public boolean getIsStaff() {
        return isStaff;
    }

    /**
     * Setter if we want to change status of staff slot.
     *
     * @param boolean isStaff, can be set to true or false
     *
     */

    public void setStaff(boolean isStaff) {
        this.isStaff = isStaff;
    }

    /**
     * Gets the arrival time
     *
     */

    public LocalDateTime getArrivalTime() {
        return arrivalTime;
    }

    /**
     * Gives the details of the ParkingSlot
     *
     */

    public String toString() {
        if (vehicleInParkingSlot != null) {
            /* we check if it is a car instance */
            if (vehicleInParkingSlot.getClass().isInstance(Car.class)) {
                return "ParkingSlot Id : " + id + "\nVehicle In ParkingSlot : " + ((Car) vehicleInParkingSlot).getrego()
                        + "\nStaff Slot : " + isStaff + "\nOccupied : " + (isOccupied ? "Yes" : "No")
                        + "\nArrivalTime(atParkingSlot) : " + arrivalTime + "\n";
            }
        }

        return "ParkingSlot Id : " + id + "\nStaffSlot : " + isStaff + "\nOccupied? : "
                + (isOccupied ? "Yes\n" : "No\n");

    }
}
