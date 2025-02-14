import java.util.Arrays;

public class SelectionSortDescending {
    public void selectionSort(int[] arr) {
        int n = arr.length ;
        for (int i = 0; i < n - 1; i++) {// because i will compare with last element
            int minIndex = i;

            for (int j = i + 1; j < n; j++) {
                if (arr[j] > arr[minIndex]) {
                    minIndex = j;
                }
            }
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }

    }

    public static void main(String[] args) {
        int[] arr = {5, 17, 3, 9, 1, 0};
        SelectionSortDescending ss = new SelectionSortDescending();

        System.out.println("Before sorting = " + Arrays.toString(arr));
        ss.selectionSort(arr);
        System.out.println("After sorting = " + Arrays.toString(arr));
    }
}
