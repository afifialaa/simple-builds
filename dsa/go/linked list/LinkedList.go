package main

import "fmt"

// NODE ***********

type Node struct {
	Value int
	Next  *Node
}

func (n Node) getValue() int {
	return n.Value
}

func (n Node) setValue(value int) {
	n.Value = value
}

func (n Node) getNext() *Node {
	return n.Next
}

func (n Node) setNext(node *Node) {
	n.Next = node
}

// *********** LIST ***********

type List struct {
	Head *Node
}

func (l List) getHead() *Node {
	return l.Head
}

func (l List) getLength() int {
	head := l.getHead()
	count := 1
	for head.getNext() != nil {
		head = head.getNext()
		count++
	}

	return count
}

func (l List) getTail() *Node {
	head := l.getHead()
	for head.getNext() != nil {
		head = head.getNext()
	}

	return head
}

func (l List) addNode(n *Node) {
	head := l.getHead()

	for head.getNext() != nil {
		head = head.getNext()
	}

	fmt.Println("adding node to last")
	head.Next = n
	return
}

// *********** MAIN ***********

func main() {
	head := Node{
		Value: 100,
		Next:  nil,
	}

	node1 := Node{Value: 90, Next: nil}
	node2 := Node{Value: 80, Next: nil}
	node3 := Node{Value: 70, Next: nil}
	node4 := Node{Value: 60, Next: nil}
	node5 := Node{Value: 50, Next: nil}
	node6 := Node{Value: 40, Next: nil}
	node7 := Node{Value: 30, Next: nil}
	node8 := Node{Value: 20, Next: nil}

	list := List{Head: &head}

	head.Next = &node1
	node1.Next = &node2
	node2.Next = &node3
	node3.Next = &node4
	node4.Next = &node5
	node5.Next = &node6
	node6.Next = &node7
	node7.Next = &node8

	nodeTest := Node{Value: 2000, Next: nil}

	list.addNode(&nodeTest)
	fmt.Println(list.getTail().getValue())
}
