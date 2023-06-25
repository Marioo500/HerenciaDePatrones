public class Main {
    public static void main(String[] args) {
      Main simulator = new Main();
      AbstractDuckFactory duckFactory = new CountingDuckFactory();
      simulator.simulate(duckFactory);
    }

    void simulate(AbstractDuckFactory duckFactory){
        Quackable red =  duckFactory.createRedheadDuck();
        Quackable call = duckFactory.createDuckCall();
        Quackable rubber = duckFactory.createRubberDuck();
        Quackable gooseDuck = new GooseAdapter(new Goose());

        Flock flock = new Flock();
        flock.add(red);
        flock.add(rubber);
        flock.add(call);
        flock.add(gooseDuck);

        Flock flockMallards = new Flock();
        flockMallards.add(duckFactory.createMallardDuck());
        flockMallards.add(duckFactory.createMallardDuck());
        flockMallards.add(duckFactory.createMallardDuck());
        flockMallards.add(duckFactory.createMallardDuck());

        flock.add(flockMallards);

        System.out.println("\nFlock of Ducks");
        Quackologist quackologist = new Quackologist();
        flock.registerObserver(quackologist);
        simulate(flock);



        System.out.println("The ducks quacked " + QuackCounter.getNumberOfQuacks() + " times");
    }

    void simulate(Quackable duck){
        duck.quack();
    }
}