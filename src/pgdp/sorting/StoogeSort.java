package pgdp.sorting;

import java.text.*;
import java.util.*;
import java.util.concurrent.ThreadLocalRandom;

public final class StoogeSort {


    /**
     * Implementation of the StoogeSort algorithm
     *
     * @param array Any Integer-Array
     * @return The passed Integer-Array, but sorted in ascending order
     */
    public static void stoogeSort(int[] array) {
        stoogeSortHelper(array, 0, array.length);
    }

    public static void stoogeSortHelper(int[] array, int from, int to) {
        if (to - from < 2) {
            return;
        }
        if (to - from == 2) {
            if (array[from] > array[from + 1]) {
                int tmp = array[from];
                array[from] = array[from + 1];
                array[from + 1] = tmp;
            }
            return;
        }
        int oneThird = (to - from) / 3;
        stoogeSortHelper(array, from, to - oneThird);
        stoogeSortHelper(array, from + oneThird, to);
        stoogeSortHelper(array, from, to - oneThird);
    }

    // print method for the output testing in main method.
    public static void printArray(int[] array) {
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();
    }


    public static void main(String[] args) {
        //TODO: Uncomment after implementing the stoogeSort method to see the outputs .
        int[] array1 = {5, 3, 8, 6, 2, 7, 4, 1};

        System.out.println("Original 1: ");
        printArray(array1);

        stoogeSort(array1);
        System.out.println("Sorted 1: ");
        printArray(array1);


        int[] array2 = {7, 2, 7, 4, 5, 2, 6};

        System.out.println("\nOriginal 2: ");
        printArray(array2);

        stoogeSort(array2);
        System.out.println("Sorted 2: ");
        printArray(array2);


        int[] array3 = {5, 3, 8, 6, 2,};

        System.out.println("\nOriginal 3: ");
        printArray(array3);

        stoogeSort(array3);
        System.out.println("Sorted 3: ");
        printArray(array3);

    }


}
