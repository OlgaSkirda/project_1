import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите строку");
        if(scanner.hasNextLine()){
            String phrase = scanner.nextLine();

            if(phrase.contains("Java") && phrase.startsWith("I like") && phrase.endsWith("!!!")) {
                System.out.println(phrase.toUpperCase());

                System.out.println(phrase.replace('a', 'o').substring(7,11));
            } else {
                System.out.println("Строка введена неверно");
            }
        } else {
            System.out.println("Ошибка");
        }
    }
}