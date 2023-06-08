public class CHPizzaStore extends PizzaStore{
    Pizza createPizza(String item) {
        if (item.equals("cheese")) {
            return new CHCheeseStylePizza();
        } else if (item.equals("veggie")) {
            return new CHVeggieStylePizza();
        } else if (item.equals("clam")) {
            return new CHClamStylePizza();
        } else if (item.equals("pepperoni")) {
            return new CHPepperoniStylePizza();
        } else return null;
    }
}
