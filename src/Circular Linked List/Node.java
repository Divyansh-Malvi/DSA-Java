import javax.imageio.stream.ImageInputStream;

public class Node {
    public Node prev;
    public int data;
    public Node next;

    public Node(int data) {
        prev = null;
        this.data = data;
        next = null;
        System.out.println("Node created");

    }
    public void display(Node head) {
        System.out.println("Print data of circular linked list");
        Node temp = head;
        do {
            System.out.print("\t" + temp.data);
            temp = temp.prev;
        } while (temp != head);
    }

    public static void main(String[] args) {
        Node f1 = new Node(10);
        Node f2 = new Node(20);
        Node f3 = new Node(30);
        Node f4 = new Node(40);
        Node f5 = new Node(50);

        Node head = f1;

        f1.next = f2;
        f2.prev = f1;
        f2.next = f3;
        f3.prev = f2;
        f3.next = f4;
        f4.prev = f3;
        f4.next = f5;
        f5.prev = f4;
        f5.next = f1;
        f1.prev = f5;


        head.display(f1);

    }
}
