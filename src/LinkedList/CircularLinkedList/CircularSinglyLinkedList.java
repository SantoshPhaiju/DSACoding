package LinkedList.CircularLinkedList;


class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class SinglyCircularLinkedList {
    Node head;
    Node tail;

    public SinglyCircularLinkedList() {}

    public void insertAtEnd(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            tail = newNode;
            newNode.next = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
            newNode.next = head;
        }
    }


}

public class CircularSinglyLinkedList {
    public static void main(String[] args) {

    }
}
