package LinkedList;

class Node {
    int data;
    LinkedList.CircularLinkedList.Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class SinglyLinkedList {
    LinkedList.CircularLinkedList.Node head;

    public SinglyLinkedList() {}

    public void addToBeginning(int data) {
        LinkedList.CircularLinkedList.Node newNode = new LinkedList.CircularLinkedList.Node(data);
        newNode.next = head;
        head = newNode;
    }

    public void addToEnd(int data) {
        LinkedList.CircularLinkedList.Node newNode = new LinkedList.CircularLinkedList.Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        LinkedList.CircularLinkedList.Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
    }

    public void printList() {
        LinkedList.CircularLinkedList.Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("NULL");
        System.out.println();
    }


}

public class SinglyLinkedListClass {
    public static void main(String[] args) {
        SinglyLinkedList singlyLinkedList = new SinglyLinkedList();
        singlyLinkedList.addToBeginning(5);
        singlyLinkedList.addToBeginning(6);
        singlyLinkedList.addToBeginning(7);

        singlyLinkedList.addToEnd(8);
        singlyLinkedList.addToEnd(9);
        singlyLinkedList.addToEnd(10);

        singlyLinkedList.printList();
    }
}
