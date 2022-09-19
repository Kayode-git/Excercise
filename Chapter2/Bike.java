package Chapter2;

public class Bike {

    public boolean state;
    public int speed;

    public Bike(boolean state, int speed){
        this.state = state;
        this.speed = speed;
    }

    public void turnOn(){
        state = true;
    }
    public void turnOff(){
        state = false;
    }
    public boolean showState(){
        return state;
    }

    public void accelerate(){
        if(state){
            if(speed >= 0 && speed <= 20){
                speed = speed + 1;
            }
            if(speed > 20 && speed <= 30){
                speed = speed + 2;
            }
            if(speed > 30 && speed <= 40){
                speed = speed + 3;
            }
            if(speed > 40){
                speed = speed + 4;
            }
        }
    }

    public void decelerate(){
        if(state && speed > 0){
            if(speed >= 0 && speed <= 20){
                speed = speed - 1;
            }
            if(speed > 20 && speed <= 30){
                speed = speed - 2;
            }
            if(speed > 30 && speed <= 40){
                speed = speed - 3;
            }
            if(speed > 40){
                speed = speed - 4;
            }
        }
    }

    public int showSpeed(){
        return speed;
    }


    public String getGear() {
        String gear ="";
        if(state && speed > 0){
            if(speed >= 0 && speed <= 20){
                gear = "Gear1";
            }
            if(speed > 20 && speed <= 30){
                gear = "Gear2";
            }
            if(speed > 30 && speed <= 40){
                gear = "Gear3";
            }
            if(speed > 40){
                gear = "Gear4";
            }

        }
        return gear;
    }
}
