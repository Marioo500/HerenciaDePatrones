public class SpeakerVolumeUp implements Command{

    Speaker speaker;
    public SpeakerVolumeUp(Speaker speaker){
        this.speaker = speaker;
    }
    public void execute(){
        speaker.volumeUp();
    }

    public void undo(){
        speaker.volumeDown();
    }
}
