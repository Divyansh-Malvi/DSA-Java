public class EnqueueOperation {
    static int arr[] = new int[5];
    int front = -1;
    int rear = -1;

    public void enq(int data) {
        //step 1:- check overflow;
        if (rear == arr.length - 1) {
            System.out.println("Overflow condition");
        } else{
            if (rear == -1 && front == -1) {
                front++;
                rear++;
                arr[rear] = data;
                System.out.println("Insert First Element in the Queue");
            } else {
                rear++;
                arr[rear] = data;
                System.out.println("Insert First Element in the Queue");

            }
        }
    }

    public static void main(String[] args) {
        EnqueueOperation en = new EnqueueOperation();
        en.enq(10);
        en.enq(20);
        en.enq(30);
        en.enq(40);
        en.enq(50);

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
