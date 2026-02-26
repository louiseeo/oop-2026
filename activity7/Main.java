package activity7;

public class Main {
    public static void main(String[] args) {
        Smartlight light = new Smartlight("Living Room Light");
        light.setBrightness(80);
        light.togglePower();
        light.setBrightness(80);
        light.displayStatus();

        SmartThermostat thermostat = new SmartThermostat("Living Room Thermostat");
        thermostat.togglePower();
        thermostat.setTemperature(32);
        thermostat.displayStatus();
    }
}
