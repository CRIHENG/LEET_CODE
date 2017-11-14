/**
 * Created by githu on 2017/10/30.
 */
public class RomanToInteger {

    public static int romanToInt(String s) {
        int sum=0;
       
        for(int i=0;i<s.length();i++){
            
          sum+=  getNum(s.charAt(i)+"");
            
        }
        return  sum;
    }
    
    private static    int getNum(String s){
        int sum;
        switch (s){
            case "I":
                sum=1;
                break;
            case "V":
                sum=5;
                break;
            case "X":
                sum=10;
                break;
            case "L":
                sum=50;
                break;
            case "C":
                sum=100;
                break;
            case "D":
                sum=500;
                break;
            case "M":
                sum=1000;
                break;
            default:
                sum=0;
                break;
        
        }
        return  sum;
    }
    
}
