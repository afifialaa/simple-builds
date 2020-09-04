package main

import (
	"fmt"
)

func main() {
	list := []int{23, 1, 56, 90, 56, 43, 75}
	newList := bubbleSort(list)
	for _, v := range newList {
		fmt.Println(v)
	}
}

func bubbleSort(list []int) []int {
	for i := 0; i < len(list); i++ {
		swapped := false
		for u := 0; u < len(list)-1; u++ {
			if list[u] > list[u+1] {
				list[u], list[u+1] = list[u+1], list[u]
				swapped = true
			}
		}

		if !swapped {
			break
		}
	}

	return list
}
