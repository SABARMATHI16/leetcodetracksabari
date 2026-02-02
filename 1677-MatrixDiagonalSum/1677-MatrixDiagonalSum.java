// Last updated: 2/2/2026, 2:28:40 PM
class Solution {
    public int diagonalSum(int[][] mat) {
        int sum=0;
        int i=0,j=0;
        int m=mat.length;
        for(int x=1;x<=m;x++){
            sum+=mat[i][j];
            i++;
            j++;
        }
        i=0;j=m-1;
         for(int x=1;x<=m;x++){
           if(i!=j) sum+=mat[i][j];
            i++;
            j--;
        }
        return sum;
    }
}