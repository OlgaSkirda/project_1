import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите первое целое число");
         if(scanner.hasNextDouble()) {
             String first = scanner.next();
             int second = 0;

             System.out.println("Введите второе целое число");
             if (scanner.hasNextInt()){
                 second = scanner.nextInt();
             } else {
                 System.out.println("Oшибка");
             }

             System.out.println("Большее число - " + Integer.max(Integer.parseInt(first), second));
              double min = Integer.min(Integer.parseInt(first), second);
             System.out.println("Меньшее число - " + min);
         }
         else {
             System.out.println("Oшибка");
         }

         scanner.close();
    }
}