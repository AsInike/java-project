public class Testing {
    public static void main(String[] args) {

        Ticket carTicket = new Ticket(vehicleType.CAR, 5.0, 1000, 1200, 20250122, 1, "ABC123");
        System.out.println("Ticket Details:");
        System.out.println("Ticket ID: " + carTicket.getId());
        System.out.println("Vehicle Number: " + carTicket.getVehicleNumber());  // Fixed method name
        System.out.println("Vehicle Type: " + carTicket.getVehicleType());  // Fixed method name
        System.out.println("Entry Time: " + carTicket.getEntryTime());
        System.out.println("Exit Time: " + carTicket.getExitTime());
        System.out.println("Date: " + carTicket.getDate());
        System.out.println("Fee: $" + carTicket.getFee());

        Ticket motorTicket = new Ticket(vehicleType.MOTOR, 3.0, 1100, 1300, 20250122, 2, "XYZ789");
        System.out.println("\nTicket Details:");
        System.out.println("Ticket ID: " + motorTicket.getId());
        System.out.println("Vehicle Number: " + motorTicket.getVehicleNumber());  // Fixed method name
        System.out.println("Vehicle Type: " + motorTicket.getVehicleType());  // Fixed method name
        System.out.println("Entry Time: " + motorTicket.getEntryTime());
        System.out.println("Exit Time: " + motorTicket.getExitTime());
        System.out.println("Date: " + motorTicket.getDate());
        System.out.println("Fee: $" + motorTicket.getFee());
    }
}
