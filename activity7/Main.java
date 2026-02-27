package activity7;

import java.util.List;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Instantiate a SmartLight
        SmartLight light = new SmartLight("Living Room Light");
        light.setBrightness(80); // set brightness before turning on
        light.togglePower(); // power on
        light.setBrightness(90); // set brightness

        // Instantiate a SmartThermostat
        SmartThermostat thermostat = new SmartThermostat("Living Room Thermostat");
        thermostat.togglePower(); // power on

        // Arraylist to store devices
        List<SmartDevice> devices = new ArrayList<>();
        devices.add(light);
        devices.add(thermostat);

        for (SmartDevice d : devices) {
            // Check if device is thermostat then set temperature for order of printing
            if (d instanceof SmartThermostat) {
                ((SmartThermostat) d).setTemperature(32);
            }
            d.displayStatus(); // display all devices
            System.out.println(); // add space between each devices
        }
    }
}
