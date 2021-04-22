package pizza.service;

import company.task7.model.Item;
import pizza.model.Amount;
import pizza.model.Component;
import pizza.model.Order;

import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;

public class OrderService {
    public static final SimpleDateFormat DATE_FORMAT = new SimpleDateFormat("y.MM.dd  HH:mm:ss");
    public static final SimpleDateFormat REPORT_NAME_FORMAT = new SimpleDateFormat("y-MM-dd  HH-mm-ss");
    public static final String NAME_FORMAT = "\"%s\"";
    public static final String TOP_BORDER = "____________________________________________________";
    public static final String HEADER = "|                      PIZZA ORDER                 |";
    public static final String EMPTY_LINE = "|                                                  |";
    public static final String MIDDLE_BORDER = "|__________________________________________________|";
    public static final String ORDER_DATE = "| Order date    :  %-32s|%n";
    public static final String DELIVERY_DATE = "| Delivery date :  %-32s|%n";
    public static final String CLIENT_NAME = "| Client  :    %-36.34s|%n";
    public static final String CLIENT_PHONE = "| Phone   :    %-36s|%n";
    public static final String CLIENT_ADDRESS = "| Address :    %-36.34s|%n";
    public static final String PIZZA_NAME = "|              PIZZA: %-29.25s|%n";
    public static final String COMPONENT = "|  %-15s%-17s%8.2f x %3s  |%n";
    public static final String TOTAL_PRICE = "| Total price:                         $%9.2f  |%n";
    public static final String PRICE_PER_PIZZA = "|  Price per %-27.25s $%8.2f |%n";

    public String prepareOrder(Order order){
        String report = TOP_BORDER;
        report += System.lineSeparator();
        report += HEADER+ System.lineSeparator();
        report += EMPTY_LINE+ System.lineSeparator();
        report += String.format(ORDER_DATE,DATE_FORMAT.format(order.getOrderedTime()));
        report += String.format(DELIVERY_DATE,DATE_FORMAT.format(order.getDeliveredTime()));
        report += EMPTY_LINE+ System.lineSeparator();
        report += String.format(CLIENT_NAME, order.getClient().getName());
        report += String.format(CLIENT_PHONE, order.getClient().getPhoneNumber());
        report += String.format(CLIENT_ADDRESS, order.getClient().getAddress());
        report += EMPTY_LINE+ System.lineSeparator();
        String formatedPizzaName = String.format(NAME_FORMAT,order.getPizza().getName());
        report += String.format(PIZZA_NAME,formatedPizzaName);
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
        report += String.format(PRICE_PER_PIZZA, formatedPizzaName,cash);
        report += EMPTY_LINE+ System.lineSeparator();
        report += MIDDLE_BORDER+ System.lineSeparator();
        report += String.format(TOTAL_PRICE,cash);
        report += MIDDLE_BORDER+ System.lineSeparator();
        return report;
    }
    public void printReport(String report){
        System.out.println(report);
    }
    public void writeReport(String report, Date date){
        String FILE = "report_" + REPORT_NAME_FORMAT.format(date) + ".txt";
        try {
            FileWriter writer =  new FileWriter(FILE);
            writer.write(report);
            writer.flush();
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public void saveReport(Order order){
        String report = prepareOrder(order);
        printReport(report);
        writeReport(report,order.getOrderedTime());

    }
}
