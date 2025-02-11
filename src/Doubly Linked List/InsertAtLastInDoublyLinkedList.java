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
            tail.next = newNode;
            newNode = tail;
            newNode.next = null;


        }
        return head;
    }
}
