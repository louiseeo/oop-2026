package activity7;

public class SmartDevice {
    // Private fields
    private String deviceName;
    private boolean isOn;

    // Getters
    public String getDeviceName() {
        return deviceName;
    }

    public boolean isOn() {
        return isOn;
    }

    // Setters
    public void setDeviceName(String deviceName) {
        this.deviceName = deviceName;
    }

    public void setOn(boolean isOn) {
        this.isOn = isOn;
    }

    // Constructor
    public SmartDevice(String deviceName) {
        this.deviceName = deviceName;
        this.isOn = false;
    }

    // Method to switch the power
    public void togglePower() {
        isOn = !isOn;
    }

    // Display status of device
    public void displayStatus() {
         String state = "";
         if (isOn){
            state = "ON"; 
         } else {
            state = "OFF";
         }
        System.out.println("Device name: " + getDeviceName() + ", Power state: " + state);
    }
}
