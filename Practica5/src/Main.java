public class Main {
    public static void main(String[] args) {
        RemoteControl remoteControl = new RemoteControl();

        Light livingRoom = new Light();
        Blinds blinds = new Blinds();
        Calefaction calefaction = new Calefaction();
        GarageDoor garageDoor = new GarageDoor();
        SecurityCameras securityCameras = new SecurityCameras();
        Speaker speaker = new Speaker();
        Sprinkler sprinkler = new Sprinkler();

        LightOn lightOn = new LightOn(livingRoom);
        LightOff lightOff = new LightOff(livingRoom);

        BlindsOpen blindsOpen = new BlindsOpen(blinds);
        BlindsClose blindsClose = new BlindsClose(blinds);

        CalefactionOn calefactionOn = new CalefactionOn(calefaction);
        CalefactionOff calefactionOff = new CalefactionOff(calefaction);

        GarageDoorUp garageDoorUp = new GarageDoorUp(garageDoor);
        GarageDoorDown garageDoorDown = new GarageDoorDown(garageDoor);

        SecurityCameraStart securityCameraStart = new SecurityCameraStart(securityCameras);
        SecurityCameraStop securityCameraStop = new SecurityCameraStop(securityCameras);

        SpeakerVolumeUp speakerVolumeUp = new SpeakerVolumeUp(speaker);
        SpeakerVolumeDown speakerVolumeDown = new SpeakerVolumeDown(speaker);

        SprinklerOn sprinklerOn = new SprinklerOn(sprinkler);
        SprinklerOff sprinklerOff = new SprinklerOff(sprinkler);

        remoteControl.setCommand(0, lightOn, lightOff);
        remoteControl.setCommand(1, blindsOpen, blindsClose);
        remoteControl.setCommand(2, calefactionOn, calefactionOff);
        remoteControl.setCommand(3, garageDoorUp, garageDoorDown);
        remoteControl.setCommand(4, securityCameraStart, securityCameraStop);
        remoteControl.setCommand(5, speakerVolumeUp, speakerVolumeDown);
        remoteControl.setCommand(6, sprinklerOn, sprinklerOff);


        remoteControl.onButtonWasPushed(1);
        remoteControl.onButtonWasPushed(3);
        remoteControl.onButtonWasPushed(5);

        remoteControl.offButtonWasPushed(0);
        remoteControl.offButtonWasPushed(2);
        remoteControl.offButtonWasPushed(4);
        remoteControl.offButtonWasPushed(6);
    }
}