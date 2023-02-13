
public class Main {
    public static void main(String[] args) {
        Car car1 = new Car("FK120-A", 10, 20.2, "red", 50, "Honda");
        car1.getInfo();
        car1.road("Дзержинского 40");
        car1.powerCar();
        car1.stopCar();

        Car car2 = new Car("FK131", 12, 16.8, "red", 50, "Honda");

        System.out.println("Сравниваем машинки:" + car1.compareCar(car2));
        // прописываем метод и условия, если вернулоссь да и нет
    }

}