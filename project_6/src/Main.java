import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Выберите что переводить: 1 - масса, 2 - расстояние");
        int convertTo = 0;
        String d = scanner.nextLine();
        if (d.equals("1") || d.equals("2") ) {
            convertTo = Integer.parseInt(d);
        } else {
            System.out.println("Некорректный символ");
            return;
        }

        String suggestion = convertTo == 1 ? "Выберите единицу измерения: 1 - грамм, 2 - фунт, 3 - карат, 4 - тонна" :
                "Выберите единицу измерения: 1 - метр, 2 - фут, 3 - ярд, 4 - миля";

        System.out.println(suggestion);
        int from = 0;
        String t = scanner.nextLine();
        if (t.equals("1") || t.equals("2") || t.equals("3") || t.equals("4")) {
            from = Integer.parseInt(t);
        } else {
            System.out.println("Некорректный символ");
            return;
        }

        System.out.println("Введите число для конвертации:");
        double toConvert = 0;
        if(scanner.hasNextDouble()){
            toConvert = scanner.nextDouble();
        } else {
            System.out.println("Некорректный символ");
            return;
        }

        if ((convertTo == 1)) {
            convertWeight(from, toConvert);
        } else {
            convertDistance(from, toConvert);
        }
        
        scanner.close();
    }

    public static void convertWeight(int from, double toConvert){
        String [] names = {"Грамм -", "Фунт - ", "Карат - ", "Тонна - "};
        double [][] converting = {{1, 0.0024, 5, 0.000001}, {409.5, 1, 2047.5, 0.00041}, {0.2, 0.00049, 1, 2e-7}, {1000000, 2442, 5000000, 1}};
        for(int i = 0; i < names.length; i ++) {
            System.out.printf("%s %f\n", names[i], converting[from-1][i]*toConvert);
        }
    };

    public static void convertDistance(int from, double toConvert) {
        String [] names = {"Метры -", "Футы - ", "Ярды - ", "Мили - "};
        double [][] converting = {{1, 3.28, 1.09, 0.0062}, {0.3, 1, 0.33, 0.00019}, {0.91, 3, 1, 0.00057}, {1609.34, 5280, 1760, 1}};
        for(int i = 0; i < names.length; i ++) {
            System.out.printf("%s %f\n", names[i], converting[from-1][i]*toConvert);
        }
    }
}