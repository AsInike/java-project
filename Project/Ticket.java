public class Ticket {
    vehicleType type;
    double fee;
    int timeIn;
    int timeOut;
    int date;
    int ticketID;
    String vehicleNumber;
    public Ticket(vehicleType type, double fee, int timeIn, int timeOut, int date, int ticketID, String vehicleNumber) {
        this.type = type;
        this.fee = fee;
        this.timeIn = timeIn;
        this.timeOut = timeOut;
        this.ticketID = ticketID;
        this.date = date;
        this.vehicleNumber = vehicleNumber;
    }
    public vehicleType getVehicleType() {
        return type;
    }

    // Getter for ticket ID
    public int getId() {
        return ticketID;
    }

    // Getter for vehicle number
    public String getVehicleNumber() {
        return vehicleNumber;
    }

    // Getter for entry time
    public int getEntryTime() {
        return timeIn;
    }

    // Getter for exit time
    public int getExitTime() {
        return timeOut;
    }

    // Getter for date
    public int getDate() {
        return date;
    }

    // Getter for fee
    public double getFee() {
        return fee;
    }
}
