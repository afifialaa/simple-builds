package main

import(
    "fmt"
)

type Queue []int

func (q Queue)enqueue(item int)Queue{
    q = append(q, item)
    return q
}

func (q Queue) dequeue() (Queue, int){
    item := q[0]
    q = q[1:]
    return q, item
}

func (q Queue) getLength()int{
	return len(q)
}

func main(){
	var q Queue
	q = q.enqueue(1)
	q = q.enqueue(2)
	q = q.enqueue(3)
	q = q.enqueue(4)
	q = q.enqueue(5)

	fmt.Println(q.getLength())
	q, i := q.dequeue()
	fmt.Println(i)
	q, i = q.dequeue()
	fmt.Println(i)
}
