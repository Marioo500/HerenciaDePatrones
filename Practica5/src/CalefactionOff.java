public class CalefactionOff implements Command{

    Calefaction calefaction;
    public CalefactionOff(Calefaction calefaction){
        this.calefaction = calefaction;
    }
    public void execute(){
        calefaction.off();
    }

    public void undo(){
        calefaction.on();
    }
}
