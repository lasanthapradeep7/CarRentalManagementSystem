import java.util.Date;
public class Maintenance {
    private final int maintenanceId;
    private final int carId;
    private final Date date;
    private final String details;
    private final String status;

    public Maintenance(int maintenanceId, int carId, Date date, String details, String status) {
        this.maintenanceId = maintenanceId;
        this.carId = carId;
        this.date = date;
        this.details = details;
        this.status = status;
    }
   //getter methods
    public int getmaintenanceId(){
        return maintenanceId;
    }
    
    public int getcarId(){
        return carId;
    }

    public Date getdate(){
        return date;
    }

    public String getdetails(){
        return details;
    }
    
    public String getstatus(){
        return status;
    }

    public void performMaintenance() {
        // Implementation for performing maintenance
    }
}
