package activity7;

public class Smartlight extends SmartDevice{
    int brightness;

    public Smartlight(String deviceName, boolean isOn, int brightness) {
        super(deviceName, isOn);
        this.brightness = brightness;
    }
    
    public void setBrightness(int level){
        if (isOn){
            if(level >= 0 && level <= 100){
                this.brightness = level;
                System.out.println("Brightness ");
            }
        }
    }
    @Override
    //dipa tapos sir


    }


    

    

