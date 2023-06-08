public class NYPizzaStore extends PizzaStore {
    Pizza createPizza(String item) {
        if (item.equals("cheese")) {
            return new NYStyleCheesePizza();
        } else if (item.equals("veggie")) {
            return new NYVeggieStylePizza();
        } else if (item.equals("clam")) {
            return new NYClamStylePizza();
        } else if (item.equals("pepperoni")) {
            return new NYPepperoniStylePizza();
        } else return null;
    }
}