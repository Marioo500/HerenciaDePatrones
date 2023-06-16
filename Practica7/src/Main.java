public class Main {
    public static void main(String[] args) {
       Tea tea = new Tea();
       Coffe coffe = new Coffe();
       Latte latte = new Latte();
       Macchiato macchiato = new Macchiato();
       Chocolate chocolate = new Chocolate();

       System.out.println("Preparing Tea\n");
       tea.prepareRecipe();

       System.out.println("Preparing Coffee\n");
       coffe.prepareRecipe();

       System.out.println("Preparing latte\n");
       latte.prepareRecipe();

       System.out.println("Preparing macchiato\n");
       macchiato.prepareRecipe();

       System.out.println("Preparing Chocolate\n");
       chocolate.prepareRecipe();


    }
}