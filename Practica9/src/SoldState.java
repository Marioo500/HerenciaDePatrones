public class SoldState implements State{
    private static SoldState soldState = new SoldState();

    public static SoldState getInstance(){
        return soldState;
    }
    public void insertQuarter(){
        System.out.println("Please wait, we are already giving you a gumball");
    }
    public void ejectQuarter(){
        System.out.println("Sorry, you already turned de crank");
    }
    public void turnCrank(){
        System.out.println("Turning twice will not giving you another gumball");
    }
    public void dispense(){
        GumballMachine.getInstance().releaseBall();
        if (GumballMachine.count > 0) {
            GumballMachine.getInstance().setState(GumballMachine.getInstance().getNoQuarterState());
        }
        else {
            GumballMachine.getInstance().setState(GumballMachine.getInstance().getSoldOutState());
        }
    }
}
