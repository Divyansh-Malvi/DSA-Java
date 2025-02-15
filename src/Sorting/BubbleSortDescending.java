import java.util.Arrays;

public class BubbleSortDescending {
    public void descendingOrder(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] < arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {5,17, 3, 9, 1, 0};
        BubbleSortDescending bs = new BubbleSortDescending();
        System.out.println("Array before sorting = " + Arrays.toString(arr));
        bs.descendingOrder(arr);
        System.out.println("Array after sorting = " + Arrays.toString(arr));
    }
}
