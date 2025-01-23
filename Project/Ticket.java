public class Ticket {
    double fee;
    double timeIn;
    double timeOut;
    double date;
    String vehicleNumber;
    String lot;
    String slot;
    int floor;
    double ticketID;
    String vehicle;

    public Ticket( int floor; String vehicle,double fee, double timeIn, double timeOut,
        double date, double ticketID, String vehicleNumber , String lot , String slot) {
        this.fee = fee;
        this.timeIn = System.currentTimeMillis();
        this.timeOut = timeOut;
        this.ticketID = ticketID;
        this.date = date;
        this.vehicleNumber = vehicleNumber;
        this.lot = lot;
        this.slot = slot;
        this.vehicle = vehicle;
        this.floor = floor;
    }
    public double getId() {
        return ticketID;
    }
    public String getVehicleNumber() {
        return vehicleNumber;
    }
    public double getEntryTime() {
        return timeIn;
    }
    public double getExitTime() {
        return timeOut;
    }
    public double getDate() {
        return date;
    }
    public double getFee() {
        return fee;
    }
    public String getLot() {
        return lot;
    }
    public String getSlot() {
        return slot;
    }
    public String getVehicle() {
        return vehicle;
    }
    public void setVehicle(String vehicle) {
        this.vehicle = vehicle;
    }
    public int getFloor() {
        return floor;
    }
}