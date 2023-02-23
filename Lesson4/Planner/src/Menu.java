import java.util.Scanner;

public class Menu {

    private final Scanner scanner;

    public Menu(Scanner scanner) {
        this.scanner = scanner;
    }

    public String selectFunction() {
        System.out.print("""
                Выберите действие:
                1. Все задачи
                2. Найти по теме
                3. Найти по автору
                4. Сортировка по приоритету
                5. Добавить задачу
                
                0. Выход
                """+ "\n");
        return scanner.nextLine();
    }

}