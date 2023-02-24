import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.StringTokenizer;


public class CalculatorServer {
    public static void main(String args[]) throws IOException {
        try (ServerSocket serverSocket = new ServerSocket(1234)) {
            System.out.println("Сервер запущен, ожидаем соединение....");
            Socket socket = serverSocket.accept();
            System.out.println("Клиент подключился к серверу!");
            DataInputStream dataInputStream = new DataInputStream(socket.getInputStream());
            DataOutputStream dataOutputStream = new DataOutputStream(socket.getOutputStream());

        while (true) {
            String input = dataInputStream.readUTF();

            if (input.equals("end"))
                break;
            System.out.println("Наше уравнение: " + input);
            double result = 0;

            StringTokenizer x = new StringTokenizer(input);
            double num1 = Double.parseDouble(x.nextToken());
            String operation = x.nextToken();
            double num2 = Double.parseDouble(x.nextToken());

            if (operation.equals("+")) {
                result = num1 + num2;
            } else if (operation.equals("-")) {
                result = num1 - num2;
            } else if (operation.equals("*")) {
                result = num1 * num2;
            } else if (operation.equals("/")) {
                result = num1 / num2;
            } else {
                System.out.println("Ошибка");;
            }
            System.out.println("Ждите ответ ");
            dataOutputStream.writeUTF(Double.toString(result));
        }
    }catch (IOException e) {
            e.printStackTrace();
        }
}
}