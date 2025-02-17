////public class InsertionAtSpecificPosition {
////    int data;
////    InsertionAtSpecificPosition next;
////    InsertionAtSpecificPosition prev;
////
////    public InsertionAtSpecificPosition(int data) {
////        this.data = data;
////        InsertionAtSpecificPosition next = null;
////        InsertionAtSpecificPosition prev = null;
////
////        System.out.println("Node created");
////    }
////    public void display(InsertionAtSpecificPosition head){
////        InsertionAtSpecificPosition temp = head;
////        while (temp != null) {
////            System.out.println(" ===> " + temp.data);
////            temp = temp.next;
////        }
////    }
////    public InsertionAtSpecificPosition addData(InsertionAtSpecificPosition head , int data , int position) {
////
////    }
////}
//public class DoublyLinkedList {
//
//    private Node head;
//
//    public void insertFirst(int val){
//        Node node = new Node(val);
//        node.next = head;
//        node.prev = null;
//        if(head != null){
//            head.prev = node;
//        }
//        head = node;
//    }
//
//    public void insertLast(int val){
//        Node node = new Node(val);
//        Node last = head;
//        node.next =null;
//
//        if(head == null){
//            head = node;
//            node.prev = null;
//            return;
//        }
//
//        while(last.next != null){
//            last = last.next;
//        }
//        last.next = node;
//        node.prev = last;
//    }
//
//
//    public Node find(int value){
//        Node node = head;
//        while (node != null){
//            if(node.value == value){
//                return node;
//            }
//            node = node.next;
//        }
//        return null;
//    }
//
//    public void insert(int after,int val){
//        Node p = find(after);
//
//        if(p==null){
//            System.out.println("Dosen't exist");
//            return;
//        }
//
//        Node node = new Node(val);
//        node.next = p.next;
//        p.next = node;
//        node.prev = p;
//        if(node.next != null){
//            node.next.prev = node;
//        }
//    }
//    public void display(){
//        Node node = head;
//        Node last = node;
//        while(node!=null){
//            System.out.print(node.value+" -> ");
//            last = node;
//            node = node.next;
//
//        }
//        System.out.println("END");
//
//
//        //Print in reverse
//        while(last != null){
//            System.out.print(last.value + " -> ");
//            last = last.prev;
//        }
//        System.out.println("START");
//    }
//
//    private class Node{
//        int value;
//        Node next;
//        Node prev;
//
//        public Node(int value) {
//            this.value = value;
//        }
//
//        public Node(int value, Node next, Node prev) {
//            this.value = value;
//            this.next = next;
//            this.prev = prev;
//        }
//    }
//}