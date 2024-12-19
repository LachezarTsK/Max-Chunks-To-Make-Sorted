
using System;

public class Solution
{
    public int MaxChunksToSorted(int[] input)
    {
        int maxNumberOfChunks = 0;
        int minValueInCurrentChunk = input[input.Length - 1];

        for (int i = input.Length - 1; i >= 0; --i)
        {
            minValueInCurrentChunk = Math.Min(minValueInCurrentChunk, input[i]);
            if (minValueInCurrentChunk == i)
            {
                ++maxNumberOfChunks;
            }
        }
        return maxNumberOfChunks;
    }
}
