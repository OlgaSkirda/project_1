import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int count = 0;

        System.out.println("Введите строку");

        String [] phraces = scanner.nextLine().split(" ");

        for (String s : phraces) {
            if (s.matches("[a-zA-Z]+")) {
                System.out.println(s);
                count++;
            }
        }

        System.out.println("Количество слов, состоящих только из из латиницы - " + count);

        scanner.close();
    }
}