package Task4;


public class Task4 {

    public static void main(String[] args) {
        int[] array = new int[10];
        array[0] = 1;
        array[1] = 2;
        array[2] = 3;
        array[3] = 4;
        array[4] = 5;
        array[5] = 6;
        array[6] = 7;
        array[7] = 8;
        array[8] = 9;
        array[9] = 10;

        printResult(array);
    }

    public static boolean Natural(int a) {
        boolean flag = true;
        if (a == 0) {
            flag = false;
        }

        for (int i = 2; i < a; i++) {
            if (a % i == 0) {
                flag = false;
                break;
            }
        }
        return flag;
    }

    public static void printResult(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (Natural(array[i])) {
                System.out.println("array[" + i + "]");

            }
        }
    }
}