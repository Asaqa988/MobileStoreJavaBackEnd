package MobileStoreBackEnd.example.BackEndProjectForMobileStore.Model;

public class ModelMobile {

    private String mobileID;
    private String color;
    private String operatingSystem;
    private String numberOfCameras;

    public ModelMobile() {
    }

    public ModelMobile(String mobileID, String color, String operatingSystem, String numberOfCameras) {
        this.mobileID = mobileID;
        this.color = color;
        this.operatingSystem = operatingSystem;
        this.numberOfCameras = numberOfCameras;
    }

    public String getMobileID() {
        return mobileID;
    }

    public void setMobileID(String mobileID) {
        this.mobileID = mobileID;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getOperatingSystem() {
        return operatingSystem;
    }

    public void setOperatingSystem(String operatingSystem) {
        this.operatingSystem = operatingSystem;
    }

    public String getNumberOfCameras() {
        return numberOfCameras;
    }

    public void setNumberOfCameras(String numberOfCameras) {
        this.numberOfCameras = numberOfCameras;
    }
}
