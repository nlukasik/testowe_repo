import java.sql.SQLOutput;

public class MarsApplication {
    public static void main(String[ ] args){
        MarsRobot spirit = new MarsRobot();
        spirit.status= "eksploracja";
        spirit.speed= 2;
        spirit.temperature= -60;
        spirit.opportunity= "uhahaha";
        spirit.showAttributes();

        System.out.println("Zwiekszamy predkosc do 3");
        spirit.speed=3;
        spirit.showAttributes();

        System.out.println("Zmiana temperatury na -90");
        spirit.temperature = -90;
        spirit.showAttributes();
        System.out.println("Sprawdzenie temperetaury");
        spirit.checkTemperature();
        spirit.showAttributes();
        spirit.checkStatus();

    }




}
