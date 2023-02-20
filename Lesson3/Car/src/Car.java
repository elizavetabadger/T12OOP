public class Car extends Transport {
    public Car(String model, int maxSpeed, int year) {
        super(model, maxSpeed, year);
    }

    @Override
    public String toString() {
        return "Car{}";
    }
}
