package company.Task4;
public class Product {
    private String name;
    private String company;
    private int cost;
    private int count;
    public Product(){

    }
    public Product(String name,String company,int cost,int count){
        this.name = name;
        this.company = company;
        this.cost =  cost;
        this.count = count;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setCompany(String company){
        this.company = company;
    }
    public void setCost(int cost){
        this.cost = cost;
    }
    public void setCount(int count){
        this.count = count;
    }
    public String getName(){
        return name;
    }
    public String getCompany(){
        return company;
    }
    public int getCost(){
        return cost;
    }
    public int getCount(){
        return count;
    }

}
