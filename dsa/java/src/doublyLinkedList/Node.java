package doublyLinkedList;

public class Node<E> {
    private E data;
    private Node next;
    private Node prev;

    public Node(E data){
        this.data = data;
        this.next = null;
        this.prev = null;
    }

    public void setData(E data){
        this.data = data;
    }

    public E getData(){
        return this.data;
    }

    public void setNext(Node node){
        this.next = node;
        node.setPrev(this);
    }

    public void setNext(E data){
        Node<E> node = new Node<>(data);
        this.next = node;
        node.prev = this;
    }

    public Node getNext(){
        return this.next;
    }

    public void setPrev(Node node){
        this.prev = node;
    }

    public Node getPrev(){
        return this.prev;
    }

}
