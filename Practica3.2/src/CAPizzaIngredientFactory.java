public class CAPizzaIngredientFactory implements PizzaIngredientFactory{

    public Dough createDough(){
        return new ThickCrustDough();
    }
    public Sauce createSauce(){
        return new MarinaraSauce();
    }
    public Cheese createCheese(){
        return new MozzarellaCheese();
    }
    public Veggies[] createVeggies(){
        Veggies veggie[] = {new Garlic(), new Onion(), new Mushroom(), new RedPepper()};
        return veggie;
    }
    public Pepperoni createPepperoni(){
        return new SlicedPepperoni();
    }
    public Clam createClam(){
        return new FreshClams();
    }
}
