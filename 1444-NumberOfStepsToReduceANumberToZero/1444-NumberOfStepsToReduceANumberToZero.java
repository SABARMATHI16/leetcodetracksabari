// Last updated: 2/2/2026, 2:28:45 PM
class Solution {
    public int numberOfSteps(int num) {
        int step=0;
        while(num!=0){
        if(num%2==0) num/=2; 
        else num-=1;
           step++;
        }return step;
}
}