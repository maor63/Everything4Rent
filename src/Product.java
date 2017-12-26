import java.util.Date;

public class Product {

    protected int ID;
    protected String info;
    protected String cancellationPolicy;
    Date startRentDate;
    Date endRentDate;

    public Product(int ID, String info, String cancellationPolicy, Date startRentDate, Date endRentDate) {
        this.ID = ID;
        this.info = info;
        this.cancellationPolicy = cancellationPolicy;
        this.startRentDate = startRentDate;
        this.endRentDate = endRentDate;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public String getCancellationPolicy() {
        return cancellationPolicy;
    }

    public void setCancellationPolicy(String cancellationPolicy) {
        this.cancellationPolicy = cancellationPolicy;
    }

    public Date getStartRentDate() {
        return startRentDate;
    }

    public void setStartRentDate(Date startRentDate) {
        this.startRentDate = startRentDate;
    }

    public Date getEndRentDate() {
        return endRentDate;
    }

    public void setEndRentDate(Date endRentDate) {
        this.endRentDate = endRentDate;
    }
}
