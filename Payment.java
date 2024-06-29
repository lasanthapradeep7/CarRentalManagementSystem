import java.util.Date;
public class Payment {
    private final int paymentId;
    private final int reservationId;
    private final int amount;
    private final Date date;
    private final String paymentMethod;

    public Payment(int paymentId, int reservationId, int amount, Date date, String paymentMethod) {
        this.paymentId = paymentId;
        this.reservationId = reservationId;
        this.amount = amount;
        this.date = date;
        this.paymentMethod = paymentMethod;
    }

    //Getter methods
    public int getpaymentId() {
        return paymentId;
    }

    public int getreservationId() {
        return reservationId; 
      }

    public int getamount() { 
        return amount;
    }

    public Date getdate() {
        return date;
    }

    public String getpaymentMethod() {
        return paymentMethod;
    }

    public void processPayment() {
        // Implementation for processing payment
    }
}
