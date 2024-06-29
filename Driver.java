public class Driver extends User {
    private final int driverLicense;

    public Driver(int userId, String name, String email, String phoneNumber, int driverLicense) {
        super(userId, name, email, phoneNumber);
        this.driverLicense = driverLicense;
    }

    //getter methods
    @Override
    public int getUserId() {
        return userId;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    @Override
    public void login() {
        System.out.println(name + " logged in as Driver.");
    }

    @Override
    public void logout() {
        System.out.println(name + " logged out.");
    }

    public void pickupCar() {
        // Implementation for picking up a car
    }

    public void returnCar() {
        // Implementation for returning a car
    }
}
