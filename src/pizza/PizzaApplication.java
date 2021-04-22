package pizza;

import pizza.model.*;
import pizza.service.OrderService;

import java.util.Calendar;
import java.util.Date;

public class PizzaApplication {
    public static void main(String[] args) {
        Component chicken = new Component("Chicken", 1.5);
        Component pepperoni = new Component("Pepperoni", 2);
        Component mushrooms = new Component("Pushrooms", 1);
        Component cheese = new Component("Cheese", 2.5);
        Component beef = new Component("Beef", 3);
        Component olives = new Component("Olives", 1.75);
        Component mayo = new Component("Mayo", 1);
        Component pineapple = new Component("Pineapple", 4);
        Component tomatoSauce = new Component("TomatoSauce", 1500.255);
        Pizza beef_and_olives = new Pizza("Pizza with beef and olives");
        beef_and_olives.getComponentsMap().put(beef, Amount.A_LOT);
        beef_and_olives.getComponentsMap().put(cheese,Amount.MORE);
        beef_and_olives.getComponentsMap().put(mushrooms,Amount.MEDIUM);
        beef_and_olives.getComponentsMap().put(tomatoSauce,Amount.MEDIUM);
        beef_and_olives.getComponentsMap().put(olives,Amount.LESS);
        Pizza standard = new Pizza("StandardAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        standard.getComponentsMap().put(tomatoSauce,Amount.MEDIUM);
        standard.getComponentsMap().put(cheese,Amount.LESS);
        Pizza chicken_and_pineapple = new Pizza("pizza with chicken and pineapple");
        chicken_and_pineapple.getComponentsMap().put(chicken,Amount.A_LOT);
        chicken_and_pineapple.getComponentsMap().put(pineapple,Amount.A_LOT);
        chicken_and_pineapple.getComponentsMap().put(mayo,Amount.A_LOT);
        chicken_and_pineapple.getComponentsMap().put(pepperoni,Amount.A_LOT);
        Client client1 = new Client("JoshAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA","Italy210","23012276523");
        Client client2 = new Client("Jeff","London63","12745622110");
        Order order1 = new Order(client1);
        Date delivered = new Date();
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(delivered);
        calendar.add(Calendar.HOUR,1);
        calendar.add(Calendar.MINUTE,12);
        calendar.add(Calendar.SECOND,48);
        delivered = calendar.getTime();
        order1.setDeliveredTime(delivered);
        order1.setPizza(standard);
        OrderService orderService = new OrderService();
        orderService.saveReport(order1);
        System.out.println("don't delete this");
        System.out.println("don't delete this1");
        System.out.println("don't delete this2");
    }
}
