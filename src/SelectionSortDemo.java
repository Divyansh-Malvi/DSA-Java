public class SelectionSortDemo {
    public static void selectionSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
                int temp = arr[minIndex];
                arr[minIndex] = arr[i];
                arr[i] = temp;
            }
        }


    public static void main(String[] args) {
        int[] arr = {12,69,35,78,1,2,0};
        for(int i : arr) {
            System.out.print(i + "\t");
        }
        System.out.println();
        selectionSort(arr);
       for(int i : arr) {
           System.out.print(i + "\t");
       }


    }
}
