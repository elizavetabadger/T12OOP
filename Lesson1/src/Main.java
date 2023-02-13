
public class Main {
    public static void main(String[] args) {
        Car car = new Car("xtreme", 10, 20.2, "red", 50);
        car.getInfo();
        car.road("Дзержинского 40");
        car.powerCar();
        car.road( "Дзержинского 40");
        car.stopCar();
    }
}