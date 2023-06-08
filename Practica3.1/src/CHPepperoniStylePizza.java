public class CHPepperoniStylePizza extends Pizza{

    public CHPepperoniStylePizza(){
        name = "CH Style Pepperoni Pizza";
        dough = "Extra thick crust dough";
        sauce = "Plum tomato sauce";
        toppings.add("Shredded Mozzarella Cheese");
    }
    void cut(){
        System.out.println("Cutting the pizza into square slices");
    }
}
