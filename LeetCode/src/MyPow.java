/**
 * Created by githu on 2017/11/1.
 */
public class MyPow {
//时间太长
    public  static  double myPow(double x, int n) {
         int i;
        double cnum=x;
        double n_=n;
        if(n<0){
            n=n*-1;
        }else if(n==0){
            return  1;
        }
        for(i=0;i<n-1;i++){
            x*=cnum;
        }
        if(x<1){
            
        }
        if(n_<0){
            x=1/x;
        }
      return x;
    }
    //递归
     
   //在使用递归的时候递归太深 可以用分治的思想   这样从而减少次数 解决堆栈溢出的问题
    //在实现平方的时候 
    public static double count(double x,int n){//2,2
        switch (n){
            case 0:
                return 1;
            case 1:
                return x;
        }
        double c=count(x,n/2);
        if(n%2==0){
            return  c*c;
        }else {
            return c*c*x;
        }
      
    }
}
