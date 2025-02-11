import java.util.ArrayList;
import java.util.LinkedList;

public class TimeComparisonBetweenArrayListAndLinkedList {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        ArrayList<Integer> al = new ArrayList<Integer>();
        for (int i = 0; i < 100000; i++) {
            al.add(i);
        }
        long endTime = System.currentTimeMillis();
        long timeTaken = endTime - startTime;
        System.out.println("Time taken by ArrayList = " + timeTaken);
//        LinkedList;
        long startTime1 = System.currentTimeMillis();
        LinkedList<Integer> ll = new LinkedList<Integer>();
        for (int i = 0; i < 100000; i++) {
         ll.add(i);
        }
        long endTime1 = System.currentTimeMillis();
        long timeTaken1 = endTime1 - startTime1;
        System.out.println("Time taken by Linked List = " + timeTaken1);
    }
}
