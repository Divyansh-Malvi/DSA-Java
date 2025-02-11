public class DeleteNodeAtSpecificPositionInLinkedList {
    int data;
    DeleteNodeAtSpecificPositionInLinkedList next;

    public DeleteNodeAtSpecificPositionInLinkedList(int data) {
        this.data = data;
        next = null;
        System.out.println("Null created");
    }
    public void display(DeleteNodeAtSpecificPositionInLinkedList head) {
        DeleteNodeAtSpecificPositionInLinkedList temp = head;
        while (temp != null) {
            System.out.print(" ===> " + temp.data);
            temp = temp.next;
        }
    }
    public DeleteNodeAtSpecificPositionInLinkedList deleteNodeAtPosition(DeleteNodeAtSpecificPositionInLinkedList head , int position) {
        //step1: check list is empty or not
        if (head == null) {
            System.out.println("List is empty");
        } // step2: check list have only one node or not
         else if (head.next == null) {
            System.out.println("List only have one node");
            head = head.next;
            return head;

        } else {
            //step3: traverse the list till position
            DeleteNodeAtSpecificPositionInLinkedList temp1 = head;
            DeleteNodeAtSpecificPositionInLinkedList temp2 = head.next;
            position--;

            while (position > 1) {
                temp1 = temp1.next;
                temp2 = temp2.next;
                position--;
            }
            temp1.next = temp2.next;
        }
        return head;

    }

    public static void main(String[] args) {
       DeleteNodeAtSpecificPositionInLinkedList f1 = new DeleteNodeAtSpecificPositionInLinkedList(10);
       DeleteNodeAtSpecificPositionInLinkedList f2 = new DeleteNodeAtSpecificPositionInLinkedList(20);
       DeleteNodeAtSpecificPositionInLinkedList f3 = new DeleteNodeAtSpecificPositionInLinkedList(30);
       DeleteNodeAtSpecificPositionInLinkedList f4 = new DeleteNodeAtSpecificPositionInLinkedList(40);
       DeleteNodeAtSpecificPositionInLinkedList f5 = new DeleteNodeAtSpecificPositionInLinkedList(45);
       DeleteNodeAtSpecificPositionInLinkedList f6 = new DeleteNodeAtSpecificPositionInLinkedList(50);

       f1.next = f2;
       f2.next = f3;
       f3.next = f4;
       f4.next = f5;
       f5.next = f6;

       DeleteNodeAtSpecificPositionInLinkedList head = f1;

       f1.display(head);

        System.out.println();
        System.out.println("Linked List after deletion of position 5 node");
        head = head.deleteNodeAtPosition(head , 5);
        head.display(head);

    }
}
