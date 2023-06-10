import java.util.Random;

public class HasQuarterState implements State{
    Random randomWinner = new Random(System.currentTimeMillis());
    private static HasQuarterState hasQuarterState = new HasQuarterState();

    private HasQuarterState(){

    }
    public static HasQuarterState getInstance(){
        return hasQuarterState;
    }
    public void insertQuarter(){
        System.out.println("You already insert a quarter");
    }
    public void ejectQuarter(){
        System.out.println("You ejected the quarter");
        GumballMachine.getInstance().setState(NoQuarterState.getInstance());
    }
    public void turnCrank(){
        System.out.println("You turned the crank");
        int winner = randomWinner.nextInt(10);
        if (winner == 0 && GumballMachine.count > 1) {
            GumballMachine.getInstance().setState(WinnerState.getInstance());
        }
        else {
            GumballMachine.getInstance().setState(SoldState.getInstance());
        }
    }
    public void dispense(){
        System.out.println("You have not turn the crank yet");
    }
}

