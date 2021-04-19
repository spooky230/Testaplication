package pizza;

public class Main {
    public static void main(String[] args) {
        Component chicken = new Component("Chicken", 1.5);
        Component pepperoni = new Component("Pepperoni", 2);
        Component mushrooms = new Component("Pushrooms", 1);
        Component cheese = new Component("Cheese", 2.5);
        Component beef = new Component("Beef", 3);
        Component olives = new Component("Olives", 1.75);
        Component mayo = new Component("Mayo", 1);
        Component pineapple = new Component("Pineapple", 4);
        Component tomatoSauce = new Component("TomatoSauce", 1.25);
        Pizza beef_and_olives = new Pizza("Pizza with beef and olives");
        beef_and_olives.getComponents().put(beef,Amount.A_LOT);
        beef_and_olives.getComponents().put(cheese,Amount.MORE);
        beef_and_olives.getComponents().put(mushrooms,Amount.MEDIUM);
        beef_and_olives.getComponents().put(tomatoSauce,Amount.MEDIUM);
        beef_and_olives.getComponents().put(olives,Amount.LESS);
        Pizza standard = new Pizza("Standard");
        standard.getComponents().put(tomatoSauce,Amount.MEDIUM);
        standard.getComponents().put(cheese,Amount.MEDIUM);
        Pizza chicken_and_pineapple = new Pizza("pizza with chicken and pineapple");
        chicken_and_pineapple.getComponents().put(chicken,Amount.A_LOT);
        chicken_and_pineapple.getComponents().put(pineapple,Amount.A_LOT);
        chicken_and_pineapple.getComponents().put(mayo,Amount.A_LOT);
        chicken_and_pineapple.getComponents().put(pepperoni,Amount.A_LOT);
        Client client1 = new Client("Josh","Italy210","23012276523");
        Client client2 = new Client("Jeff","London63","12745622110");
    }
}
