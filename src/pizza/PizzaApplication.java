package pizza;

import pizza.model.*;
import pizza.service.DefaultDataGenerator;
import pizza.service.OrderService;

import java.util.Calendar;
import java.util.Date;

public class PizzaApplication {
    public static void main(String[] args) {
        OrderService orderService = new OrderService();
        Order order1 = DefaultDataGenerator.createOrder();
        orderService.saveReport(order1);
    }
}
