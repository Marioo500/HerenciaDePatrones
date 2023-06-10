public class WinnerState implements State{
    private static WinnerState winnerState = new WinnerState();

    public static WinnerState getInstance(){
        return winnerState;
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
        System.out.println("You are a winner, you get two gumballs");
        GumballMachine.getInstance().releaseBall();
        if (GumballMachine.count == 0) {
            GumballMachine.getInstance().setState(SoldOutState.getInstance());
        }
        else {
            GumballMachine.getInstance().releaseBall();
            if(GumballMachine.count > 0) {
                GumballMachine.getInstance().setState(NoQuarterState.getInstance());
            }
            else{
                GumballMachine.getInstance().setState(SoldOutState.getInstance());
            }
        }
    }
}
