// Last updated: 2/2/2026, 2:28:42 PM
class Solution {
    public int numIdenticalPairs(int[] nums) {
        Map<Integer,Integer> freq=new HashMap();
        for(int x: nums){
            if(freq.containsKey(x)){
               freq.put(x,freq.get(x)+1);
            }else{
                freq.put(x,1);
            }
        }
        int pair=0;
        for(int n:freq.values()){
            pair += (n*(n-1))/2;
        }
        return pair;
    }
}