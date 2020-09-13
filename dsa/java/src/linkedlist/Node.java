package linkedlist;

public class Node {
    private int value;
    private Node next;

    public Node(int value){
        this.value = value;
        this.next = null;
    }

    public Node(int value, Node node){
        this.value = value;
        this.next = node;
    }

    public Node getNext(){
        return this.next;
    }

    public void setNext(Node next){
        this.next = next;
    }

    public int getValue(){
        return this.value;
    }

    public void setValue(int value){
        this.value = value;
    }
}
