import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int op;
        Beverage beverage = null;
        System.out.println("Hello and welcome to Starbuzz!");

        System.out.println("Choose your Beverage");
        System.out.println("1. Espresso\n2. Dark Roast\n3. Decaf\n4. HouseBlend\n5. Latte");
        op = sc.nextInt();
        switch (op) {
            case 1 -> beverage = new Espresso();
            case 2 -> beverage = new DarkRoast();
            case 3 -> beverage = new Decaf();
            case 4 -> beverage = new HouseBlend();
            case 5 -> beverage = new Latte();
        }
        System.out.println("Choose your Condiment");
        System.out.println("1.Steamed milk\n2. Mocha\n 3. Soy\n4. Whip\n5. Total a pagar");
        op = 1;
        while (op != 5) {
            op = sc.nextInt();
            switch (op) {
                case 1 -> beverage = new SteamedMilk(beverage);
                case 2 -> beverage = new Mocha(beverage);
                case 3 -> beverage = new Soy(beverage);
                case 4 -> beverage = new Whip(beverage);
            }
            System.out.println(beverage.getDescription() + " $" +beverage.cost());
        }
    }
}