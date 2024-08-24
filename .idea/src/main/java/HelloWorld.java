import java.util.Scanner;

public class HelloWorld {
    public static void main(String[] args) {
        //System.out.println("Hello, world!");
        printHelloName();
    }

    public static void printHelloName() {
        // Создание объекта Scanner для чтения данных с консоли
        Scanner scanner = new Scanner(System.in);

        // Запрос имени у пользователя
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        // Вывод приветствия с введенным именем
        System.out.println("Hello, " + name + "!");

        // Закрытие сканера
        scanner.close();
    }
}