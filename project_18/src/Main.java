import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Отгадайте загадку - Сидит дед, во сто шуб одет, кто его раздевает, тот слезы проливает");
        System.out.println("У вас есть 3 попытки");

        int advise = 0;
        String answer = null;
        for (int i = 1; i <= 3; i++) {
            System.out.println("Попытка - " + (i));

            answer = scanner.nextLine();

            if (answer.equals("Заархивированный вирус")) {
                System.out.println("Правильно!");
                return;
            } else if (Objects.equals(answer, "Подсказка") && i == 1) {
                System.out.println("Подсказываю");
                advise++;
            } else if (answer.equals("Подсказка") && i > 1) {
                System.out.println("Подсказка уже недоступна");
            } else if (!Objects.equals(answer, "Заархивированный вирус") && advise >= 1) {
                System.out.println("Обидно, приходи в другой раз");
                return;
            } else if (!Objects.equals(answer, "Заархивированный вирус") && i != 3) {
                System.out.println("Подумай еще!");
            } else if (!Objects.equals(answer, "Заархивированный вирус") && i == 3) {
                System.out.println("Обидно, приходи в другой раз");
                return;
            } }

        scanner.close();
    }
}