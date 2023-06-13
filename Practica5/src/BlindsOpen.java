public class BlindsOpen implements Command{

    Blinds blinds;
    public BlindsOpen(Blinds blinds){
        this.blinds = blinds;
    }
    public void execute(){
        blinds.open();
    }

    public void undo(){
        blinds.close();
    }
}
