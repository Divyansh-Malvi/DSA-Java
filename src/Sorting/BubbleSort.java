public class BubbleSort {

    public static void bubbleSortExample(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1 ; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

    }
    public static void main(String[] args) {
        int[] arr = {45,12,63,89,2};
        for(int i:arr){
            System.out.print(i + "\t");
        }
        System.out.println();
        bubbleSortExample(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t");
        }
    }


}
