public class CalefactionOn implements Command{

    Calefaction calefaction;
    public CalefactionOn(Calefaction calefaction){
        this.calefaction = calefaction;
    }
    public void execute(){
        calefaction.on();
    }

    public void undo(){
        calefaction.off();
    }
}
