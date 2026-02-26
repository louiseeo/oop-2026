package activity7;

public class SmartDevice {
    String deviceName;
    boolean isOn = false;

    public SmartDevice(String deviceName, boolean isOn) {
        this.deviceName = deviceName;
        this.isOn = isOn;
    }

    public void togglePower(){
        isOn = !isOn; // switch
    }

    public void displayStatus(){
        System.out.println("Device name: " + deviceName + ", Power state: " + isOn);
    }
}
