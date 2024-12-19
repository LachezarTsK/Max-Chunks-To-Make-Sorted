
package main

import "fmt"

func maxChunksToSorted(input []int) int {
    maxNumberOfChunks := 0
    minValueInCurrentChunk := len(input) - 1

    for i := len(input) - 1; i >= 0; i-- {
        minValueInCurrentChunk = min(minValueInCurrentChunk, input[i])
        if minValueInCurrentChunk == i {
            maxNumberOfChunks++
        }
    }
    return maxNumberOfChunks
}
