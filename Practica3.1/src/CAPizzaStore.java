public class CAPizzaStore extends PizzaStore{
    Pizza createPizza(String item) {
        if (item.equals("cheese")) {
            return new CACheeseStylePizza();
        } else if (item.equals("veggie")) {
            return new CAVeggieStylePizza();
        } else if (item.equals("clam")) {
            return new CAClamStylePizza();
        } else if (item.equals("pepperoni")) {
            return  new CAPepperoniStylePizza();
        } else return null;
    }
}
