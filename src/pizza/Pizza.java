package pizza;

import java.util.HashMap;
import java.util.Map;

public class Pizza {
    private String name;
    private Map<Component,Amount> components;
    private double basePrice = 5;

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public Pizza(String name) {
        this.name = name;
        components = new HashMap<>();
    }

    public double getBasePrice() {
        return basePrice;
    }

    public Map<Component, Amount> getComponents() {
        return components;
    }
}
