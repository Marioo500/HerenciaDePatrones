public class Main {
    public static void main(String[] args) {

       GumballMachine gumballMachine = GumballMachine.getInstance();

       System.out.println(gumballMachine);
       gumballMachine.insertQuarter();
       gumballMachine.turnCrank();

        gumballMachine.turnCrank();
        gumballMachine.turnCrank();

        gumballMachine.insertQuarter();
        gumballMachine.turnCrank();
    }
}