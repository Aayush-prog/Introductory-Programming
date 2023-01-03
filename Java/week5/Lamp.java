import java.util.*;
class Lamp{
    boolean isOn;
    void turnOn(){
        isOn=true;
        System.out.println("Light is on?"+isOn);
    }
    void turnOff(){
        isOn=false;
        System.out.println("Light on?"+isOn);
    }
class main{
    public static void main(String[] args){
        Lamp led=new Lamp();
        Lamp halogen=new Lamp();
        led.turnOn();
        halogen.turnOff();
    }
}
}