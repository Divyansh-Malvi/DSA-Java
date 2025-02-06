public class PushMethod {
   static int arr[] = new int[5];
   static int top = -1;

   public static int push(int data) {
       //step 1. = start
       //step 2. = check overflow condition
       if (top == arr.length-1) {
           System.out.println("Stack Overflow");

       }else {
           //step 3. = increase the top by 1
           top++;
           //step 4. = store data into top of the stack
           arr[top] = data;
           System.out.println("Data Inserted");
           //step 5. = end

       }
       return data;
   }
   public static void show(){
       for (int i = 0; i < arr.length; i++) {
           System.out.println(arr[i]);

       }
   }

    public static void main(String[] args) {
       push(10);
       push(20);
       push(30);
       push(40);
       push(50);

       show();
       
    }
}
