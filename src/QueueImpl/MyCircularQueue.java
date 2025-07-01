package QueueImpl;

class CircularQueue {
    int[] queue;
    int front, rear;
    int size;
    int maxSize;

    public CircularQueue(int maxSize) {
        queue = new int[maxSize];
        front = -1;
        rear = -1;
        this.size = 0;
        this.maxSize = maxSize;
    }

    public boolean isFull() {
        return size == maxSize;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public int peek() {
        return queue[front];
    }

    public void enQueue(int data) {
        if (isFull()) {
            System.out.println("Queue is full");
            return;
        }
        if (isEmpty()) {
            front = 0;
        }
        rear = (rear + 1) % maxSize;
        queue[rear] = data;
        size++;
    }

    public int deQueue() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return -1;
        }

        int data = queue[front];
        front = (front + 1) % maxSize;
        size--;
        return data;
    }

    public void printQueue() {
        if(front == -1) {
            System.out.println("Queue is empty");
            return;
        }

        int i = front;
        do {
            System.out.print(queue[i] + " ");
            i = (i + 1) % maxSize;
        } while (i != (rear + 1) % maxSize);
        System.out.println();
    }
}



public class MyCircularQueue {
    public static void main(String[] args) {
        CircularQueue queue = new CircularQueue(5);
        queue.enQueue(1);
        queue.enQueue(2);
        queue.enQueue(3);
        queue.enQueue(4);
        queue.enQueue(5);
        queue.printQueue();

        System.out.println("This is my front in queue: " + queue.peek());
        System.out.println("dequeue " + queue.deQueue());
        System.out.println("dequeue " + queue.deQueue());
        System.out.println("dequeue " + queue.deQueue());
        System.out.println("This is my front in queue: " + queue.peek());

        queue.printQueue();

        queue.enQueue(6);
        queue.enQueue(7);
        queue.enQueue(8);
        queue.enQueue(9);
        queue.printQueue();

        System.out.println("This is my front in queue: " + queue.peek());
        System.out.println("dequeue " + queue.deQueue());
        System.out.println("dequeue " + queue.deQueue());
        System.out.println("dequeue " + queue.deQueue());

        System.out.println("This is my front in queue: " + queue.peek());
        queue.enQueue(10);
        queue.enQueue(11);
        queue.enQueue(12);

        queue.printQueue();
        System.out.println("dequeue " + queue.deQueue());
        System.out.println("dequeue " + queue.deQueue());
        System.out.println("dequeue " + queue.deQueue());
        System.out.println("dequeue " + queue.deQueue());
        System.out.println("dequeue " + queue.deQueue());
        System.out.println("dequeue " + queue.deQueue());

    }
}
