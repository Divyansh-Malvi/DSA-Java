public class POPOperation {
    static int arr[] = new int[5];
    static int top = -1;
    public static boolean isEmpty(){
        return top == -1;
    }
    public static boolean isFull(){
        return top == arr.length - 1;
    }
    public static void push(int data){
        //check overflow
        if (top == arr.length - 1) {
            System.out.println("Overflow condition");
        } else {
            //increase top
            top++;
            //store value into the top of the stack
            arr[top] = data;

        }
    }
    public static int pop(){
        int result = -1;
        //check underflow
        if (top == -1){
            System.out.println("underflow");
        } else {
            result = arr[top];
            top --;
        }
        return result;
    }

    public static void main(String[] args) {
        push(10);
        push(20);
        push(30);
        push(40);
        push(50);
        System.out.println("Stack is FUll : " + isFull());
        System.out.println("=========Pop()===Operation");
        System.out.println("" + pop());
        System.out.println("" + pop());
        System.out.println("" + pop());
        System.out.println("" + pop());
        System.out.println("" + pop());
        pop();
        System.out.println("Stack is Empty : " + isEmpty());
    }
}
