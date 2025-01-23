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

    // For customer because admin does not need to input DOB and gender
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

    public boolean isAdmin() { // this method will check if the user is an admin
        return false;
    }

    public boolean bookParkingSlot(String slotId, Date time, int duration) { // this method will book a parking slot
        return false;
    }

    public boolean cancelBooking(String bookingId) { // this method will cancel a booking so that customer can cancel or keep the booking
        return false;
    }

    public void viewParkingHistory() { // this method will display the parking history for the (customer)
        return;
    }

    public boolean checkSlotAvailability(String slotId, Date time, int duration) { // this method will check if the slot is available
        return false;
    }

    public boolean updateProfile(String email, String phoneNumber) {
        return false;
    }

    // Admin-Specific Methods
    public boolean addParkingSlot(String slotId, String location) {
        return false;
    }

    public boolean removeParkingSlot(String slotId) {
        return false;
    }

    public void generateReports(Date startDate, Date endDate) {
        return;
    }
}
