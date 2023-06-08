public class Main {
    public static void main(String[] args) {
        PizzaStore nyStore = new NYPizzaStore();
        PizzaStore chStore = new CHPizzaStore();
        PizzaStore caStore = new CAPizzaStore();
        PizzaStore tjStore = new TJPizzaStore();


        Pizza pizza = nyStore.orderPizza("cheese");

        pizza = chStore.orderPizza("veggie");

        pizza = caStore.orderPizza("pepperoni");

        pizza = tjStore.orderPizza("clam");
    }
}