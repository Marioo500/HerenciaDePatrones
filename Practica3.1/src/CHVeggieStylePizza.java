public class CHVeggieStylePizza extends Pizza{

    public CHVeggieStylePizza(){
        name = "CH Style Veggie Pizza";
        dough = "Extra thick crust dough";
        sauce = "Plum tomato sauce";
        toppings.add("Shredded Mozzarella Cheese");
    }

    void cut(){
        System.out.println("Cutting the pizza into square slices");
    }
}
