// Last updated: 2/2/2026, 2:28:56 PM
class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int t = temperatures.length;
        Stack<Integer> s = new Stack();
        int[] ans = new int[t];
        Arrays.fill(ans, 0);
        for (int i = 0; i < t; i++) {
            int x = temperatures[i];
            while (!s.empty() && x > temperatures[s.peek()]) {
               int p=  s.pop();
               ans[p]=i-p;
            }
            s.push(i );
        }
        return ans;
    }
}