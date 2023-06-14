public class DvdPlayer {

    public void on(){
        System.out.println("Dvd on");
    }

    public void play(String movie){
        System.out.println("Reproducing " + movie);
    }

    public void stop(){
        System.out.println("Stopping movie");
    }

    public void eject(){
        System.out.println("Ejecting");
    }

    public void off(){
        System.out.println("Dvd off");
    }
}
