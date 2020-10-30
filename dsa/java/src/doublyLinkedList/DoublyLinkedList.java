package doublyLinkedList;

public class DoublyLinkedList<E> {
    private int  data;
    private Node head;

    public DoublyLinkedList(Node head){
        this.head = head;
    }

    public Node getHead(){
        return this.head;
    }

    // Insert by data
    public void insertNode(E data){
        Node<E> head = this.head;
        while(head.getNext() != null){
            head = head.getNext();
        }
        // Insert node at tail
        head.setNext(data);
        System.out.println("Node was inserted");
    }

    // Insert by node
    public void insertNode(Node node){
        Node curr = this.head;
        while(curr.getNext() != null){
            curr = curr.getNext();
        }

        curr.setNext(node);
        return;
    }

    public void printList(){
        Node head = this.head;

        while(head != null){
            System.out.println(head.getData());
        }
        return;
    }

    public int getLength(){
        if(this.head == null){
            return 0;
        }
        Node head = this.head;
        int count = 1;

        while(head.getNext() != null){
            head = head.getNext();
            count++;
        }

        return count;
    }

}
