package epam.by.module4;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] arr = new int[readArrayLength(scan)];
        createArray(arr);
        int total = calcSum(scan, arr);
        printResult(arr, total);
        scan.close();
    }

    public static int readArrayLength(Scanner scan) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the length of array: ");
        return scanner.nextInt();
    }

    public static int[] createArray(int []arr) {
        int[] result = new int[5];

        for (int i = 0; i < arr.length; i++) {
            result[i] = i + 1;
        }

        return result;
    }
    public static int calcSum(Scanner scan, int[] arr) {
        int k = 0;
        System.out.print("Enter K: ");
        if (scan.hasNextInt()) {
            k = scan.nextInt();
        }
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % k == 0) {
                sum += arr[i];
            }
        }
        return sum;
    }

    public static void printResult(int[] arr, int total) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print("arr[" + i + "]=" + arr[i] + "; ");
        }
        System.out.println();
        System.out.println("--------------------------------------");
        System.out.println("Total amount of % K = " + total);
    }


}