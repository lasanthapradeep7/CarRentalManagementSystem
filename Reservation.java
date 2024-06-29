public class Reservation {
    private final int reservationId;
    private final int customerId;
    private final int carId;
    private final String startDate;
    private final String endDate;
    private final String status;

    public Reservation(int reservationId, int customerId, int carId, String startDate, String endDate, String status) {
        this.reservationId = reservationId;
        this.customerId = customerId;
        this.carId = carId;
        this.startDate = startDate;
        this.endDate = endDate;
        this.status = status;
    }

    //Getter methods
    public int getReservationId() {
        return reservationId;
    }

    public int getCustomerId() {
        return customerId;
    }

    public int getCarId() {
        return carId;
    }

    public String getStartDate() {
        return startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public String getStatus() {
        return status;
    }

    public void createReservation() {
        // Implementation for creating a reservation
    }

    public void cancelReservation() {
        // Implementation for canceling a reservation
    }

    public void updateReservation() {
        // Implementation for updating a reservation
    }
}
