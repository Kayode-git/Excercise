package Chapter2;

public class AirConditioner2 {
    public String power;
    public int temperature;

    public void turnOn() {
        power = "on";
    }

    public String getPower() {
        return power;
    }

    public void turnOff() {
        power = "off";
    }

    public void increaseTemperature(int increase) {
        temperature = temperature + increase ;

    }

    public int getTemperature() {
        return temperature;
    }

    public void decreaseTemperature() {
        temperature = temperature -1;
    }

    public void increaseTemperatureBeyond30(int increase) {
        temperature = temperature + increase;
    }

    public void decreaseTemperatureBelow16(int decrease) {
        temperature =temperature - decrease;
    }
}
