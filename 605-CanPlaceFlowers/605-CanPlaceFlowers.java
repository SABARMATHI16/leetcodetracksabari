// Last updated: 2/2/2026, 2:29:04 PM
class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int emptyCount = 1; 
        for (int plot : flowerbed) {
            if (plot == 1) {
                emptyCount = 0;
            } else {
                emptyCount++;
            }
            if (emptyCount == 3) {
                n--;
                emptyCount = 1;
            }
        }
        if (emptyCount == 2) {
            n--;
        }
        return n <= 0;
    }
}