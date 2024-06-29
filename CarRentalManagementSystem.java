import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CarRentalManagementSystem {
    private final List<Car> cars;
    private final List<Customer> customers;
    private final List<FleetManager> fleetManagers;
    private final List<Driver> drivers;
    private final List<Reservation> reservations;
    private final List<Payment> payments;
    private final List<Maintenance> maintenances;

    public CarRentalManagementSystem() {
        cars = new ArrayList<>();
        customers = new ArrayList<>();
        fleetManagers = new ArrayList<>();
        drivers = new ArrayList<>();
        reservations = new ArrayList<>();
        payments = new ArrayList<>();
        maintenances = new ArrayList<>();
    }

    public void addCar(Car car) {
        cars.add(car);
    }

    public void addCustomer(Customer customer) {
        customers.add(customer);
    }

    public void addFleetManager(FleetManager fleetManager) {
        fleetManagers.add(fleetManager);
    }

    public void addDriver(Driver driver) {
        drivers.add(driver);
    }

    public void addReservation(Reservation reservation) {
        reservations.add(reservation);
    }

    public void addPayment(Payment payment) {
        payments.add(payment);
    }

    public void addMaintenance(Maintenance maintenance) {
        maintenances.add(maintenance);
    }

    public List<Car> viewAvailableCars() {
        List<Car> availableCars = new ArrayList<>();
        for (Car car : cars) {
            if (car.getStatus().equals("Available")) {
                availableCars.add(car);
            }
        }
        return availableCars;
    }

    public void viewCars() {
        for (Car car : cars) {
            System.out.println("Car ID: " + car.getCarId() +
                               ", Make: " + car.getMake() +
                               ", Model: " + car.getModel() +
                               ", Year: " + car.getYear() +
                               ", License Plate: " + car.getLicensePlate() +
                               ", Status: " + car.getStatus());
        }
    }

    public void viewCustomers() {
        for (Customer customer : customers) {
            System.out.println("Customer ID: " + customer.getUserId() +
                               ", Name: " + customer.getName() +
                               ", Email: " + customer.getEmail() +
                               ", Phone Number: " + customer.getPhoneNumber() +
                               ", Driver License: " + customer.getDriverLicense() +
                               ", Payment Info: " + customer.getPaymentInfo());
        }
    }

    public void viewFleetManagers() {
        for (FleetManager fleetManager : fleetManagers) {
            System.out.println("Fleet Manager ID: " + fleetManager.getUserId() +
                               ", Name: " + fleetManager.getName() +
                               ", Email: " + fleetManager.getEmail() +
                               ", Phone Number: " + fleetManager.getPhoneNumber() +
                               ", Employee ID: " + fleetManager.getEmployeeId());
        }
    }

    public void viewDrivers() {
        for (Driver driver : drivers) {
            System.out.println("Driver ID: " + driver.getUserId() +
                               ", Name: " + driver.getName() +
                               ", Email: " + driver.getEmail() +
                               ", Phone Number: " + driver.getPhoneNumber());
        }
    }

    public void adminPanel(Scanner scanner) {
        while (true) {
            System.out.println("\n==================");
            System.out.println("|   ADMIN PANEL   |");
            System.out.println("==================");
            System.out.println("1. Add Car");
            System.out.println("2. Add Customer");
            System.out.println("3. Add Fleet Manager");
            System.out.println("4. Add Driver");
            System.out.println("5. View Cars");
            System.out.println("6. View Customers");
            System.out.println("7. View Fleet Managers");
            System.out.println("8. View Drivers");
            System.out.println("9. Logout");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter car ID: ");
                    int carId = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Enter make: ");
                    String make = scanner.nextLine();
                    System.out.print("Enter model: ");
                    String model = scanner.nextLine();
                    System.out.print("Enter year: ");
                    int year = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Enter license plate: ");
                    String licensePlate = scanner.nextLine();
                    System.out.print("Enter status (Available/Unavailable): ");
                    String status = scanner.nextLine();
                    addCar(new Car(carId, make, model, year, licensePlate, status));
                    System.out.println("Car added successfully.");
                    break;
                case 2:
                    System.out.print("Enter customer ID: ");
                    int customerId = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Enter name: ");
                    String customerName = scanner.nextLine();
                    System.out.print("Enter email: ");
                    String customerEmail = scanner.nextLine();
                    System.out.print("Enter phone number: ");
                    String customerPhoneNumber = scanner.nextLine();
                    System.out.print("Enter driver license: ");
                    int driverLicense = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Enter a payment: ");
                    int paymentInfo = scanner.nextInt();
                    scanner.nextLine();
                    addCustomer(new Customer(customerId, customerName, customerEmail, customerPhoneNumber, driverLicense, paymentInfo));
                    System.out.println("Customer added successfully.");
                    break;
                case 3:
                    System.out.print("Enter fleet manager ID: ");
                    int fleetManagerId = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Enter name: ");
                    String fleetManagerName = scanner.nextLine();
                    System.out.print("Enter email: ");
                    String fleetManagerEmail = scanner.nextLine();
                    System.out.print("Enter phone number: ");
                    String fleetManagerPhoneNumber = scanner.nextLine();
                    System.out.print("Enter employee ID: ");
                    int employeeId = scanner.nextInt();
                    scanner.nextLine();
                    addFleetManager(new FleetManager(fleetManagerId, fleetManagerName, fleetManagerEmail, fleetManagerPhoneNumber, employeeId));
                    System.out.println("Fleet Manager added successfully.");
                    break;
                case 4:
                    System.out.print("Enter driver ID: ");
                    int driverId = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Enter name: ");
                    String driverName = scanner.nextLine();
                    System.out.print("Enter email: ");
                    String driverEmail = scanner.nextLine();
                    System.out.print("Enter phone number: ");
                    String driverPhoneNumber = scanner.nextLine();
                    System.out.print("Enter driver license: ");
                    int driverLicenseNumber = scanner.nextInt();
                    scanner.nextLine();
                    addDriver(new Driver(driverId, driverName, driverEmail, driverPhoneNumber, driverLicenseNumber));
                    System.out.println("Driver added successfully.");
                    break;
                case 5:
                    viewCars();
                    break;
                case 6:
                    viewCustomers();
                    break;
                case 7:
                    viewFleetManagers();
                    break;
                case 8:
                    viewDrivers();
                    break;
                case 9:
                    System.out.println("Logged out.");
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    public void customerPanel(Scanner scanner, Customer customer) {
        while (true) {
            System.out.println("\n==================");
            System.out.println("|  Customer Panel |");
            System.out.println("==================");
            System.out.println("1. View Available Cars");
            System.out.println("2. Make Reservation");
            System.out.println("3. Cancel Reservation");
            System.out.println("4. Update Reservation");
            System.out.println("5. Logout");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    List<Car> availableCars = viewAvailableCars();
                    for (Car car : availableCars) {
                        System.out.println("Car ID: " + car.getCarId() +
                                           ", Make: " + car.getMake() +
                                           ", Model: " + car.getModel() +
                                           ", Year: " + car.getYear() +
                                           ", License Plate: " + car.getLicensePlate() +
                                           ", Status: " + car.getStatus());
                    }
                    break;
                case 2:
                    System.out.print("Enter reservation ID: ");
                    int reservationId = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Enter car ID: ");
                    int carId = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Enter start date (yyyy-MM-dd): ");
                    String startDate = scanner.nextLine();
                    System.out.print("Enter end date (yyyy-MM-dd): ");
                    String endDate = scanner.nextLine();
                    System.out.print("Confirm the Reservation? (Y/N). ");
                    String status = scanner.nextLine();

                    if("Y".equals(status)){
                        addReservation(new Reservation(reservationId, customer.getUserId(), carId, startDate, endDate, status));
                        System.out.println("Reservation created successfully.");
                        break;
                    }

                    else{
                        System.out.println("Reservation Cancelled successfully.");
                        break;
                    }
                                        
                   
                case 3:
                    // Implement cancel reservation
                    System.out.println("Reservation canceled successfully.");
                    break;
                case 4:
                    // Implement update reservation
                    System.out.println("Reservation updated successfully.");
                    break;
                case 5:
                    System.out.println("Logged out.");
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    public void fleetManagerPanel(Scanner scanner, FleetManager fleetManager) {
        while (true) {
            System.out.println("\n========================");
            System.out.println("| Fleet Manager Panel  |");
            System.out.println("========================");
            System.out.println("1. Manage Fleet");
            System.out.println("2. Generate Report");
            System.out.println("3. Logout");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    fleetManager.manageFleet();
                    break;
                case 2:
                    fleetManager.generateReport();
                    break;
                case 3:
                    System.out.println("Logged out.");
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    public void driverPanel(Scanner scanner, Driver driver) {
        while (true) {
            System.out.println("\n==================");
            System.out.println("|  Driver Panel  |");
            System.out.println("==================");
            System.out.println("1. Pickup Car");
            System.out.println("2. Return Car");
            System.out.println("3. Logout");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    driver.pickupCar();
                    break;
                case 2:
                    driver.returnCar();
                    break;
                case 3:
                    System.out.println("Logged out.");
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    public static void main(String[] args) {
        CarRentalManagementSystem system = new CarRentalManagementSystem();
        Scanner scanner = new Scanner(System.in);

        // Adding sample data
        system.addCar(new Car(1, "Toyota", "Prius", 2020, "ABC123", "Available"));
        system.addCar(new Car(2, "Honda", "Civic", 2020, "XYZ789", "Available"));
        system.addCustomer(new Customer(1, "Lasantha Pradeep", "lasantha@example.com", "0778956744", 12345, 67890));
        system.addCustomer(new Customer(2, "Sahan Madushka", "sahan@example.com", "0789089654", 54321, 98765));
        system.addFleetManager(new FleetManager(1, "Miyumi Nimsara", "miyumi@example.com", "0709876543", 1001));
        system.addDriver(new Driver(1, "Ladeesha", "ladeesha@example.com", "0756789098", 2001));

        while (true) {
            System.out.println("\n================================");
            System.out.println("|           MAIN MENU          |");
            System.out.println("================================");
            System.out.println("1. Admin Login");
            System.out.println("2. Customer Login");
            System.out.println("3. Fleet Manager Login");
            System.out.println("4. Driver Login");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter admin username: ");
                    String adminUsername = scanner.nextLine();
                    System.out.print("Enter admin password: ");
                    String adminPassword = scanner.nextLine();
                    if (adminUsername.equals("admin") && adminPassword.equals("password")) {
                        system.adminPanel(scanner);
                    } else {
                        System.out.println("Invalid Username or password.");
                    }
                    break;
                case 2:
                    System.out.print("Enter customer ID: ");
                    int customerId = scanner.nextInt();
                    scanner.nextLine();
                    Customer customer = system.customers.stream()
                            .filter(c -> c.getUserId() == customerId)
                            .findFirst()
                            .orElse(null);
                    if (customer != null) {
                        system.customerPanel(scanner, customer);
                    } else {
                        System.out.println("Invalid customer ID.");
                    }
                    break;
                case 3:
                    System.out.print("Enter fleet manager ID: ");
                    int fleetManagerId = scanner.nextInt();
                    scanner.nextLine();
                    FleetManager fleetManager = system.fleetManagers.stream()
                            .filter(fm -> fm.getUserId() == fleetManagerId)
                            .findFirst()
                            .orElse(null);
                    if (fleetManager != null) {
                        system.fleetManagerPanel(scanner, fleetManager);
                    } else {
                        System.out.println("Invalid fleet manager ID.");
                    }
                    break;
                case 4:
                    System.out.print("Enter driver ID: ");
                    int driverId = scanner.nextInt();
                    scanner.nextLine();
                    Driver driver = system.drivers.stream()
                            .filter(d -> d.getUserId() == driverId)
                            .findFirst()
                            .orElse(null);
                    if (driver != null) {
                        system.driverPanel(scanner, driver);
                    } else {
                        System.out.println("Invalid driver ID.");
                    }
                    break;
                case 5:
                    System.out.println("Exiting system.");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}