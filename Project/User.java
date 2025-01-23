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

    public boolean bookParkingSlot() { // this method will book a parking slot
        return false;
    }

    public boolean cancelBooking() { // this method will cancel a booking so that customer can cancel or keep the booking
        return false;
    }

    public void viewParkingHistory() { // this method will display the parking history for the (customer)
        return;
    }

    public boolean checkSlotAvailability() { // this method will check if the slot is available
        return false;
    }

    public boolean updateProfile() {
        return false;
    }

    // Admin Methods
    public boolean addParkingLot() {
        return false;
    }

    public boolean removeParkingLot() {
        return false;
    }

    public void generateReports() {
        return;
    }
}
