package main

import (
	"fmt"
	"math/rand"
)

func main() {
	var list [10]int

	for i := 0; i < len(list); i++ {
		list[i] = rand.Intn(100)
	}

	list = selectionSort(list)
	fmt.Println(list)

}

func selectionSort(list [10]int) [10]int {
	for i := 0; i < len(list)-1; i++ {
		min := i
		for u := i + 1; u < len(list); u++ {
			if list[u] < list[min] {
				min = u
			}
		}

		list[i], list[min] = list[min], list[i]
	}

	return list
}
