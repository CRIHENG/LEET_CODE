import LinkList.ListNode;
import LinkList.ReverseLinkedList;
import org.junit.Test;

import java.util.Stack;

/**
 * Created by githu on 2017/10/26.
 */
public class TestLeetCodeCase {
    
    
    @Test
            public  void  testTwoSumJunit(){
        int[] twoSumArray=new int[]{1,2,3,4,5,6,7,8};
        String result="[";
       for(int elements:TwoSum.twoSum(twoSumArray,9)) {
           
           result+=" "+elements+"";
       }
        result+="]";
        System.out.println(result);
    }
 
     
    @Test
    public void testReverseInteger(){
    int testData=1534236469;
        System.out.println(ReverseInteger.reverse(testData));
        
    }
    @Test
    public void testisPalindrome(){
        int testData=-2147447412;
        System.out.println( isPalindrome.palindrome(testData));
        
    }
    @Test
    public  void testRomanToInteger(){
        
        String s="MCMXCVI";
        System.out.println( RomanToInteger.romanToInt(s));
        
        
    }
    @Test
    public  void testLongestCommonPrefix(){
        String[] s=new String[]{"aa","aa"};
        System.out.println(LongestCommonPrefix.longestCommonPrefix(s));
        
        
        
        
    }
    
    @Test
    public  void testStack(){
        System.out.println( ValidParentheses.isValid("()}"));
        
    }
    @Test
    public void testPow(){
        System.out.println(MyPow.count(1.00001,123456));
      
    }
    @Test
    public void   testCalculate() {
        String s="1+1";
        Stack<String> c=new Stack<>();
     for (int i=0;i<s.length();i++){
         int a=0; int o=0;
         if(!(s.charAt(i)+""=="+")){
             if(!c.isEmpty()){
                 if(c.peek().equals("+")){
                     o=1;
                 }
             }else {
                 if(o==1){
                    int b= a+(s.charAt(i)-'0');
                     o=0;
                 }
                 a = s.charAt(i) + '0';
             }
         }else {
             c.push(s.charAt(i)+"");
         }
        
     }
    }
            
    
    @Test 
    public void reverseLinkedList(){

        ListNode head = new ListNode(1);
        ListNode second = new ListNode(2);
        ListNode third = new ListNode(3);
        head.next = second;
        second.next = third;

        head = ReverseLinkedList.reverseList(head);

        while (head != null){
            System.out.println(head.val);
            head = head.next;
        }



    }
}

