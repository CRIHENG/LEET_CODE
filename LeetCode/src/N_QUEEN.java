import org.junit.Test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class N_QUEEN {
    public List<List<String>> solveNQueens(int n) {
        if (n < 3) return null;
        int[][] chessboard = new int[n][n];
        Map<Integer,Integer> x=new HashMap<>();
        Map<Integer,Integer> y=new HashMap<>();
        return null;
    }
    
    public int[][] method(int col ,int n){

        int[][] chessboard = new int[n][n];
        Map<Integer,Integer> x=new HashMap<>();
        Map<Integer,Integer> y=new HashMap<>();
        for (int i = 0, j = 0; i < n; ) {
            if(x.get(i)!=1||x.get(y)!=1){
                chessboard[i][j] = 1;
                x.put(i,1);
                y.put(j,1);
            }
            i++;
            if (j + 2 < n) {
                j = j + 2;
            } else {
                j = j + 2 - n;
            }

        }
        return  chessboard;
        
    }

    @Test
    public void test() {


        solveNQueens(4);


    }
}