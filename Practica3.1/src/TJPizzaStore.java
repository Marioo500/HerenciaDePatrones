public class TJPizzaStore extends PizzaStore{

    Pizza createPizza(String item) {
        if (item.equals("cheese")) {
            return new TJCheeseStylePizza();
        } else if (item.equals("veggie")) {
            return new TJVeggieStylePizza();
        } else if (item.equals("clam")) {
            return new TJClamStylePizza();
        } else if (item.equals("pepperoni")) {
            return  new TJPepperoniStylePizza();
        } else return null;
    }
}
