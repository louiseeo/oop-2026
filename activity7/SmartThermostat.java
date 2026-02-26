package activity7;

public class SmartThermostat extends SmartDevice {
    private double temperature;

    public double getTemperature() {
        return temperature;
    }

    public SmartThermostat(String deviceName) {
        super(deviceName);
        this.temperature = 0; // intialize temprature
    }

    @Override
    public void displayStatus() {
        super.displayStatus();
        System.out.println("Temperature: " + temperature + " C");
    }

    public void setTemperature(double temp) {
        if (temp > 30) {
            System.out.println("Warning: Temperature above 30C!");
        }
        this.temperature = temp;
    }
}
