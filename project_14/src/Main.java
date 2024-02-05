import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Random random = new Random();

        System.out.println("Заполняем массив 15 целых чисел");
        int [] nums = new  int[15];
        for (int i = 0; i < 15; i++) {
            nums[i] = random.nextInt(-20, 20);
        }
        Arrays.sort(nums);
        int max = nums[0];
        int min = nums[14];

        System.out.println("Максимальное значение - " + max + ", минимальное значение - " + min);
        System.out.println(Math.abs(Integer.max(max, min)));
    }
}