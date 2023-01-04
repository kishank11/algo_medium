package main

import (
	"fmt"
	"sort"
)

func ThreeNumberSum(array []int, target int) [][]int {
	sort.Ints(array)
	triplets := [][]int{}
	for i := 0; i < len(array)-2; i++ {
		left, right := i+1, len(array)-1
		for left < right {
			currentSum := array[i] + array[left] + array[right]
			if currentSum == target {
				triplets = append(triplets, []int{array[i], array[left], array[right]})
				left += 1
				right -= 1

			} else if currentSum < target {
				left += 1
			} else if currentSum > target {
				right -= 1
			}
		}
	}
	return triplets
}

func main() {
	x := []int{1, 4, 3, 7}
	fmt.Println(ThreeNumberSum(x, 8))
}
