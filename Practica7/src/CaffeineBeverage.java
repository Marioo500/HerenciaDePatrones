import java.util.Scanner;

public abstract class CaffeineBeverage {

    final void prepareRecipe(){
        boilWater();
        brew();
        pourInCup();
        if(customerWantsCondiments()) {
            addCondiments();
        }
    }
    abstract void brew();
    abstract void addCondiments();

    private void boilWater(){
        System.out.println("Boiling water");
    }
    private void pourInCup(){
        System.out.println("Pouring into cup");
    }

    private boolean customerWantsCondiments(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Would you like condiments?");
        String op = scanner.next();
        return op.equals("y");
    }
}
