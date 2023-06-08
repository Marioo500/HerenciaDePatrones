import java.util.ArrayList;

public abstract class Pizza {
    String name;
    String dough;
    String sauce;
    ArrayList toppings = new ArrayList();

    void prepare(){
        System.out.println("Preparing " + name);
        System.out.println("Tossing dough " + name);
        System.out.println("Adding sauce " + name);
        for (Object topping : toppings) {
            System.out.println(" " + topping);
        }
    }

    void bake(){
        System.out.println("Bake for 25 minutes at 350");
    }
    void cut(){
        System.out.println("Cutting the pizza into ");
    }

    void box(){
        System.out.println("Palce pizza in official PizzaStore box");
    }

    public String getName(){
        return name;
    }
}
