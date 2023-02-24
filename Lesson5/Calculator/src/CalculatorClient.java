import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class CalculatorClient {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

        try (Socket socket = new Socket("localhost", 1234)) {
            DataInputStream dataInputStream = new DataInputStream(socket.getInputStream());
            DataOutputStream dataOutputStream = new DataOutputStream(socket.getOutputStream());
            while (true) {

                System.out.print("Введите данные уравнения через пробел: ");
                System.out.println("x оператор y");

                String input = scanner.nextLine();
                if (input.equals("end"))
                    break;

                dataOutputStream.writeUTF(input);

                String answer = dataInputStream.readUTF();
                System.out.println("Результат вычислений = " + answer);
            }
        } catch (UnknownHostException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}