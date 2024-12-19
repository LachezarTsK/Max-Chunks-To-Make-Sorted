
public class Solution {

    public int maxChunksToSorted(int[] input) {
        int maxNumberOfChunks = 0;
        int minValueInCurrentChunk = input[input.length - 1];

        for (int i = input.length - 1; i >= 0; --i) {
            minValueInCurrentChunk = Math.min(minValueInCurrentChunk, input[i]);
            if (minValueInCurrentChunk == i) {
                ++maxNumberOfChunks;
            }
        }
        return maxNumberOfChunks;
    }
}
