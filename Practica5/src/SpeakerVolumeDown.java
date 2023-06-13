public class SpeakerVolumeDown implements Command{

    Speaker speaker;
    public SpeakerVolumeDown(Speaker speaker){
        this.speaker = speaker;
    }
    public void execute(){
        speaker.volumeDown();
    }

    public void undo(){
        speaker.volumeUp();
    }
}
