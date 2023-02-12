/*Напишите класс Car.
          В классе должна храниться следующая информация:
        название автомобиля  - model;
        год выпуска - year;
        стоимость - price;
        цвет - color;
        объем двигателя - power.

        Добавьте в класс Car метод getInfo без параметров,
        который будет печать на экране значения полей объекта класса  model , power и year.

        Доработайте класс Car.
           В классе должна храниться следующая информация:
	Свойство - которое говорит заведен авто или нет
	Метод - запуска автомобиля
    Метод - остановки автомобиля
	Метод дороги - при вызове, в качестве аргумента передаем место назначения
	И если авто заведён - выводим, что мы на такой-то авто едем место назначения
	Если не заведён - сообщить, что авто не заведено. И мы не можем ехать

*/

public class Car {
    String model;
    int year;
    double price;
    String color;
    int power;
    boolean status;
    Car(String model, int year, double price, String color, int power){
        this.model = model;
        this.year = year;
        this.price = price;
        this.color = color;
        this.power = power;
        this.status = false;
    }
    public void getInfo(){
        System.out.println(model + " " + year + " " + price + " " + color + " " + power);
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public double getPrice() {
        return price;
    }

    public String getColor() {
        return color;
    }

    public int getPower() {
        return power;
    }

    public boolean isStatus() {
        return status;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public void powerCar(){
        status = true;
        System.out.println( "Автомобиль заведен");
    }
    public void stopCar(){
        status = false;
        System.out.println( "Автомобиль остановлен");
    }
    public void road(String adress){
        if (status == false){
            System.out.println( "Автомобиль стоит");
        }
        else {
        System.out.println( "Мы едем на + adress");
        }
    }
}
