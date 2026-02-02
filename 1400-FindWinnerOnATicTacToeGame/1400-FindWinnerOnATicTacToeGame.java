// Last updated: 2/2/2026, 2:28:47 PM
class Solution {
    public String tictactoe(int[][] moves) {
        byte[] row = new byte[3],   
               col = new byte[3];   
        byte diag1 = 0,             
             diag2 = 0;         
        for (byte i = 0; i < moves.length; i++) {
            int rowIndex = moves[i][0],
                colIndex = moves[i][1],
                player = ((i % 2 == 0) ? 1 : -1);
            row[rowIndex] += player;
            col[colIndex] += player;
            if (rowIndex == colIndex) {
                diag1 += player;
            }
            if (rowIndex + colIndex == 2) {
                diag2 += player;
            }
            if (row[rowIndex] == 3 || row[rowIndex] == -3 || 
                col[colIndex] == 3 || col[colIndex] == -3 || 
                diag1 == 3 || diag1 == -3 ||                
                diag2 == 3 || diag2 == -3) {                 
                return (player == 1) ? "A" : "B"; 
            }
        }
        return (moves.length == 9) ? "Draw" : "Pending";
    }
}