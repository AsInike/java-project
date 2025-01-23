import java.util.Scanner;

public class parking {

    static class ParkingSlot {
        int slotNumber;
        boolean isOccupied;
        String vehicleNumber;

        public ParkingSlot(int slotNumber) {
            this.slotNumber = slotNumber;
            this.isOccupied = false;
            this.vehicleNumber = null;
        }

        public void park(String vehicleNumber) {
            this.vehicleNumber = vehicleNumber;
            this.isOccupied = true;
        }

        public void vacate() {
            this.vehicleNumber = null;
            this.isOccupied = false;
        }
    }

    public static void main(String[] args) {
        int capacity = 5; // Number of parking slots
        ParkingSlot[] slots = new ParkingSlot[capacity];
        for (int i = 0; i < capacity; i++) {
            slots[i] = new ParkingSlot(i + 1);
        }

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Park Vehicle");
            System.out.println("2. Remove Vehicle");
            System.out.println("3. Display Parking Slots");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1: // Park a vehicle
                    System.out.print("Enter vehicle number: ");
                    String vehicleNumber = scanner.nextLine();
                    boolean parked = false;
                    for (ParkingSlot slot : slots) {
                        if (!slot.isOccupied) {
                            slot.park(vehicleNumber);
                            System.out.println("Vehicle parked in Slot " + slot.slotNumber);
                            parked = true;
                            break;
                        }
                    }
                    if (!parked) {
                        System.out.println("No available slots!");
                    }
                    break;

                case 2: // Remove a vehicle
                    System.out.print("Enter vehicle number to remove: ");
                    vehicleNumber = scanner.nextLine();
                    boolean found = false;
                    for (ParkingSlot slot : slots) {
                        if (slot.isOccupied && slot.vehicleNumber.equals(vehicleNumber)) {
                            slot.vacate();
                            System.out.println("Vehicle removed from Slot " + slot.slotNumber);
                            found = true;
                            break;
                        }
                    }
                    if (!found) {
                        System.out.println("Vehicle not found!");
                    }
                    break;

                case 3: // Display parking slots
                    System.out.println("\nParking Slot Status:");
                    for (ParkingSlot slot : slots) {
                        System.out.println("Slot " + slot.slotNumber + ": " +
                                (slot.isOccupied ? "Occupied by " + slot.vehicleNumber : "Empty"));
                    }
                    break;

                case 4: // Exit
                    System.out.println("Exiting...");
                    scanner.close();
                    return;

                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }
    }
}

