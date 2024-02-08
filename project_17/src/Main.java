import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите количество строк");
        int n = 0;
        if (scanner.hasNextInt()) {
            n = scanner.nextInt();
        } else {
            System.out.println("Ошибка! Введено не целое число");
            return;
        }

        char[][] chars = new char[n][];

        System.out.println("Введите строки");
        String[] strings = new String[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Строка " + (i+1) + ":");
         strings[i] = scanner.next();
        }

        for(int i = 0; i < n; i++){
            chars[i] = strings[i].toCharArray();
        }

        int[] counts = new int[n];

        for (int i = 0; i < n; i++){
           int differenceCount = 1;
           if(chars[i].length > 2) {
               for (int y = 1; y < chars[i].length; y++) {
                   if (chars[i][y-1] != chars[i][y]) {
                       differenceCount++;
                       counts[i] = differenceCount;
                   }
               }
           } else {
               counts[i] = 1;
           }
        }

        int max = 0;
        for( int i = counts.length-1; i >= 0; i--){
            if(i != 0) {
                if (counts[i] > counts[i-1]){
                    max = i;
                } else if (counts[i] == counts[i-1]) {
                    max = i-1;
                } else {
                    max = i-1;
                }
            }
        }

        System.out.println("Ответ:");
        System.out.println(strings[max]);

        scanner.close();
    }
}