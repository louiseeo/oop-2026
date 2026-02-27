package activity7;

public class SmartThermostat extends SmartDevice {
    private double temperature; // private field

    // Getter
    public double getTemperature() {
        return temperature;
    }

    // Constructor
    public SmartThermostat(String deviceName) {
        super(deviceName);
        this.temperature = 0; // intialize temperature
    }

    @Override
    public void displayStatus() {
        super.displayStatus(); // call the parent method
        System.out.println("Temperature: " + temperature + " C");
    }

    // Method that prints warning if temperature is above 30°C
    public void setTemperature(double temp) {
        if (temp > 30) {
            System.out.println("Warning: Temperature above 30°C!");
        }
        this.temperature = temp;
    }
}
