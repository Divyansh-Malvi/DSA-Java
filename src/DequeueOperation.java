public class DequeueOperation {
    static int arr[] = new int[5];
    int front = -1;
    int rear = -1;

    public void enq(int data) {
        //step 1: check overflow condition
        if (rear == arr.length - 1) {
            System.out.println("Overflow Condition");
        } else {
            if (front == -1 && rear == -1) {
                front++;
                rear++;
                arr[rear] = data;
            } else {
                rear++;
                arr[rear] = data;
            }
        }
    }

    public boolean isEmpty() {
        return rear == -1 && front == -1;
    }

    public boolean isFull() {
        return rear == arr.length - 1;
    }

    public int deque() {
        int r = -1;
        //check underflow
        if (isEmpty()) {
            System.out.println("Underflow condition");
        } else if (rear == front) {
            r = arr[front];
            front = -1;
            rear = -1;
        } else {
            r = arr[front];
            front++;
        }
        return r;
    }
    public int peek(){
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return -1;
        } else {
          return arr[front];
        }
    }

    public static void main(String[] args) {
        DequeueOperation dq = new DequeueOperation();
        dq.enq(10);
        dq.enq(20);
        dq.enq(30);
        dq.enq(40);
        dq.enq(50);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        System.out.println("Deleted element = " + dq.deque());
        System.out.println("Deleted element = " + dq.deque());
        System.out.println("Deleted element = " + dq.deque());
        System.out.println("Front element = " + dq.peek());
        System.out.println("Deleted element = " + dq.deque());
        System.out.println("Deleted element = " + dq.deque());
        System.out.println(dq.isEmpty());
        dq.deque();


    }
}

