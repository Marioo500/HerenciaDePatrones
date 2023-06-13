public class SprinklerOff implements Command{

    Sprinkler sprinkler;
    public SprinklerOff(Sprinkler sprinkler){
        this.sprinkler = sprinkler;
    }
    public void execute(){
        sprinkler.off();
    }

    public void undo(){
        sprinkler.on();
    }
}
