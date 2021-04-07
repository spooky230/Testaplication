package company.task7.service;

import company.task7.model.Cashier;
import company.task7.model.Check;
import company.task7.model.Item;
import company.task7.model.Market;

import java.text.SimpleDateFormat;
import java.util.Map;

public class CheckService {
    public static final SimpleDateFormat DATE_FORMAT = new SimpleDateFormat("y/MM/dd  hh:mm");
    public void printCheck(Market market,Cashier cashier,Check check,int row){
        double cashAdder = 0;
        System.out.println(market.getName());
        System.out.println("Cashier: " + cashier.getFirstName() + " " + cashier.getLastName());
        System.out.println("Row: " + row);
        System.out.println(DATE_FORMAT.format(check.getDate()));
        System.out.println("Products: ");
        for (Map.Entry<Item,Integer> entry : check.getItems().entrySet()){
            System.out.println(entry.getKey().getName() + ":       " + entry.getValue() + " x " + entry.getKey().getPrice() + " = " + (entry.getValue() * entry.getKey().getPrice()));
            cashAdder = cashAdder + (entry.getValue() * entry.getKey().getPrice());
        }
        System.out.println("______________________________________");
        System.out.println("Total: " + cashAdder);
    }
}
