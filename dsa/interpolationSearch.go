package main

import (
	"fmt"
)

func main() {
	list := [10]int{1, 2, 3, 4, 5, 6, 7, 8, 9, 10}
	var ans int = interpolationSearch(list, 11)
	fmt.Println(ans)
}

func interpolationSearch(list [10]int, key int) int {
	var leftIndex int = 0
	var rightIndex int = len(list) - 1

	for leftIndex <= rightIndex && key < list[rightIndex] && key > list[leftIndex] {
		if leftIndex == rightIndex {
			if list[leftIndex] == key {
				return leftIndex
			} else {
				return -1
			}
		}

		var mid int = leftIndex + (rightIndex-leftIndex)*(key-list[leftIndex])/(list[rightIndex]-list[leftIndex])

		if list[mid] == key {
			return mid
		}

		if list[mid] < key {
			leftIndex = mid + 1
		} else {
			rightIndex = mid - 1
		}
	}

	return -1

}
