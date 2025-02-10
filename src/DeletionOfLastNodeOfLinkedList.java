public class DeletionOfLastNodeOfLinkedList {
    int data;
    DeletionOfLastNodeOfLinkedList next;

    public DeletionOfLastNodeOfLinkedList(int data) {
        this.data = data;
        next = null;
        System.out.println("Node created");
    }
    public void display(DeletionOfLastNodeOfLinkedList head) {
        DeletionOfLastNodeOfLinkedList temp = head;
        while (temp != null) {
            System.out.print(" ===> " +temp.data);
            temp = temp.next;
        }
    }
    //creating a class for deleting last node

    public DeletionOfLastNodeOfLinkedList deleteLastNode(DeletionOfLastNodeOfLinkedList head) {
        DeletionOfLastNodeOfLinkedList temp1 = head;

        if (head == null) {
            System.out.println("List is empty");
            return head;
        } else if (head.next == null){
            System.out.println("list have only single node");
            head = head.next;
            return head;
        } else {
            // traverse list to second last element
            while (temp1.next.next != null) {
                temp1 = temp1.next;
            }
            temp1.next = null;
        }
        return head;
        
    }

    public static void main(String[] args) {
        DeletionOfLastNodeOfLinkedList f1 = new DeletionOfLastNodeOfLinkedList(10);
        DeletionOfLastNodeOfLinkedList f2 = new DeletionOfLastNodeOfLinkedList(20);
        DeletionOfLastNodeOfLinkedList f3 = new DeletionOfLastNodeOfLinkedList(30);
        DeletionOfLastNodeOfLinkedList f4 = new DeletionOfLastNodeOfLinkedList(40);

        f1.next = f2;
        f2.next = f3;
        f3.next = f4;

        DeletionOfLastNodeOfLinkedList head = f1;
        f1.display(head);
        System.out.println();
        System.out.println("List after deletion of last node");
        head = head.deleteLastNode(head);
        head.display(head);
    }
}
