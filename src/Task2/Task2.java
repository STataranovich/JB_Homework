package Task2;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите x: ");
        double x = scan.nextDouble();
        System.out.println("Введите y: ");
        double y = scan.nextDouble();

        if (x >= -4 && x <= 4) {
                if (y <= 5 && y >= 0){
                    System.out.println("Точка принадлежит отрезку.");
                    return;
                }
        }

        if (x >= -6 && x <= 6) {
                if (y >= -3 && y >= 0){
                    System.out.println("Точка принадлежит отрезку.");
                    return;
                }
            }
        System.out.println("Точка не принадлежит отрезку.");
        }

    }
