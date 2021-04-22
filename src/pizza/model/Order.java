package pizza.model;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class Order {
    private Map<Pizza,Integer> pizzaMap;
    private Client client;
    private Date orderedTime;
    private Date deliveredTime;
    public static final SimpleDateFormat DATE_FORMAT = new SimpleDateFormat("dd.MM.yyyy hh:mm:ss");
    public Order(Client client){
        this.client = client;
        this.orderedTime = new Date();
        this.pizzaMap = new HashMap<>();
    }

    public Client getClient() {
        return client;
    }

    public Date getDeliveredTime() {
        return deliveredTime;
    }

    public Date getOrderedTime() {
        return orderedTime;
    }

    public Map<Pizza,Integer> getPizzaMap() {
        return pizzaMap;
    }
    public void addPizza(Pizza pizza){
        addPizza(pizza,1);
    }
    public void addPizza(Pizza pizza,int count){
        if(pizzaMap.containsKey(pizza)){
            Integer pizzaCount = pizzaMap.get(pizza);
            pizzaCount += count;
            pizzaMap.replace(pizza,pizzaCount);
        }
        else{
            pizzaMap.put(pizza,count);
        }
    }

    public void setDeliveredTime(Date deliveredTime) {
        this.deliveredTime = deliveredTime;
    }

    public void setOrderedTime(Date orderedTime) {
        this.orderedTime = orderedTime;
    }

    public void setPizza(Map<Pizza,Integer> pizza) {
        this.pizzaMap = pizza;
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
