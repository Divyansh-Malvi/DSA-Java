public class DeletionOfFirstNodeAtLinkedList {
    int data;
    DeletionOfFirstNodeAtLinkedList next;

    public DeletionOfFirstNodeAtLinkedList(int data){
        this.data = data;
        next = null;

        System.out.println("Node created");
    }
    public void display(DeletionOfFirstNodeAtLinkedList head) {
        DeletionOfFirstNodeAtLinkedList temp = head;
        while (temp != null) {
            System.out.print(" ===> " + temp.data);
            temp = temp.next;
        }
    }
    //creating class for deletion

    public DeletionOfFirstNodeAtLinkedList deleteFirstNode(DeletionOfFirstNodeAtLinkedList head) {
        //step 1: check list is empty or not
        if (head == null) {
            System.out.println("list id empty");
        } else {
            //step 2: create a temp variable and assign head in  it

            DeletionOfFirstNodeAtLinkedList temp = head;

            //step 3: traverse head

            head = head.next;

            //step 4: remove the memory

            temp = null;

        }

        return head;

    }

    public static void main(String[] args) {
        DeletionOfFirstNodeAtLinkedList f1 = new DeletionOfFirstNodeAtLinkedList(10);
        DeletionOfFirstNodeAtLinkedList f2 = new DeletionOfFirstNodeAtLinkedList(20);
        DeletionOfFirstNodeAtLinkedList f3 = new DeletionOfFirstNodeAtLinkedList(30);
        DeletionOfFirstNodeAtLinkedList f4 = new DeletionOfFirstNodeAtLinkedList(40);
        DeletionOfFirstNodeAtLinkedList f5 = new DeletionOfFirstNodeAtLinkedList(50);

        f1.next = f2;
        f2.next = f3;
        f3.next = f4;
        f4.next = f5;

        DeletionOfFirstNodeAtLinkedList head = f1;

        f1.display(head);
        System.out.println();

        head = head.deleteFirstNode(head);
        head.display(head);

    }
}
