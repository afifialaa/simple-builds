package main

import (
	"fmt"
)

type Stack []int

func (s Stack) push(item int)Stack{
    s = append(s, item)
    return s
}

func (s Stack) peek()int{
    return s[len(s)-1]
}

func (s Stack) pop()(Stack, int){
    item := s[len(s)-1]
    s = s[:len(s)-1]
    return s, item
}

func (s Stack) getLength()int{
    return len(s)
}

func main(){
    var stack Stack
    stack = stack.push(1)
    stack = stack.push(2)
    stack = stack.push(3)
    stack = stack.push(4)

    stack, _ = stack.pop()
    fmt.Println(stack.peek())

}
