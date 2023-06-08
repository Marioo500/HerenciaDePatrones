public class CHCheeseStylePizza extends Pizza{
    public CHCheeseStylePizza(){
        name = "CH Style Cheese Pizza";
        dough = "Extra thick crust dough";
        sauce = "Plum tomato sauce";
        toppings.add("Shredded Mozzarella Cheese");
    }
    void cut(){
        System.out.println("Cutting the pizza into square slices");
    }
}

