package com.example.datastructure;

public class LinkedListExample {
    //define node

    Node head;  // head node of the linkedlist

    // Constructor to initialize an empty linked list
    public LinkedListExample(){

        head = null;
    }

    //insert a new node at the beginining the the list
    public void insertAtBegining(){
        Node newNode = new Node(12);
        newNode.next = head;
        head = newNode;
    }

    public void insertAtEnd(){
        Node newNode = new Node(14);
        Node tempNode = head;
        if(head==null){
            head = newNode;
            return;
        }
        while(tempNode.next !=null){
            tempNode = tempNode.next;
        }
        tempNode.next = newNode;


    }
    public void deleteElement(int key){
        Node first = head;
        Node prev = null;

        if(first != null && first.item==key){
            head = first.next;
            return;
        }

        while(first != null && first.item !=key){
            prev = first;
            first = first.next;
        }
        prev.next = first.next;
        System.out.println("Element is deleted");
    }

    public void printList() {
        Node temp = head;
        System.out.println("The data is " + temp.item);
        while (temp != null) {
            System.out.println(temp.item);
            temp = temp.next;
        }
    }

        public void insertAtSpecifiedPosition(int pos, int item){
            Node newNode = new Node(item);

            if(head == null){
                head = newNode;

            }
            if(pos == 1){
                newNode.next = head;
                head = newNode;
                return;
            }
            Node temp = head;
            for (int i = 1; i < pos - 1; i++) {
                if (temp == null) {
                    System.out.println("Position out of bounds");
                    return;
                }
                temp = temp.next;
            }

            newNode.next = temp.next;
            temp.next = newNode;

    }

    public static void main(String[]args){

        LinkedListExample list = new LinkedListExample();
        list.insertAtBegining();
        list.insertAtEnd();
        list.printList();
        list.insertAtSpecifiedPosition(2,23);
        list.printList();
        list.insertAtSpecifiedPosition(4,45);
        list.printList();
    }
}
