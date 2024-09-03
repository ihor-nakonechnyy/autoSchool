import java.util.Scanner;

public class HelloWorld {
    public static void main(String[] args) {
        //System.out.println("Hello, world!");
        printHelloName();
    }

    public static void printHelloName() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        System.out.println("Hello, " + name + "!");
        scanner.close();
    }
}


/*import java.util.Scanner; — це директива імпорту в Java,
яка дозволяє використовувати клас Scanner з пакету java.util у
вашій програмі. Пакет java.util містить різні утилітні класи,
які допомагають у розробці програм, і Scanner є одним із них.*/

//Клас Scanner використовується для зручного читання вводу з різних джерел

/*import: Це ключове слово в Java, яке використовується для імпортування класів
або всіх класів з пакету у вашу програму.*/


