
/**
 * @param {number[]} input
 * @return {number}
 */
var maxChunksToSorted = function (input) {
    let maxNumberOfChunks = 0;
    let minValueInCurrentChunk = input[input.length - 1];

    for (let i = input.length - 1; i >= 0; --i) {
        minValueInCurrentChunk = Math.min(minValueInCurrentChunk, input[i]);
        if (minValueInCurrentChunk === i) {
            ++maxNumberOfChunks;
        }
    }
    return maxNumberOfChunks;
};
