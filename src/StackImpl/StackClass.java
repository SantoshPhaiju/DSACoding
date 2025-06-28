package StackImpl;


class Stack {
    int[] array = new int[10];
    int top;
    int capacity = 10;

    public Stack() {
        top = -1;
    }

    public void push(int data) {
        if (top == capacity - 1) {
            System.out.println("Stack is full. " + data + " is not inserted in stack!");
            return;
        }
        array[++top] = data;
    }

    public int pop() {
        if (top == -1) {
            System.out.println("Stack is empty!");
            return -1;
        }
        return array[top--];
    }

    public int peek() {
        if (top == -1) {
            System.out.println("Stack is empty!");
            return -1;
        }
        return array[top];
    }

    public boolean isFull() {
        return top == capacity - 1;
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public void printStack() {
        System.out.println("Stack is: ");
        for (int i = top; i >= 0; i--) {
            System.out.println(array[i] + " ");
        }
    }
}

public class StackClass {

    public static void main(String[] args) {
        Stack stack = new Stack();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        stack.push(6);
        stack.push(7);
        stack.push(8);
        stack.push(9);
        stack.push(10);
        stack.push(11);

        stack.printStack();
        System.out.println("Stack is full: " + stack.isFull());
        System.out.println(stack.pop() + " is popped from the stack");
        System.out.println(stack.pop() + " is popped from the stack");
        System.out.println(stack.pop() + " is popped from the stack");
        System.out.println(stack.pop() + " is popped from the stack");
        System.out.println(stack.pop() + " is popped from the stack");
        stack.printStack();
        System.out.println(stack.peek() + " is at the top of the stack");
        System.out.println("Stack is empty: " + stack.isEmpty());
        System.out.println("Stack is full: " + stack.isFull());
    }
}
