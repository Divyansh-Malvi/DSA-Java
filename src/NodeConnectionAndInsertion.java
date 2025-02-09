import org.w3c.dom.Node;


public class NodeConnectionAndInsertion {
    public int data;
    public NodeConnectionAndInsertion next;

    public NodeConnectionAndInsertion(int data){
        this.data = data;
        next = null;
        System.out.println("Node created successful");
    }
    public void display(NodeConnectionAndInsertion head){
        NodeConnectionAndInsertion temp = head;
        while (temp != null) {
            System.out.print(" ===> " + temp.data );
            temp = temp.next;
        }
    }

    public static void main(String[] args) {
//        data assign
        NodeConnectionAndInsertion f1 = new NodeConnectionAndInsertion(10);
        NodeConnectionAndInsertion f2 = new NodeConnectionAndInsertion(20);
        NodeConnectionAndInsertion f3 = new NodeConnectionAndInsertion(30);
        NodeConnectionAndInsertion f4 = new NodeConnectionAndInsertion(40);
        NodeConnectionAndInsertion f5 = new NodeConnectionAndInsertion(50);

//        node connection

        f1.next = f2;
        f2.next = f3;
        f3.next = f4;
        f4.next = f5;

        NodeConnectionAndInsertion head = f1;

        System.out.print(" ===> " + head.data);
        System.out.print(" ===> " + head.next.data);
        System.out.print(" ===> " + head.next.next.data);
        System.out.print(" ===> " + head.next.next.next.data);
        System.out.print(" ===> " + head.next.next.next.next.data);

        System.out.println();
        
        System.out.println("Printing data of singly linked list using display method");
        f1.display(head);
    }

}
