public class InsertionAtFirstInDoublyLinkedList {
    int data;
    InsertionAtFirstInDoublyLinkedList next;
    InsertionAtFirstInDoublyLinkedList prev;

    public InsertionAtFirstInDoublyLinkedList(int data) {
        this.data = data;
        next = null;
        prev = null;
        System.out.println("Node created");
    }
    public void display(InsertionAtFirstInDoublyLinkedList head){
        InsertionAtFirstInDoublyLinkedList temp = head;
        while (temp != null) {
            System.out.print(" ===> " + temp.data);
            temp = temp.next;
        }
    }
    public InsertionAtFirstInDoublyLinkedList addNode(InsertionAtFirstInDoublyLinkedList head, int data) {
        //check list is empty or not
        if (head == null) {
            System.out.println("List is empty");
        } else {
            //crate new node
            InsertionAtFirstInDoublyLinkedList newNode = new InsertionAtFirstInDoublyLinkedList(data);
            newNode.next = head;
            head = newNode;
       //     f1.prev = newNode;
            newNode.prev = null;
        }
        return head;

    }

    public static void main(String[] args) {
        InsertionAtFirstInDoublyLinkedList f1 = new InsertionAtFirstInDoublyLinkedList(10);
        InsertionAtFirstInDoublyLinkedList f2 = new InsertionAtFirstInDoublyLinkedList(20);
        InsertionAtFirstInDoublyLinkedList f3 = new InsertionAtFirstInDoublyLinkedList(30);
        InsertionAtFirstInDoublyLinkedList f4 = new InsertionAtFirstInDoublyLinkedList(40);
        InsertionAtFirstInDoublyLinkedList f5 = new InsertionAtFirstInDoublyLinkedList(50);

        f1.next = f2;
        f2.next = f3;
        f3.next = f4;
        f4.next = f5;
        f2.prev = f1;
        f3.prev = f2;
        f4.prev = f3;
        f5.prev = f4;

        InsertionAtFirstInDoublyLinkedList head = f1;
        InsertionAtFirstInDoublyLinkedList tail = f5;

        f1.display(head);

        System.out.println();

        head = head.addNode(head, 5);
        head.display(head);
    }
}
