package pizza.service;

import company.task7.model.Item;
import pizza.model.Amount;
import pizza.model.Component;
import pizza.model.Order;

import java.util.Map;

public class OrderService {
    public static final String TOP_BORDER = "____________________________________________________";
    public static final String HEADER = "|                      PIZZA ORDER                 |";
    public static final String EMPTY_LINE = "|                                                  |";
    public static final String MIDDLE_BORDER = "|__________________________________________________|";
    public static final String ORDER_DATE = "| Order date    :  %s            |%n";
    public static final String DELIVERY_DATE = "| Delivery date :  %s             |%n";
    public static final String CLIENT_NAME = "| Client  :    %s                                |%n";
    public static final String CLIENT_PHONE = "| Phone   :    %s                          |%n";
    public static final String CLIENT_ADDRESS = "| Address :    %s       |%n";
    public static final String PIZZA_NAME = "|              PIZZA: \"%s\"                  |%n";
    public static final String COMPONENT = "|  %s    %s              %s x %s  |%n";

    public String prepareOrder(Order order){
        String report = TOP_BORDER;
        report += System.lineSeparator();
        report += TOP_BORDER+ System.lineSeparator();
        report += HEADER+ System.lineSeparator();
        report += EMPTY_LINE+ System.lineSeparator();
        report += String.format(ORDER_DATE, order.getOrderedTime());
        report += String.format(DELIVERY_DATE, order.getDeliveredTime());
        report += EMPTY_LINE+ System.lineSeparator();
        report += String.format(CLIENT_NAME, order.getClient().getName());
        report += String.format(CLIENT_PHONE, order.getClient().getPhoneNumber());
        report += String.format(CLIENT_ADDRESS, order.getClient().getAddress());
        report += EMPTY_LINE+ System.lineSeparator();
        report += String.format(PIZZA_NAME, order.getPizza().getName());
        report += EMPTY_LINE+ System.lineSeparator();
        ///////////////////////////////////////////////////////////////////////////////////////////st
        double cash = order.getPizza().getBasePrice();
        for (Map.Entry<Component, Amount> entry : order.getPizza().getComponentsMap().entrySet()) {
            report += String.format(COMPONENT, entry.getKey().getName(), entry.getValue(), entry.getKey().getPrice(), entry.getValue().getPriceMultiplier());
            cash = cash + (entry.getValue().getPriceMultiplier() * entry.getKey().getPrice());
        }
//        report += "|  Tomato sauce    Medium              2,30 x 1,0  |"+ System.lineSeparator();
//        report += "|  Hen             Less               15,00 x 0,5  |"+ System.lineSeparator();
//        report += "|  Onion           A lot               3,12 x 2,0  |"+ System.lineSeparator();
        ///////////////////////////////////////////////////////////////////////////////////////////end
        report += String.format("|  Price per \"%s\"                  $%f   |%n", order.getPizza().getName(),cash);
        report += EMPTY_LINE+ System.lineSeparator();
        report += MIDDLE_BORDER+ System.lineSeparator();
        report += String.format("| Total price:                         $%f  |%n",cash);
        report += MIDDLE_BORDER+ System.lineSeparator();
        return report;
    }
}
