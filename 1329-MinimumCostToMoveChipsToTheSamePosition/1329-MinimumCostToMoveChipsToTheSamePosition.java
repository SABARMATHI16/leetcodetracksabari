// Last updated: 2/2/2026, 2:28:50 PM
class Solution {
    public int minCostToMoveChips(int[] position) {
        int cost=0,a=0;
        for(int x:position){
        if(x%2==0){ 
            cost++;}
        else {
            a++;
        }
        }
        return (cost<a)?cost:a;
 }

}
