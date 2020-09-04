package main

import (
	"fmt"
)

func main() {
	list := []int{23, 1, 56, 90, 56, 43, 75}
	newList := insertionSort(list)
	for _, v := range newList {
		fmt.Println(v)
	}
}

func insertionSort(list []int) []int {
	for i := 1; i < len(list); i++ {
		u := i - 1
		curr := list[i]
		for u >= 0 && list[u] > curr {
			list[u+1] = list[u]
			u--
		}
		list[u+1] = curr
	}
	return list
}
