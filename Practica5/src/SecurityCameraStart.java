public class SecurityCameraStart implements Command{

    SecurityCameras securityCameras;
    public SecurityCameraStart(SecurityCameras securityCameras){
        this.securityCameras = securityCameras;
    }
    public void execute(){
        securityCameras.startRecord();
    }

    public void undo(){
        securityCameras.stopRecord();
    }
}
