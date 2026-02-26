package activity7;

public class SmartDevice {
    private String deviceName;
    private boolean isOn;

    public String getDeviceName() {
        return deviceName;
    }

    public void setDeviceName(String deviceName) {
        this.deviceName = deviceName;
    }

    public boolean isOn() {
        return isOn;
    }

    public void setOn(boolean isOn) {
        this.isOn = isOn;
    }

    public SmartDevice(String deviceName) {
        this.deviceName = deviceName;
        this.isOn = false;
    }

    public void togglePower() {
        isOn = !isOn; // switch
    }

    public void displayStatus() {
        System.out.println("Device name: " + deviceName + ", Power state: " + isOn);
    }
}
