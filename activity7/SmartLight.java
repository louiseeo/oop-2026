package activity7;

public class SmartLight extends SmartDevice {
    private int brightness; // private field

    // Getter
    public int getBrightness() {
        return brightness;
    }

    // Constructor
    public SmartLight(String deviceName) {
        super(deviceName);
        this.brightness = 0; // initialize brightness to 0
    }

    @Override
    public void displayStatus() {
        super.displayStatus(); // call the parent method
        System.out.println("Brightness: " + brightness);
    }

    // Method that sets brightness if the device isOn
    public void setBrightness(int level) {
        if (isOn()) {
            if (level >= 0 && level <= 100) {
                this.brightness = level;
            }
        }
    }

}
