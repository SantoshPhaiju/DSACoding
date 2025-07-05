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

    public void insertAtFront(int data) {
        Node2 newNode = new Node2(data);
        if (head == null) {
            head = newNode;
            tail = newNode;
            newNode.next = newNode;
            size++;
        } else {
            newNode.next = head;
            head = newNode;
            tail.next = head;
            size++;
        }

    }

    public void printList() {
        Node2 temp = head;

        System.out.println("Printing circular singly linked list");
        for (int i = 0; i < size; i++) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.print(temp.data);
        System.out.println();
    }


}

public class CircularSinglyLinkedList {
    public static void main(String[] args) {
        SinglyCircularLinkedList list = new SinglyCircularLinkedList();
        list.insertAtEnd(1);
        list.insertAtEnd(2);
        list.insertAtEnd(3);
        list.insertAtEnd(4);

        list.insertAtFront(5);
        list.insertAtFront(6);

        list.printList();


    }
}
