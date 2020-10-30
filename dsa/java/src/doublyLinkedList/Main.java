package doublyLinkedList;

public class Main {

    public static void main(String[] args){
        Node<Integer> head = new Node<>(10);
        DoublyLinkedList<Integer> list = new DoublyLinkedList<>(head);
        list.insertNode(new Node(20));
        list.insertNode(new Node(30));
        list.insertNode(new Node(40));

        System.out.println(list.getLength());
    }

}
