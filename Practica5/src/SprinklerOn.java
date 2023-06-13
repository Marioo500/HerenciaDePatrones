public class SprinklerOn implements Command{

    Sprinkler sprinkler;
    public SprinklerOn(Sprinkler sprinkler){
        this.sprinkler = sprinkler;
    }
    public void execute(){
        sprinkler.on();
    }

    public void undo(){
        sprinkler.off();
    }
}
