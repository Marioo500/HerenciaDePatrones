import java.util.ArrayList;

public class Flock implements Quackable{
    ArrayList quackers = new ArrayList();

    public void add(Quackable quacker){
        quackers.add(quacker);
    }

    @Override
    public void quack() {
        for (Object quacker : quackers) {
            Quackable quackable = (Quackable) quacker;
            quackable.quack();
        }
    }

    @Override
    public void registerObserver(Observer observer) {

    }

    @Override
    public void notifyObservers() {

    }
}
