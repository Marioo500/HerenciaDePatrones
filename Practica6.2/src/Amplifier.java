public class Amplifier {
    DvdPlayer dvdPlayer;
    public void on(){
        System.out.println("Amplifier on");
    }

    public void setDvd(DvdPlayer dvdPlayer){
        this.dvdPlayer = dvdPlayer;
    }

    public void setSurroundSound(){
        System.out.println("Surround mode on");
    }

    public void setVolume(int n){
        System.out.println("Volume on" + n);
    }

    public void off(){
        System.out.println("Amplifier off");
    }
}
