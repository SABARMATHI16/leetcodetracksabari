// Last updated: 2/2/2026, 2:28:41 PM
class Solution {
public:
    int numWaterBottles(int numBottles , int numExchange ){
        return numBottles + (numBottles - 1) / (numExchange - 1);

    }
};