public class InsertAtLastInDoublyLinkedList {
    int data;
    InsertAtLastInDoublyLinkedList next;
    InsertAtLastInDoublyLinkedList prev;

    public InsertAtLastInDoublyLinkedList(int data) {
        this.data = data;
        next = null;
        prev = null;
        System.out.println("Node created");
    }
    public void display(InsertAtLastInDoublyLinkedList head) {
        InsertAtLastInDoublyLinkedList temp = head;
        while (temp != null) {
            System.out.print(" ===> " + temp.data);
            temp = temp.next;
        }
    }
    public InsertAtLastInDoublyLinkedList addLast(InsertAtLastInDoublyLinkedList tail, InsertAtLastInDoublyLinkedList head, int data) {
        //check list is empty or not
        if (head == null) {
            System.out.println("List is empty");
        } else {
            //create a new node
            InsertAtLastInDoublyLinkedList newNode = new InsertAtLastInDoublyLinkedList(data);
            newNode.prev = tail;
            newNode = tail;
            newNode.next = null;


        }
        return head;
    }

    public static void main(String[] args) {
        InsertAtLastInDoublyLinkedList f1 = new InsertAtLastInDoublyLinkedList(10);
        InsertAtLastInDoublyLinkedList f2 = new InsertAtLastInDoublyLinkedList(20);
        InsertAtLastInDoublyLinkedList f3 = new InsertAtLastInDoublyLinkedList(30);
        InsertAtLastInDoublyLinkedList f4 = new InsertAtLastInDoublyLinkedList(40);
        InsertAtLastInDoublyLinkedList f5 = new InsertAtLastInDoublyLinkedList(50);

        f1.next = f2;
        f2.next = f3;
        f3.next = f4;
        f4.next = f5;
        f2.prev = f1;
        f3.prev = f2;
        f4.prev = f3;
        f5.prev = f4;

        InsertAtLastInDoublyLinkedList head = f1;
        InsertAtLastInDoublyLinkedList tail = f5;

        f1.display(head);

        head = head.addLast(tail, head, 60);
        head.display(head);
    }
}
