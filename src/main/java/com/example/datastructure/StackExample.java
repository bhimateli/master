package com.example.datastructure;

public class StackExample {

    int top;
    int capacity;
    int  []stackArray;

    public StackExample(int capacity){   // constructor to initialize
        this.capacity = capacity;
        top =-1;
        stackArray = new int[capacity];
    }


    public void pushElement(int data){
        if (isFull()) {
            System.out.println("Stack Overflow! Cannot push " + data);
            return;
        }
        stackArray[++top] = data;  // Increment top and then insert element
    }

    public int popElement(){
        if (isEmpty()) {
            System.out.println("Stack Underflow! No element to pop.");
            return -1;  // Return -1 to indicate underflow
        }
        return stackArray[top--];  // Return element and decrement top
    }

    public boolean isEmpty() {
        return top == -1;
    }

    // Check if the stack is full
    public boolean isFull() {
        return top == capacity - 1;
    }

    // Get the current size of the stack
    public int size() {
        return top + 1;
    }

    // Display all elements in the stack
    public void display() {
        if (isEmpty()) {
            System.out.println("Stack is empty.");
            return;
        }
        System.out.print("Stack elements: ");
        for (int i = 0; i <= top; i++) {
            System.out.print(stackArray[i] + " ");
        }
        System.out.println();
    }
}
