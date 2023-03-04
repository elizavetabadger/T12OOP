public class CalculatorTest {
    public static void main(String[]args){
        //  Создает экземпляр класса MyOpFactory
        MyOpFactory myOpFactory = new MyOpFactory();
        //  Создает экземпляр класса Calculator с агрументом в виде объекта MyOpFactory
        //  создает калькулятор
        Calculator calc = new Calculator(myOpFactory);
        //  Выполняет метод exec для объекта Calculator
        //  запускает калькулятор
        calc.exec();
    }
}
