package LinkedList.CircularLinkedList;


class Node2 {
    int data;
    Node2 next;

    public Node2(int data) {
        this.data = data;
        this.next = null;
    }
}

class SinglyCircularLinkedList {
    Node2 head;
    Node2 tail;
    public int size;

    public SinglyCircularLinkedList() {
        this.size = 0;
    }

    public void insertAtEnd(int data) {
        Node2 newNode = new Node2(data);
        if (head == null) {
            head = newNode;
            tail = newNode;
            newNode.next = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
            newNode.next = head;
        }
        size++;
    }


}

public class CircularSinglyLinkedList {
    public static void main(String[] args) {
        SinglyCircularLinkedList list = new SinglyCircularLinkedList();
        list.insertAtEnd(1);
        list.insertAtEnd(2);

    }
}
