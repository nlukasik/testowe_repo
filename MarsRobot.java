public class MarsRobot implements Robot {
    String status;
    int speed;
    float temperature;
    String opportunity;

    public void checkTemperature() {
        if (temperature < -80) {
            status = "powrot do domu";
            speed = 5;
            opportunity = "uhaha";
        }
    }

    void showAttributes() {
        System.out.println("Status: " + status);
        System.out.println("Predkosc: " + speed);
        System.out.println("Temperetura: " + temperature);
        System.out.println("Oportunity: " + opportunity);
    }

    public void checkStatus(){
        System.out.println("status: " + status);
    }
}