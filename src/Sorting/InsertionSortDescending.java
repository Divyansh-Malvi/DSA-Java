import java.util.Arrays;

public class InsertionSortDescending {
    public void insertionSort(int[] arr) {
        int i;
        int j;
        for ( i = 1; i < arr.length; i++) {
            int temp = arr[i];
            for ( j = i - 1; j >= 0 && arr[j] < temp; j--) {
                arr[j + 1] = arr[j];
            }
            arr[j + 1] = temp;
        }
    }

    public static void main(String[] args) {
        int[] arr = {5, 17, 9, 1, 0};
        InsertionSortDescending ns = new InsertionSortDescending();
        System.out.println("Array before sorting = " + Arrays.toString(arr));
        ns.insertionSort(arr);
        System.out.println("Array after sorting = " + Arrays.toString(arr));
    }
}
