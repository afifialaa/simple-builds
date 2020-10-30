package main

import "fmt"

type Node struct {
	value int
	left  *Node
	right *Node
}

type Tree struct {
	root *Node
}

func (t Tree) insertNode(node *Node) Tree {

	curr := t.root
	for true {
		if curr.value >= node.value {
			// went left
			if curr.left == nil {
				curr.left = node
				break
			} else {
				curr = curr.left
				continue
			}

		} else {
			// went right
			if curr.right == nil {
				curr.right = node
				break
			} else {
				curr = curr.right
				continue
			}
		}
	}
	return t
}

func main() {
	root := Node{
		value: 100,
		left:  nil,
		right: nil,
	}
	tree := Tree{root: &root}
	node1 := Node{value: 90, left: nil, right: nil}
	node2 := Node{value: 70, left: nil, right: nil}
	node3 := Node{value: 80, left: nil, right: nil}
	node4 := Node{value: 110, left: nil, right: nil}
	node5 := Node{value: 120, left: nil, right: nil}

	tree = tree.insertNode(&node1)
	tree = tree.insertNode(&node2)
	tree = tree.insertNode(&node3)
	tree = tree.insertNode(&node4)
	tree = tree.insertNode(&node5)
	fmt.Println(node2.right)
	fmt.Println(node2.left)
}
