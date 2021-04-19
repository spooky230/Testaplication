package pizza;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
public class Order {
    private Pizza pizza;
    private Client client;
    private Date orderedTime;
    private Date deliveredTime;
    public static final SimpleDateFormat DATE_FORMAT = new SimpleDateFormat("dd.MM.yyyy hh:mm:ss");
    public Client getClient() {
        return client;
    }

    public Date getDeliveredTime() {
        return deliveredTime;
    }

    public Date getOrderedTime() {
        return orderedTime;
    }

    public Pizza getPizza() {
        return pizza;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public void setDeliveredTime(Date deliveredTime) {
        this.deliveredTime = deliveredTime;
    }

    public void setOrderedTime(Date orderedTime) {
        this.orderedTime = orderedTime;
    }

    public void setPizza(Pizza pizza) {
        this.pizza = pizza;
    }
    public void setOrderedTime(String time){
        try {
            this.orderedTime = DATE_FORMAT.parse(time);
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
    public void setDeliveredTime(String time){
        try {
            this.deliveredTime = DATE_FORMAT.parse(time);
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }

}
