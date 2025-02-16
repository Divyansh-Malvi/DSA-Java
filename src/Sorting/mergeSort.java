import java.util.Arrays;

public class mergeSort {

    public static void conquer(int[] arr, int si, int mid, int ei) {
        int size = ei - si + 1;
        int[] mergedArray = new int[size];
        int indx1 = si;
        int indx2 = mid + 1;
        int x = 0;
        while (indx1 <= mid && indx2 <= ei) {
            if (arr[indx1] <= arr[indx2]) {
                mergedArray[x++] = arr[indx1++];
            } else {
                mergedArray[x++] = arr[indx2++];
            }
        }
            while (indx1 <= mid) {
                mergedArray[x++] = arr[indx1++];
            }

            while (indx2 <= ei) {
                mergedArray[x++] = arr[indx2++];
            }
            //now copying data from mergedArray to arr
            for (int i = 0, j = si; i < size; i++, j++) {
                arr[j] = mergedArray[i];
            }


    }
    public static void divide(int[] arr, int si, int ei) {
        if (si >= ei){
            return;
        }
        int mid = (si + ei) / 2;
        divide(arr, si, mid); // for list 1
        divide(arr, mid + 1, ei);// for list 2
        conquer(arr, si, mid, ei);

    }
    public static void main(String[] args) {
        int[] arr = {5, 17, 9, 1, 0};
        System.out.println(" Array before sorting = " + Arrays.toString(arr));


        divide(arr, 0, arr.length - 1);
        System.out.println(" Array after sorting = " + Arrays.toString(arr));

    }
}
