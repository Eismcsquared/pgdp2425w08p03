package pgdp.sorting;

import java.util.*;

public class MergeSort {

    /**
     * Sorts dates with MergeSort.
     * @param list the List of Integers to be sorted recursively
     */

    public static List<Integer> mergeSort(List<Integer> list) {
        if (list.size() <= 1) {
            return List.copyOf(list);
        }
        return merge(mergeSort(list.subList(0, list.size() / 2)), mergeSort(list.subList(list.size() / 2, list.size())));
    }

    private static List<Integer> merge(List<Integer> first, List<Integer> second) {
        if (first.isEmpty()) {
            return List.copyOf(second);
        }
        if (second.isEmpty()) {
            return List.copyOf(first);
        }
        List<Integer> result = new LinkedList<>();
        if (first.get(0) < second.get(0)) {
            result.add(first.get(0));
            result.addAll(merge(first.subList(1, first.size()), second));
        } else {
            result.add(second.get(0));
            result.addAll(merge(first, second.subList(1, second.size())));
        }
        return result;
    }


    public static void main(String[] args) {
        //TODO: Uncomment after implementing the mergeSort method to see the outputs .
        List<Integer> unsortedList = Arrays.asList(5, 3, 8, 6, 2, 7, 4, 1);
        List<Integer> alreadySortedList = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8);
        List<Integer> singleElementList = Arrays.asList(42);
        List<Integer> emptyList = new ArrayList<>();

        System.out.println("Original: " + unsortedList);
        System.out.println("Sorted:   " + MergeSort.mergeSort(unsortedList));
//
//        System.out.println("\nOriginal: " + alreadySortedList);
//        System.out.println("Sorted:   " + MergeSort.mergesort(alreadySortedList));
//
//        System.out.println("\nOriginal: " + singleElementList);
//        System.out.println("Sorted:   " + MergeSort.mergesort(singleElementList));
//
//        System.out.println("\nOriginal: " + emptyList);
//        System.out.println("Sorted:   " + MergeSort.mergesort(emptyList));
    }

}
