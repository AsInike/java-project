import java.util.Date;

public class User {
    private String name;
    private String userType;
    private String email;
    private String phoneNumber;
    private Date dob;
    private String gender;

    // Constructors
    public User(String name, String userType, String email, String phoneNumber) {
        this.name = name;
        this.userType = userType;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }
    // for customer because admin no need input DOB and gender
    public User(String name, String userType, String email, String phoneNumber, Date dob, String gender) {
        this(name, userType, email, phoneNumber);
        this.dob = dob;
        this.gender = gender;
    }

    // Methods
    public void displayUserDetails() {
        System.out.println("Name: " + name);
        System.out.println("User Type: " + userType);
        System.out.println("Email: " + email);
        System.out.println("Phone Number: " + phoneNumber);
        if (userType.equals("Customer")) {
            System.out.println("Date of Birth: " + dob);
            System.out.println("Gender: " + gender);
        }
    }

    public boolean isAdmin() {
        return "Admin".equalsIgnoreCase(userType);
    }

    public boolean bookParkingSlot(String slotId, Date time, int duration) {
        // Logic to book a parking slot
        System.out.println("Booking slot: " + slotId);
        return true; // Simulating successful booking
    }

    public boolean cancelBooking(String bookingId) {
        // Logic to cancel a booking
        System.out.println("Cancelling booking: " + bookingId);
        return true; // Simulating successful cancellation
    }

    public void viewParkingHistory() {
        // Logic to display parking history
        System.out.println("Displaying parking history for " + name);
    }

    public boolean checkSlotAvailability(String slotId, Date time, int duration) {
        // Logic to check availability
        System.out.println("Checking availability for slot: " + slotId);
        return true; // Simulating availability
    }

    public boolean updateProfile(String email, String phoneNumber) {
        this.email = email;
        this.phoneNumber = phoneNumber;
        System.out.println("Profile updated successfully.");
        return true;
    }

    // Admin-Specific Methods
    public boolean addParkingSlot(String slotId, String location) {
        if (!isAdmin()) {
            System.out.println("Access denied. Only admins can add parking slots.");
            return false;
        }
        System.out.println("Adding new parking slot: " + slotId);
        return true; // Simulating successful addition
    }

    public boolean removeParkingSlot(String slotId) {
        if (!isAdmin()) {
            System.out.println("Access denied. Only admins can remove parking slots.");
            return false;
        }
        System.out.println("Removing parking slot: " + slotId);
        return true; // Simulating successful removal
    }

    public void generateReports(Date startDate, Date endDate) {
        if (!isAdmin()) {
            System.out.println("Access denied. Only admins can generate reports.");
            return;
        }
        System.out.println("Generating reports from " + startDate + " to " + endDate);
    }
}
