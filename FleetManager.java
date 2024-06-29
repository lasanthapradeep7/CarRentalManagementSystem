public class FleetManager extends User {
    private final int employeeId;

    public FleetManager(int userId, String name, String email, String phoneNumber, int employeeId) {
        super(userId, name, email, phoneNumber);
        this.employeeId = employeeId;
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

    public int getEmployeeId() {
        return employeeId;
    } 

    @Override
    public void login() {
        System.out.println(name + " logged in as Fleet Manager.");
    }

    @Override
    public void logout() {
        System.out.println(name + " logged out.");
    }

    public void manageFleet() {
        // Implementation for managing fleet
    }

    public void generateReport() {
        // Implementation for generating report
    }
}
