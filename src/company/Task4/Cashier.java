package company.Task4;

public class Cashier {
    private String name;
    private int row;
    public Cashier(String name,int row){
        this.name = name;
        this.row=  row;
    }
    public Cashier(){
    }
    public void setName(String name){
        this.name = name;
    }
    public void setRow(int row){
        this.row = row;
    }
    public String getName() {
        return name;
    }
    public int getRow(){
        return row;
    }
}
