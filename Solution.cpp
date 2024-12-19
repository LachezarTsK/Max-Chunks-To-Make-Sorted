
#include <vector>
#include <algorithm>
using namespace std;

class Solution {

public:
    int maxChunksToSorted(vector<int>& input) const {
        int maxNumberOfChunks = 0;
        int minValueInCurrentChunk = input[input.size() - 1];

        for (size_t i = input.size() - 1; i != variant_npos; --i) {
            minValueInCurrentChunk = min(minValueInCurrentChunk, input[i]);
            if (minValueInCurrentChunk == i) {
                ++maxNumberOfChunks;
            }
        }
        return maxNumberOfChunks;
    }
};
