public class NodeInsertionAtSpecificPositionOfLinkedList {
    int data;
    NodeInsertionAtSpecificPositionOfLinkedList next;

    public NodeInsertionAtSpecificPositionOfLinkedList(int data) {
        this.data = data;
        next = null;
        System.out.println("Node created successful");
    }
    public void display(NodeInsertionAtSpecificPositionOfLinkedList head){
        NodeInsertionAtSpecificPositionOfLinkedList temp = head;
        while (temp != null){
            System.out.print(" ===> " + temp.data);
            temp = temp.next;
        }
    }

    public void addNodeAtSpecificPosition(NodeInsertionAtSpecificPositionOfLinkedList head,int data,int position){
        //step 1: create a node;
        NodeInsertionAtSpecificPositionOfLinkedList newNode = new NodeInsertionAtSpecificPositionOfLinkedList(data);

        //step 2: Traverse the list till position
        NodeInsertionAtSpecificPositionOfLinkedList temp1 = head;
        NodeInsertionAtSpecificPositionOfLinkedList temp2 = head.next;
        position--;

        while (position > 1){
            temp1 = temp1.next;
            temp2 = temp2.next;
            position--;
        }
        //step 3: connect temp1 to new Node

        temp1.next = newNode;

        //step 4: connect newNode to temp2

        newNode.next = temp2;
    }

    public static void main(String[] args) {
        NodeInsertionAtSpecificPositionOfLinkedList f1 = new NodeInsertionAtSpecificPositionOfLinkedList(10);
        NodeInsertionAtSpecificPositionOfLinkedList f2 = new NodeInsertionAtSpecificPositionOfLinkedList(20);
        NodeInsertionAtSpecificPositionOfLinkedList f3 = new NodeInsertionAtSpecificPositionOfLinkedList(30);
        NodeInsertionAtSpecificPositionOfLinkedList f4 = new NodeInsertionAtSpecificPositionOfLinkedList(40);
        NodeInsertionAtSpecificPositionOfLinkedList f5 = new NodeInsertionAtSpecificPositionOfLinkedList(50);

        f1.next = f2;
        f2.next = f3;
        f3.next = f4;
        f4.next = f5;

        NodeInsertionAtSpecificPositionOfLinkedList head = f1;

        f1.display(head);
        System.out.println();

         head.addNodeAtSpecificPosition(head,35,4);
         head.display(head);
    }
}
