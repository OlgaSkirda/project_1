import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int [] arrayOfInt;
        arrayOfInt = new int[] {1,2,3,4,5};

        arrayOfInt[0] = 5;
        arrayOfInt[arrayOfInt.length - 1] = 1;

        int middleInt = arrayOfInt.length/2;

        int sum = arrayOfInt[0] + arrayOfInt[middleInt];

        System.out.println(sum);

    }
}