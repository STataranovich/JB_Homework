package Task1;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Введите x: ");
        double x = scan.nextDouble();
        System.out.println("Введите y: ");
        double y = scan.nextDouble();


        double numerator;
        numerator = Math.sin(x + y) * Math.sin(x + y) +1;

        double a = 0; 
            if (x != 0) {
            a = 1 + x * x * y * y;

        }
            else {
                System.out.println("Знаменатель не может быть равен нулю");
        }

        double vector;
        vector = Math.abs(x - 2 * x / a);

           double result;
           result = a / (2 + vector) + x;

           System.out.println("Результат равен: " + result);

    }
}
