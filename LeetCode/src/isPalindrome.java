/**
 * Created by githu on 2017/10/30.
 */
public class isPalindrome {
    public static  boolean palindrome(int x) {
        int   exlment=x;
        long  sum =0;
        while (x!=0){
            sum = sum * 10 + x % 10;
            x=x/10;
        }
        
        try {
            Integer.parseInt(sum+"");
        }catch (NumberFormatException e){
            return false;
        }
            if(exlment==sum){
                return true;
            }else{
                return false;
            }

        

    }
}
