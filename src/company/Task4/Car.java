package company.Task4;

public class Car {
    public String getName() {
        return Name;
    }

    public Car() {
    }

    public void setName(String name) {
        Name = name;
    }

    public Car(String name, String color, int cost) {
        Name = name;
        Color = color;
        Cost = cost;
    }

    public String getColor() {
        return Color;
    }

    public void setColor(String color) {
        Color = color;
    }

    public int getCost() {
        return Cost;
    }

    public void setCost(int cost) {
        Cost = cost;
    }

    private String Name;
    private String Color;
    private int Cost;

}
