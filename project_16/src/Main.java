import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите уравнение");

        String equation = null;

        if(scanner.hasNextLine()) {
            equation = scanner.nextLine();
        }

        assert equation != null;
        if(equation.charAt(0) == 'x' && equation.charAt(1) == '+') {
            System.out.println("Вывод: " + ((int) equation.charAt(4) - (int) equation.charAt(2)));
        } else if (equation.charAt(0) == 'x' && equation.charAt(1) == '-') {
            System.out.println("Вывод: " + ((int) equation.charAt(4) - (int) equation.charAt(2)));
        } else if (equation.charAt(2) == 'x' && equation.charAt(1) == '-') {
            System.out.println("Вывод: " + ((int) equation.charAt(0) - (int) equation.charAt(4)));
        } else if (equation.charAt(2) == 'x' && equation.charAt(1) == '+'){
            System.out.println("Вывод: " + ((int) equation.charAt(4) - (int) equation.charAt(0)));
        } else if (equation.charAt(4) == 'x' && equation.charAt(1) == '-') {
            System.out.println("Вывод: " + ((int) equation.charAt(0) - (int) equation.charAt(2)));
        } else if(equation.charAt(4) == 'x' && equation.charAt(1) == '+') {
            System.out.println("Вывод: " +
                    (Integer.parseInt(String.valueOf(equation.charAt(2)))
                            +Integer.parseInt(String.valueOf(equation.charAt(0)))));
        }

        scanner.close();
    }
}