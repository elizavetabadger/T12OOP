import java.util. *;
public class Main {
    public static void main(String[] args) {
        VendingMachine machine = new VendingMachine(10, new ArrayList<>());
        machine.add(new Product("N1", 12));
        machine.add(new Product("N2", 43));
        machine.add(new Product("N3", 35));
        machine.add(new Product("N4", 12));

        try {
            System.out.println(machine.getProductName("N2"));
        } catch (Exception exception) {
            System.out.println(exception.getMessage());
        }

        try {
            System.out.println(machine.getProductPrice(43));
        } catch (Exception exception) {
            System.out.println(exception.getMessage());
        }
    }
}