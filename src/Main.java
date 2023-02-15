import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        //task5();
        //task6();
        task7();
        //task8();
        //task9();
    }

    private static void task5() {
        System.out.println("Задача №5");
//        int [][] matrix = {{1,0,1}, {0,1,0}, {1,0,1}};;
        int[][] matrix = new int[3][3];
        for (int i = 0; i < matrix.length; i++) {
            matrix[i][i] = 2;
            matrix[i][matrix.length - i - 1] = 2;
        }
        for (int[] row : matrix) {
            for (int column : row) {
                System.out.print(column + " ");
            }
            System.out.println();
        }
    }

    private static void task6() {
        System.out.println("");
        System.out.println("Задача №6");
        int[] arr = {5, 4, 3, 2, 1};
        int[] arrTidy = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            arrTidy[i] = arr[arr.length - i - 1];
        }
        System.out.print(Arrays.toString(arr) + " => ");
        System.out.print(Arrays.toString(arrTidy));
    }

    private static void task7() {
        System.out.println("");
        System.out.println("Задача №7");
        int[] arr = {6, 5, 4, 3, 2, 1};
        System.out.print(Arrays.toString(arr) + " => ");
        for (int i = 0; i < arr.length/2; i++) {
            int tmp = arr[i];
            arr[i] = arr[arr.length - i - 1];
            arr[arr.length - i - 1] = tmp;
        }
        System.out.print(Arrays.toString(arr));
    }

    private static void task8() {
        System.out.println("Задача №8");
    }

    private static void task9() {
        System.out.println("Задача №9");
    }
}