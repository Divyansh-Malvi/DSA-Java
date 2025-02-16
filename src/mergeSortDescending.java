import java.util.Arrays;

public class mergeSortDescending {

    public static void conquer(int[] arr, int si, int mid, int ei) {
        //create new array
        int size = ei - si + 1;
        int[] mergedArray = new int[size];

        int index1 = si; // for start of list 1
        int index2 = mid + 1;// for start of list 2
        int x = 0; //represent the mergedArray position

        while (index1 <= mid && index2 <= ei) {
            if (arr[index1] >= arr[index2]) {
                mergedArray[x++] = arr[index1++];
            } else {
                mergedArray[x++] = arr[index2++];
            }
        }
        while (index1 <= mid) {
            mergedArray[x++] = arr[index1++];
        }
        while (index2 <= ei) {
            mergedArray[x++] = arr[index2++];
        }
        //now copying data from mergedArray to arr array
        for (int i = 0, j = si; i < size ; i++, j++) {
            arr[j] = mergedArray[i];
        }

    }
    public static void divide(int[] arr, int si, int ei) {
        if(si >= ei) {
            return;
        }
        int mid = (si + ei) / 2;
        divide(arr, si, mid); // for list one
        divide(arr, mid + 1, ei);// for list 2
        conquer(arr, si, mid, ei);
    }

    public static void main(String[] args) {
        int[] arr = {0, 75, 98, 2, -5, 10};
        System.out.println("Array before sorting = " + Arrays.toString(arr));
        divide(arr, 0, arr.length - 1);
        System.out.println("Array after sorting in descending order = " + Arrays.toString(arr));
    }
}
