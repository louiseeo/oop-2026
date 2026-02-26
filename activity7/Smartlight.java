package activity7;

public class Smartlight extends SmartDevice {
    private int brightness;

    public int getBrightness() {
        return brightness;
    }

    public Smartlight(String deviceName) {
        super(deviceName);
        this.brightness = 0;
    }

    @Override
    public void displayStatus() {
        super.displayStatus();
        System.out.println("Brightness: " + brightness);
    }

    public void setBrightness(int level) {
        if (getisOn()) {
            if (level >= 0 && level <= 100) {
                this.brightness = level;
            }
        }
    }

}
