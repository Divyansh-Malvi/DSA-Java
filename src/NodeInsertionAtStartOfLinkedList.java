public class NodeInsertionAtStartOfLinkedList {
    public int data;
    public NodeInsertionAtStartOfLinkedList next;

    public NodeInsertionAtStartOfLinkedList(int data){
        this.data = data;
        next = null;
        System.out.println("Node created successfully");
    }
    public void display(NodeInsertionAtStartOfLinkedList head){

        NodeInsertionAtStartOfLinkedList temp = head;
        while (temp != null) {
            System.out.print(" ===> " + temp.data);
            temp = temp.next;
        }
    }

    // now we will make method to add new node at the starting

    public NodeInsertionAtStartOfLinkedList addNewNode(NodeInsertionAtStartOfLinkedList head , int data) {

        // step 1: create a new node;
        NodeInsertionAtStartOfLinkedList newNode = new NodeInsertionAtStartOfLinkedList(data);

        //step 2: connect new node with head
        newNode.next = head;

        //step 3: update head by newNode
        head = newNode;

        return head;
    }

    public static void main(String[] args) {
        NodeInsertionAtStartOfLinkedList f1 = new NodeInsertionAtStartOfLinkedList(10);
        NodeInsertionAtStartOfLinkedList f2 = new NodeInsertionAtStartOfLinkedList(20);
        NodeInsertionAtStartOfLinkedList f3 = new NodeInsertionAtStartOfLinkedList(30);
        NodeInsertionAtStartOfLinkedList f4 = new NodeInsertionAtStartOfLinkedList(40);
        NodeInsertionAtStartOfLinkedList f5 = new NodeInsertionAtStartOfLinkedList(50);

        // node connection;

        f1.next = f2;
        f2.next = f3;
        f3.next = f4;
        f4.next = f5;

        NodeInsertionAtStartOfLinkedList head = f1;
        f1.display(head);
        System.out.println();
        head = head.addNewNode(head,5);
        head.display(head);



    }

}
