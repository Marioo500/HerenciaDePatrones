public class Main {
    public static void main(String[] args) {
        MallardDuck mallardDuck = new MallardDuck();

        WildTurkey wildTurkey = new WildTurkey();

        Duck turkeyadapter = new TurkeyAdapter(wildTurkey);

        System.out.println("Turkey");
        wildTurkey.gobble();
        wildTurkey.fly();
        System.out.println();

        System.out.println("Duck");
        mallardDuck.quack();
        mallardDuck.fly();

        System.out.println("Adapter");
        turkeyadapter.quack();
        turkeyadapter.fly();
    }
}