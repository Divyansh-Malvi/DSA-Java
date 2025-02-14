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

    public InsertAtLastInDoublyLinkedList addNodeLast(InsertAtLastInDoublyLinkedList head , int data) {
        if (head == null) {
            System.out.println("list is empty");
        } else {
            InsertAtLastInDoublyLinkedList temp = head;
            InsertAtLastInDoublyLinkedList newNode = new InsertAtLastInDoublyLinkedList(data);
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
            newNode.prev = temp.next;
            newNode.next = null;

        }
        return  head;

    }

    public static void main(String[] args) {
        InsertAtLastInDoublyLinkedList f1 = new InsertAtLastInDoublyLinkedList(10);
        InsertAtLastInDoublyLinkedList f2 = new InsertAtLastInDoublyLinkedList(20);
        InsertAtLastInDoublyLinkedList f3 = new InsertAtLastInDoublyLinkedList(30);
        InsertAtLastInDoublyLinkedList f4 = new InsertAtLastInDoublyLinkedList(40);
        InsertAtLastInDoublyLinkedList f5 = new InsertAtLastInDoublyLinkedList(50);

        f1.next = f2;
        f2.prev = f1;
        f2.next = f3;
        f3.prev = f2;
        f3.next = f4;
        f4.prev = f3;
        f4.next = f5;
        f5.prev = f4;

        InsertAtLastInDoublyLinkedList head = f1;
        f1.display(head);
        System.out.println();
        head = head.addNodeLast(head, 60);
        head.display(head);

        }


    }

