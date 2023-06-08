public class CHClamStylePizza extends Pizza{

    public CHClamStylePizza(){
        name = "CH Style Clam Pizza";
        dough = "Extra thick crust dough";
        sauce = "Plum tomato sauce";
        toppings.add("Shredded Mozzarella Cheese");
    }

    void cut(){
        System.out.println("Cutting the pizza into square slices");
    }
}
