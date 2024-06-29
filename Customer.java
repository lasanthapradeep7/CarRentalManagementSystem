public class Customer extends User {
    private final int driverLicense;
    private final int paymentInfo;

    public Customer(int userId, String name, String email, String phoneNumber, int driverLicense, int paymentInfo) {
        super(userId, name, email, phoneNumber);
        this.driverLicense = driverLicense;
        this.paymentInfo = paymentInfo;
    }

    //Getter methods
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

    public int getDriverLicense() {
        return driverLicense;
    }

    public int getPaymentInfo() {
        return paymentInfo;
    }

    @Override
    public void login() {
        System.out.println(name + " logged in as Customer.");
    }

    @Override
    public void logout() {
        System.out.println(name + " logged out.");
    }

    public void makeReservation() {
        // Implementation for making a reservation
    }

    public void cancelReservation() {
        // Implementation for canceling a reservation
    }

    public void updateReservation() {
        // Implementation for updating a reservation
    }
}
