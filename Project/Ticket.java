public enum vehicleType{
    CAR , MOTOR; 
}
public class Ticket {
    String vehicleType;
    double fee;
    int timeIn;
    int timeOut;
    int date;
    int ticketID;
    String vehicleNumber;
    public Ticket ( String vehicleType, double fee, int timeIn, int timeOut, int date, int ticketID, String vehicleNumber ){
        this.vehicleType = vehicleType;
        this.fee = fee; 
        this.timeIn = timeIn;
        this.timeOut = timeOut;
        this.ticketID = ticketID;
        this.date = date;
        this.vehicleNumber = vehicleNumber;
    }
    public String vehicleType(){
        return vehicleType;
    }
    public int getId(){
        return ticketID;
    }
    public String getvehicleNumber(){
        return vehicleNumber;
    }
    public int getEntryTime(){
        return timeIn;
    }
    public int getExitTime(){
        return timeOut;
    }
    public int getDate(){
        return date;
    }
    public double getFee(){
        return fee;
    }
    public String getType(){
        return vehicleType;
    }
}
