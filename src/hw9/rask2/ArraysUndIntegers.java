package hw9.rask2;

import java.util.Random;
import java.util.Scanner;

public class ArraysUndIntegers {
    static Random random = new Random();
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        consistencyOfNumbers();
    }


    //    Дан массив чисел произвольного размера, заполненный целыми числами.
//    Определить и вывести на экран решение - являются ли значения элементов массива возрастающей последовательностью.


    static void consistencyOfNumbers() {
        System.out.println("Enter array length:");
        int [] arr = gerArray(scanner.nextInt());

        boolean isConsistency = true;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] <= arr[i - 1]) {
                isConsistency = false;
                break;
            }
        }

        if (isConsistency) {
            System.out.println("Массив 'arrays' является возрастающей последовательностью");
        } else {
            System.out.println("Массив 'arrays' не является возрастающей последовательностью");

        }

    }

    private static int[] gerArray(int length) {
        int[] array = new int[length];

        for (int i = 0; i < array.length; i++) {
            int integers = random.nextInt(0, 10);
            System.out.println("arrays[" + i + "]=" + integers);
            array[i] = integers;

        }
        return array;
    }

}
