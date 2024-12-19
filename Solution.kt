
import kotlin.math.min

class Solution {

    fun maxChunksToSorted(input: IntArray): Int {
        var maxNumberOfChunks = 0
        var minValueInCurrentChunk = input[input.size - 1]

        for (i in input.size - 1 downTo 0) {
            minValueInCurrentChunk = min(minValueInCurrentChunk, input[i])
            if (minValueInCurrentChunk == i) {
                ++maxNumberOfChunks
            }
        }
        return maxNumberOfChunks
    }
}
