package QueueImpl;


class Queue {
    final private int maxSize;
    int[] queue;
    int front, rear;

    public Queue(int size) {
        this.maxSize = size;
        this.queue = new int[maxSize];
        this.front = -1;
        this.rear = -1;
    }

    public void enQueue(int data) {
        if (rear == maxSize - 1) {
            System.out.println("Queue is full");
            return;
        }
//        if (front == -1) {
//            front = 0;
//            rear = 0;
//            queue[front] = data;
//        } else {
//            rear++;
//            queue[rear] = data;
//        }

        if (front == -1) {
            front = 0;
        }
        queue[++rear] = data;
    }

    public int deQueue() {
        if (front == -1) {
            System.out.println("Queue is empty");
            return -1;
        }
        int data = queue[front];
        front = front + 1;
        return data;
    }

    public void printQueue() {
        if(front == -1) {
            System.out.println("Queue is empty");
            return;
        }

        for (int i = front; i <= rear; i++) {
            System.out.print(queue[i] + " ");
        }

    }
}

public class QueueClass {
    public static void main(String[] args) {
        Queue queue = new Queue(5);
        queue.enQueue(1);
        queue.enQueue(2);
        queue.enQueue(3);
        queue.enQueue(4);
        queue.enQueue(5);

        System.out.println(queue.deQueue() + " is dequeued");
        System.out.println(queue.deQueue() + " is dequeued");
        System.out.println(queue.deQueue() + " is dequeued");

        queue.enQueue(6);

        queue.printQueue();
    }
}
