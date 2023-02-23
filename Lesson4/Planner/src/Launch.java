import java.util.Scanner;

public class Launch {
    public static void run(){
        Task t1 = new Task("Проснуться", "Сергей", 3, "23.02");
        Task t2 = new Task("Покушать", "Елизавета", 3, "23.02");
        Task t3 = new Task("Поехать на Байкал", "Батон", 1, "01.03");
        Task t4 = new Task("Купить барабаны", "Багет", 2, "03.03");
        Planner myP = new Planner();
        myP.add(t1);
        myP.add(t2);
        myP.add(t3);
        myP.add(t4);
        Scanner scanner = new Scanner(System.in);
        Menu menu = new Menu(scanner);
        Add add = new Add(scanner);
        User user = new User(scanner, menu, myP, add);
        user.start();
    }
}
