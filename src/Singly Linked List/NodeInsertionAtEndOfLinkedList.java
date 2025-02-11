public class NodeInsertionAtEndOfLinkedList {
    public int data;
    public NodeInsertionAtEndOfLinkedList next;

    public NodeInsertionAtEndOfLinkedList(int data){
        this.data = data;
        next = null;

        System.out.println("Node created");

    }

    public void display(NodeInsertionAtEndOfLinkedList head){
        NodeInsertionAtEndOfLinkedList temp = head;
        while (temp != null){
            System.out.print(" ===> " + temp.data);
            temp = temp.next;
        }
    }

    public void addNodeAtEnd(NodeInsertionAtEndOfLinkedList head , int data) {
        //step 1: create a node

        NodeInsertionAtEndOfLinkedList newNode = new NodeInsertionAtEndOfLinkedList(data);

        //step 2: traverse the list up to last node

        NodeInsertionAtEndOfLinkedList temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }

        //step- 3: connect temp to new node;

        temp.next = newNode;

        //return


    }

    public static void main(String[] args) {
        NodeInsertionAtEndOfLinkedList f1 = new NodeInsertionAtEndOfLinkedList(10);
        NodeInsertionAtEndOfLinkedList f2 = new NodeInsertionAtEndOfLinkedList(20);
        NodeInsertionAtEndOfLinkedList f3 = new NodeInsertionAtEndOfLinkedList(30);
        NodeInsertionAtEndOfLinkedList f4 = new NodeInsertionAtEndOfLinkedList(40);
        NodeInsertionAtEndOfLinkedList f5 = new NodeInsertionAtEndOfLinkedList(50);

        f1.next = f2;
        f2.next = f3;
        f3.next = f4;
        f4.next = f5;

        NodeInsertionAtEndOfLinkedList head = f1;

        f1.display(head);

        head.addNodeAtEnd(head,60);
        head.display(head);

    }
}
