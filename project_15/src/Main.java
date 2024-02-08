import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите курс доллара");
        if(scanner.hasNextDouble()){
            double rate = scanner.nextDouble();

            System.out.println("Введите количество рублей");
            if(scanner.hasNextDouble()) {
                double amount = scanner.nextDouble();

                System.out.println("Курс доллара - " + rate);
                System.out.println("Количество рублей - " + amount);
                System.out.println("Итого - " + Math.round((amount/rate) * 100.0)/100.0);
            } else {
                System.out.println("Введите число");
            }
        } else {
            System.out.println("Введите число");
        }
        scanner.close();
    }
}