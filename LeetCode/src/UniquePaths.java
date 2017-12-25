import org.junit.Test;

public class UniquePaths {
/**A robot is located at the top-left corner of a m x n grid (marked 'Start' in the diagram below).

 The robot can only move either down or right at any point in time. The robot is trying to reach t
 
 he bottom-right corner of the grid (marked 'Finish' in the diagram below).

 How many possible unique paths are there?
 * 
 *   解题思路
 *     1  1  1   1          ---- 单行或单列 只有一种方法到达终点 所以都是1 
 *     
 *     1  2  3   4          --   fn(i,j)=f(i,j-1)+f(i-1,j)  
 *     
 *     1  3  6  10 
 *     
 *     1  4 10  20
 * */  

    public int uniquePaths(int m, int n) {
        int[][] A = new int[m][n];

        for (int i = 0; i < m; ++i) {
            A[i][0] = 1;
        }

        for (int i = 1; i < n; ++i) {
            A[0][i] = 1;
        }

        for (int i = 1; i < m; ++i)
            for (int j = 1; j < n; ++j) {
                A[i][j] = A[i][j - 1] + A[i - 1][j];
            }

        return A[m - 1][n - 1];
    }
    
    
    
    @Test
    public void test(){

        System.out.println( uniquePaths(3,4));
        
    }
}