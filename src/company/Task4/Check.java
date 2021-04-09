package company.Task4;

import java.util.Date;
import java.util.LinkedList;
import java.util.List;

public class Check {
    private String storeName;
    private Cashier cashier;
    private List<Product> products = new LinkedList<>();
    private Date date;

    public Check(){

    }
    public Check(String storeName,Date date,Cashier cashier,List<Product> products){
        this.storeName = storeName;
        this.date = date;
        this.cashier = cashier;
        this.products = products;
    }

    public void setCashier(Cashier cashier) {
        this.cashier = cashier;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }

    public void setStoreName(String storeName) {
        this.storeName = storeName;
    }

    public Cashier getCashier() {
        return cashier;
    }

    public Date getDate() {
        return date;
    }

    public List<Product> getProducts() {
        return products;
    }

    public String getStoreName() {
        return storeName;
    }
//    public int CalculateTotals(){
//
//    }
//    public String printCheck(){
//
//    }
}
