package epam.by.module4;

public class Task4 {
    public static void main(String[] args) {
        int[] arr = {2, 4, 0, 15, 60, 0, 7, 0, 8};
        calculate(arr);
    }

    private static int calculate(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                int result[] = {i};
                printResult(result);
            }
        }
        return 0;
    }

    public static void printResult(int[] result) {
        for (int finalArray : result) {
            System.out.print(finalArray + " ");

        }
    }
}