public class Car {
    private final int carId;
    private final String make;
    private final String model;
    private final int year;
    private final String licensePlate;
    private String status;
    
    public Car(int carId, String make, String model, int year, String licensePlate, String status) {
        this.carId = carId;
        this.make = make;
        this.model = model;
        this.year = year;
        this.licensePlate = licensePlate;
        this.status = status;
    }
 //Getter methods
    public int getCarId() {
        return carId;
    }

    public String getModel() {
        return model;
    }

    public String getMake() {
        return make;
    }

    public int getYear() {
        return year;
    }

    public String getLicensePlate(){
        return licensePlate;
    }

    public String getStatus(){
        return status;
    }

    public void setAvailable(boolean available) {
    }

    public void updateStatus(String status) {
        this.status = status;
    }

    public void scheduleMaintenance() {
        // Implementation for scheduling maintenance
    }
}
