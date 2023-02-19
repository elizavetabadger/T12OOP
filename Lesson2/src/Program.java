public class Program {

    // class Person - модификаторы
    public static void main(String[] args) {
        Person bob = new Person("Bob", 23, "Moscow, Tverskaya Street", "+12334567");
        bob.displayName();     //  метод public
        bob.displayAge();      //  метод имеет модификатор по умолчанию
        bob.displayPhone();    //  метод protected
//        bob.displayAddress();  // ! Ошибка, метод private

        System.out.println(bob.name);      // модификатор по умолчанию
        System.out.println(bob.address);   // модификатор public
        System.out.println(bob.age);       // модификатор protected
//        System.out.println(bob.phone);   // ! Ошибка, модификатор private
    }

//  //Геттер и Сеттер

    public static void main(String[] args) {
        Person bob = new Person1("Bob", 27);
        System.out.println(bob.getAge());      // 27
        bob.setAge(28);
        System.out.println(bob.getAge());      // 28
        bob.setAge(123450);
        System.out.println(bob.getAge());      // 28
    }
    }

    // Car - Пример с Car
//    public static void main(String[] args) {
//        Car mazda = new Car();
//        mazda.setModel("mazda");  // установили значение поля
//        System.out.println(mazda.getModel());
//    }
//
//}