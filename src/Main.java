import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        task5();
        task6();
        task7();
        task8();
        task9();
    }

    private static void task5() {
        /*Создайте матрицу 3х3 (двумерный массив типа int). Заполните единицами обе диагонали
        матрицы и напечатайте ее в консоль. Постарайтесь заполнить обе диагонали в одном цикле.
        Для печати следует использовать следующий код:
        for (int[] row : matrix) {
            for (int column : row) {
                System.out.print(column + " ");
            }
            System.out.println();
        }*/
        System.out.println("Задача №5");
        int[][] matrix = new int[3][3];
        for (int i = 0; i < matrix.length; i++) {
            matrix[i][i] = 1;
            matrix[i][matrix.length - i - 1] = 1;
        }
        for (int[] row : matrix) {
            for (int column : row) {
                System.out.print(column + " ");
            }
            System.out.println();
        }
    }

    private static void task6() {
        /*У нас есть массив, в котором содержатся целочисленные значения от 1 до 5.
        Наш коллега что-то напутал, в итоге массив читается не с начала, а с конца.
        Нам нужно исправить ошибку и переработать код так, чтобы массив читался в правильном порядке.
        Нам дан массив чисел: {5, 4, 3, 2, 1}
        Необходимо привести его к виду: {1, 2, 3, 4, 5}
        Решите задачу с использованием дополнительного массива.
        Напечатайте массив до преобразования и после с помощью System.out.println(Arrays.toString(arr));*/
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
        /*Решите предыдущее задание, но без использования дополнительного массива.
        Необходимо добиться того, чтобы исходный массив полностью соответствовал второму массиву из прошлого задания.
        Выведите результат программы в консоль тем же способом.
        **Уточнения**:
        - Это задание не на сортировку.
        - Не использовать Arrays.sort() и другие способы сортировок.
        - Числа в порядке убывания даны исключительно для указания направления чтения.
        - Массив может быть 5 8 2 3 9, нужно из него сделать 9 3 2 8 5.*/
        System.out.println("");
        System.out.println("Задача №7");
        int[] arr = {6, 5, 4, 3, 2, 1};
        System.out.print(Arrays.toString(arr) + " => ");
        for (int i = 0; i < arr.length / 2; i++) {
            int tmp = arr[i];
            arr[i] = arr[arr.length - i - 1];
            arr[arr.length - i - 1] = tmp;
        }
        System.out.print(Arrays.toString(arr));
    }

    private static void task8() {
        /*Задача, которая используется/бывает/встречается на собеседованиях.
        Дан массив чисел {−6, 2, 5, −8, 8, 10, 4, −7, 12, 1}
        Необходимо найти два числа, сумма которых равна −2.
        Напечатать эти числа в консоль.
        - **Подсказка**
        Может потребоваться отсортировать массив с помощью Arrays.sort(arr).*/
        System.out.println("");
        System.out.println("Задача №8");
        int[] arr = {-6, 2, 5, -8, 8, 10, 4, -7, 12, 1};
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == -2) {
                    System.out.println("Числа сумма, которых равна -2: " + arr[i] + " и " + arr[j]);
                }
            }
        }
    }

    private static void task9() {
        /*Усложняем предыдущую задачу. Найдите все пары чисел, сумма которых равна −2.
        Напечатайте их в консоль.*/
        System.out.println("");
        System.out.println("Задача №9");
        int[] arr = {-6, 2, 5, -8, 8, 10, 4, -7, 12, 1};
        /*Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));*/
        int pair1 = 0;
        int pair2 = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                pair1 = arr[i] + arr[j];
                for (int k = 0; k < arr.length - 1 && k != i && k != j; k++) {
                    for (int l = k + 1; l < arr.length && l != i && l != j; l++) {
                        pair2 = arr[k] + arr[l];
                        if (pair1 + pair2 == -2) {
                            System.out.println("Пары чисел сумма, которых равна -2: " + arr[i] + "/" + arr[j] +
                                    " и " + arr[k] + "/" + arr[l]);
                        }
                    }
                }
            }
        }
    }
}