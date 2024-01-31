package lv.rvt;
import rvt.Sorting;
import java.util.Arrays;

public class SortingTest {

    public static void main(String[] args){

    // int[] numbers = {6, 5, 8, 7, 11};
    // System.out.println("Smallest: " + Sorting.smallest(numbers));

    // int[] numbers = {6, 5, 8, 7, 11};
    // System.out.println("Index of the smallest number: " + Sorting.indexOfSmallest(numbers));

    // int[] numbers = {-1, 6, 9, 8, 12};
    // System.out.println(Sorting.indexOfSmallestFrom(numbers, 0));
    // System.out.println(Sorting.indexOfSmallestFrom(numbers, 1));
    // System.out.println(Sorting.indexOfSmallestFrom(numbers, 2));

    int[] numbers = {3, 2, 5, 4, 8};

    System.out.println(Arrays.toString(numbers));

    Sorting.swap(numbers, 1, 0);
    System.out.println(Arrays.toString(numbers));

    Sorting.swap(numbers, 0, 3);
    System.out.println(Arrays.toString(numbers));
}
}