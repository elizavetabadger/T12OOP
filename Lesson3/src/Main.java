public class Main {
    public static void main(String[] args) {

        Person tom = new Person("Tom");
        Person bob = new Person("Bob");

        tom.displayId();
        bob.displayId();
//        System.out.println(Person.counter);

        // изменяем Person.counter
//        Person.counter = 8;

        Person sam = new Person("Kay");
        sam.displayId();

        Person.displayCounter();
    }
}