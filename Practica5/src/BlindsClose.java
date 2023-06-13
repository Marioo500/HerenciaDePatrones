public class BlindsClose implements Command{
    Blinds blinds;

    public BlindsClose(Blinds blinds){
        this.blinds = blinds;
    }

    public void execute(){
        blinds.close();
    }

    public void undo(){
        blinds.open();
    }
}
