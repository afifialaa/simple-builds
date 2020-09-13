package queue;

import java.util.ArrayList;

public class Queue<E> {
    private ArrayList<E> queue;

    public Queue(){
        this.queue = new ArrayList<E>();
    }

    public void enqueue(E item){
        this.queue.add(item);
    }

    public E dequeue(){
        return this.queue.remove(0);
    }

    public int getSize(){
        return this.queue.size();
    }
}
