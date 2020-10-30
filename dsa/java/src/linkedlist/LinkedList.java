package linkedlist;

import java.util.ArrayList;

public class LinkedList {
    private Node head;

    public LinkedList(Node head){
        this.head = head;
    }

    // Inserting value
    public void insertNode(int value){
        Node node = new Node(value);
        Node head = this.head;

        if(head == null){
            this.head = node;
            return;
        }

        while(head.getNext() != null){
            head = head.getNext();
        }

        head.setNext(node);
    }

    public void deleteNode(Node node){
        Node head = this.head;
        Node prev = null;

        while(head != null && head.getValue() != node.getValue()){
            prev = head;
            head = head.getNext();
        }

        prev.setNext(head.getNext());
    }

    public void deleteNode(int value){
        Node head = this.head;
        Node prev = null;

        while(head != null && head.getValue() != value){
            prev = head;
            head = head.getNext();
        }

        prev.setNext(head.getNext());
    }

    public void insertAt(Node node, int pos){
        Node head = this.head;
        int count = 1;
        while(head != null && count < pos){
            head = head.getNext();
            count++;
        }

        node.setNext(head.getNext());
        head.setNext(node);
    }

    public void insertAt(int value, int pos){
        Node node = new Node(value);
        Node head = this.head;
        int count = 1;
        while(head != null && count < pos){
            head = head.getNext();
            count++;
        }

        node.setNext(head.getNext());
        head.setNext(node);
    }

    public Node getTail(){
        Node head = this.head;

        while(head.getNext() != null){
            head = head.getNext();
        }

        return head;
    }

    // Inserting Node
    public void insertNode(Node node){
        Node head = this.head;

        if(head == null){
            this.head = node;
            return;
        }

        while(head.getNext() != null){
            head = head.getNext();
        }

        head.setNext(node);
    }

    public int getLength(){
        Node head = this.head;
        int count = 0;

        while(head != null){
            count++;
            head = head.getNext();
        }
        return count;
    }

    // Search by node
    public int search(Node node){
        Node head = this.head;
        int count = 1;
        while(head != null){
            if(head.getValue() == node.getValue()){
                return count;
            }
            head = head.getNext();
            count++;
        }

        return -1;
    }

    // Search by value
    public int search(int value){
        Node head = this.head;
        int count = 1;
        while(head != null){
            if(head.getValue() == value){
                return count;
            }
            head = head.getNext();
            count++;
        }

        return -1;
    }

    // Display list
    public void printList(){
        Node head = this.head;

        while(head != null){
            System.out.println(head.getValue());
            head = head.getNext();
        }
    }

}
