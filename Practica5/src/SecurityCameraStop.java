public class SecurityCameraStop implements Command{

    SecurityCameras securityCameras;
    public SecurityCameraStop(SecurityCameras securityCameras){
        this.securityCameras = securityCameras;
    }
    public void execute(){
        securityCameras.stopRecord();
    }

    public void undo(){
        securityCameras.startRecord();
    }
}
