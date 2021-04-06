package company.Task4;

public class Car {
    private String name;
    private String color;
    private int cost;

    public Car() {
    }

    public Car(String name, String color, int cost) {
        this.name = name;
        this.color = color;
        this.cost = cost;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    @Override
    public String toString() {
        return "Car{" +
                "Name='" + name + '\'' +
                ", Color='" + color + '\'' +
                ", Cost=" + cost +
                '}';
    }
}
