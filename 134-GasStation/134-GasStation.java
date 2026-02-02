// Last updated: 2/2/2026, 2:29:43 PM
class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
    int tg = 0, tc = 0,s=0;

    int n= gas.length;
    for (int i = 0; i < n; i++) {
        tg += gas[i]-cost[i];
        tc += gas[i]-cost[i];
    if (tc < 0) {
            tc=0;
             s = i + 1;      
    }
    }
    return tg>=0 ?s:-1;
    }
}