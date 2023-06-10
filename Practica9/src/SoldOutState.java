public class SoldOutState implements State{

    private static SoldOutState soldOutState = new SoldOutState();
    public static SoldOutState getInstance(){
        return soldOutState;
    }
    public void insertQuarter(){
        System.out.println("You cannot insert the machine is sold out");
    }
    public void ejectQuarter(){
        System.out.println("You cannot eject the machine is sold out");
    }
    public void turnCrank(){
        System.out.println("You cannot turn the crank is sold out");
    }
    public void dispense(){
        System.out.println("You cannot dispense the machine is sold out");
    }
}
