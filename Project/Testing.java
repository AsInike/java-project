public class Testing {
    
    public static void main(String[] args) {
        Ticket ticket = new Ticket(100.0, 10.0, 20.0, 1.0, 1.0, "ABC123");
        System.out.println("Fee: " + ticket.getFee());
        System.out.println("Vehicle Number: " + ticket.getVehicleNumber());
        System.out.println("Entry Time: " + ticket.getEntryTime());
        System.out.println("Exit Time: " + ticket.getExitTime());
        System.out.println("Date: " + ticket.getDate());
        System.out.println("Ticket ID: " + ticket.getId()); 
    }
    }