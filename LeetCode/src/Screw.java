import org.junit.Test;

public class Screw {

    public int[][] screwPNG(int n) {
        int[][] x = new int[n][n];
        int col = 0;
        int row = 0;
        int value = 1;
        x[row][col] = value;
        //1 right
        //2 down
        //3 left
        //4 up
        int direction = 1;
        for (int i = 0; i < n * n; i++) {
            x[row][col] = value;

            switch (direction) {
                case 1:
                    if((col==n-1)||(x[row][col+1]!=0)) direction=2;
                    break;
                case 2:
                    if((row==n-1)||(x[row+1][col]!=0)) direction=3;
                    break;
                case 3:
                    if((col==0)||(x[row][col-1]!=0)) direction=4;
                    break;
                case 4:
                    if(x[row-1][col]!=0) direction=1;
                    break;
            }
            switch (direction) {
                case 1:
                    col++;
                    break;
                case 2:
                    row++;
                    break;
                case 3:
                    col--;
                    break;
                case 4:
                    row--;
                    break;
                default:
                    System.out.print("出错啦");
            }
            value++;
        }
        return x;

    }
    @Test
    public void test01(){
      int[][] result= screwPNG(5);
        for(int i=0;i<result.length;i++){
            for(int j=0;j<result[i].length;j++){
                System.out.println(result[i][j]);
              
                }
                
            }
            
        }
        
        
    @Test
    public  void test02(){
        
        
        
        
    }
    


}