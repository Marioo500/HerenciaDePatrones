public class RemoteControl {
    int i;
    Command[] onCommands;
    Command[] offCommands;
    Command undoCommand;

    public RemoteControl(){
        onCommands = new Command[7];
        offCommands = new Command[7];

        Command noCommand = new NoCommand();
        for (i = 0;  i< 7; i++){
            onCommands[i] = noCommand;
            offCommands[i] = noCommand;
        }
    }

    public void setCommand(int slot, Command onCommand, Command offCommand){
        onCommands[slot] = onCommand;
        offCommands[slot] = offCommand;
    }

    public void onButtonWasPushed(int slot){
        onCommands[slot].execute();
        undoCommand = offCommands[slot];
    }

    public void offButtonWasPushed(int slot){
        offCommands[slot].execute();
    }
    public void undoButtonWasPushed(){
        undoCommand.undo();
    }
}
