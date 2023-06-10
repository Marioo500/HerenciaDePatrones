public class GumballMachine {

    State soldOutState;
    State noQuarterState;
    State hasQuarterState;
    State soldState;
    State winnerState;

    State state = NoQuarterState.getInstance();
    public static int count;
    private static GumballMachine gumballMachine = new GumballMachine(5);

    private GumballMachine(int numberGumballs){
        soldOutState = SoldOutState.getInstance();
        noQuarterState = NoQuarterState.getInstance();
        soldState = SoldState.getInstance();
        hasQuarterState = HasQuarterState.getInstance();
        winnerState = WinnerState.getInstance();
        GumballMachine.count = numberGumballs;
    }

    public static GumballMachine getInstance(){
        return gumballMachine;
    }
    public void insertQuarter(){
        state.insertQuarter();
    }

    public void ejectQuarter(){
        state.ejectQuarter();
    }

    public void turnCrank(){
        state.turnCrank();
        state.dispense();
    }

    void setState(State state){
        this.state = state;
    }

    void releaseBall(){
        System.out.println("A gumball comer rolling out");
        count = count - 1;
    }

    void refill(int count){
        GumballMachine.count = count;
        state = noQuarterState;
    }
    public State getSoldOutState() {
        return soldOutState;
    }

    public State getHasQuarterState(){
        return hasQuarterState;
    }

    public State getNoQuarterState(){
        return noQuarterState;
    }

    public State getSoldState(){
        return soldState;
    }

    public State getWinnerState(){
        return winnerState;
    }

    public String toString(){
        return "Gumball Machine";
    }

    public String getSoldStatetoString()
    {
        return soldState.toString();
    }
}
