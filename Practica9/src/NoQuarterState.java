public class NoQuarterState implements State{

    private static NoQuarterState noQuarterState = new NoQuarterState();

    public static NoQuarterState getInstance(){
        return noQuarterState;
    }

    private NoQuarterState(){

    }
    public void insertQuarter(){
        System.out.println("You inserted a quarter");
        GumballMachine.getInstance().setState(HasQuarterState.getInstance());
    }
    public void ejectQuarter(){
        System.out.println("You have not inserted a quarter");
    }
    public void turnCrank(){
        System.out.println("You turned but there is no quarter");
    }
    public void dispense(){
        System.out.println("You need to pay first");
    }
}
