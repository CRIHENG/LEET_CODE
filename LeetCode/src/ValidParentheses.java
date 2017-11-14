import java.util.Stack;

/**
 * Created by githu on 2017/10/31.
 */
public class ValidParentheses {


    public  static  boolean isValid(String s) {

        if (s.length()<=1){
            return false;
        }
        Stack<String> stack=new Stack<>();
        for( int i=0;i<s.length();i++){
            if (stack.isEmpty()){
                switch (s.charAt(i)+""){
                    case "}":
                    case "]":
                    case ")":
                        return false;
                }
            }
          
            switch (s.charAt(i)+"") {
                case "{":
                case "(":
                case "[":
                    stack.push(s.charAt(i)+"");
                    break;
                default:
                    if(!stack.isEmpty()){
                        String match= stack.pop()+s.charAt(i);
                        switch (match){
                            case "{}":
                            case "[]":
                            case "()":
                                break;
                            default:
                                return false;
                        }
                    }
            }
        }
        if(!stack.isEmpty()){
            String a =stack.peek();
            if (stack.peek().equals("{") |stack.peek().equals("[")|stack.peek().equals("(")) return false; 
        }
        return  true;
    }
}
