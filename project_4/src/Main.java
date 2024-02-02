import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите целое число");
        int firstNum =  scanner.nextInt();

        System.out.println("Введите целое число");
        int secondNum =  scanner.nextInt();

        System.out.println("Введите целое число");
        int thirdNum =  scanner.nextInt();

        int sum = firstNum+secondNum+thirdNum;

        double average = (double) sum/3;

        System.out.println("Среднее арифметическое - " + average);

        double nextAfterAverage = Math.floor(average/2);

        if(nextAfterAverage > 3) {
            System.out.println("Программа выполнена корректно - " + nextAfterAverage);
        }

        scanner.close();
    }
}