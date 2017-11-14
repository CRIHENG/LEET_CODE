/**
 * Created by githu on 2017/10/30.
 */
public class ReverseInteger {
    
    /*
    * 
    * Example1: x = 123, return 321
       Example2: x = -123, return -321
    * */
    public static int reverse(int x) {
       long  sum =0;
        while (x!=0){
            sum = sum * 10 + x % 10;
            x=x/10;
        }
        try {
            sum=Integer.parseInt(sum+"");
        }catch (NumberFormatException e){
            sum=0;
        }
        
        return  (int)sum;
    }
}
