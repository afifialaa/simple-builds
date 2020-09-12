package main

import (
	"fmt"
)

func main() {
	a := []int{1, 2, 3, 4, 5, 6, 7, 8, 9, 10}
	ans := binarySearch(a, 11)
	fmt.Println(ans)
}

func binarySearch(a []int, key int) int {
	low, high := 0, len(a)-1

	for low <= high {
		mid := (low + high) / 2
		if a[mid] == key {
			return mid
		} else if a[mid] > key {
			high = mid - 1
		} else {
			low = mid + 1
		}
	}

	return -1
}
