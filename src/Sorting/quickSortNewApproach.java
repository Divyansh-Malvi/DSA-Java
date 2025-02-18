package Sorting;

import java.util.Arrays;

public class quickSortNewApproach {

    public static int partition(int[] arr, int low, int high) {
        //select a pivot element

        int pivot = arr[high];
        int i = low - 1;

        for (int j = low; j < high; j++) {
            if (arr[j] < pivot) {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;

            }
        }
        i++;
        //now swapping with pivot element
        int temp = arr[i];
        arr[i] = arr[high];
        arr[high] = temp;
        return i;
    }

    public static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int pi = partition(arr, low, high);
            quickSort(arr, low, pi - 1);
            quickSort(arr, pi + 1, high);
        }
    }

    public static void main(String[] args) {
        int[] arr = {56, 78, 0, 96, 2, 45, 56, 22, 12};
        System.out.println("Array before sorting = " + Arrays.toString(arr));
        quickSort(arr, 0, arr.length - 1);
        System.out.println("Array after sorting = " + Arrays.toString(arr));

    }
}
