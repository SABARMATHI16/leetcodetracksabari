// Last updated: 2/2/2026, 2:28:55 PM
class Solution {
    public int fib(int n) { 
        if(n==1) return 1;
        int a = 0, b = 1, c = 0;
        for (int i = 1; i < n; i++) {
            c = a + b;
            a = b;
            b = c;
        }
        return c;
    }
}