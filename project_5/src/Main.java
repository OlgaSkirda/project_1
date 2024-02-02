import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double firstNum = 0;
        double secondNum = 0;

        System.out.println("Введите 1 число:");
        if (scanner.hasNextDouble()){
            firstNum += scanner.nextDouble();
        } else {
            System.out.println("Ошибка, введён другой символ");
        }

        System.out.println("Введите 2 число");
        if (scanner.hasNextDouble()){
            secondNum += scanner.nextDouble();
        } else {
            System.out.println("Ошибка, введён другой символ");
        }

        System.out.println("Введите один из символов арифметической операции - (+, -, *, /)");
        while (scanner.hasNextLine()) {
            String op = scanner.next();
            if (op.equals("+") || op.equals("-") || op.equals("*") || op.equals("/")) {
                switch (op) {
                    case "+":
                        System.out.println(firstNum + secondNum);
                        return;
                    case "-":
                        System.out.println(firstNum - secondNum);
                        return;
                    case "*":
                        System.out.println(firstNum * secondNum);
                        return;
                    case "/":
                        System.out.println(firstNum / secondNum);
                        return;
                }
            } else {
                System.out.println("Ошибка, введён неверный символ, попробуйте ещё раз");
            }
        }
        scanner.close();
    }
}