import LinkList.AddTwoNumbers;
import LinkList.ListNode;
import LinkList.MergeTwoSortedLists;
import LinkList.ReverseLinkedList;
import org.junit.Test;

import java.util.Stack;

/**
 * Created by githu on 2017/10/26.
 */
public class TestLeetCodeCase {


    @Test
    public void testTwoSumJunit() {
        int[] twoSumArray = new int[]{1, 2, 3, 4, 5, 6, 7, 8};
        String result = "[";
        for (int elements : TwoSum.twoSum(twoSumArray, 9)) {

            result += " " + elements + "";
        }
        result += "]";
        System.out.println(result);
    }


    @Test
    public void testReverseInteger() {
        int testData = 1534236469;
        System.out.println(ReverseInteger.reverse(testData));

    }

    @Test
    public void testisPalindrome() {
        int testData = -2147447412;
        System.out.println(isPalindrome.palindrome(testData));

    }

    @Test
    public void testRomanToInteger() {

        String s = "MCMXCVI";
        System.out.println(RomanToInteger.romanToInt(s));


    }

    @Test
    public void testLongestCommonPrefix() {
        String[] s = new String[]{"aa", "aa"};
        System.out.println(LongestCommonPrefix.longestCommonPrefix(s));


    }

    @Test
    public void testStack() {
        System.out.println(ValidParentheses.isValid("()}"));

    }

    @Test
    public void testPow() {
        System.out.println(MyPow.count(1.00001, 123456));

    }

    @Test
    public void testCalculate() {
        String s = "1+1";
        Stack<String> c = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            int a = 0;
            int o = 0;
            if (!(s.charAt(i) + "" == "+")) {
                if (!c.isEmpty()) {
                    if (c.peek().equals("+")) {
                        o = 1;
                    }
                } else {
                    if (o == 1) {
                        int b = a + (s.charAt(i) - '0');
                        o = 0;
                    }
                    a = s.charAt(i) + '0';
                }
            } else {
                c.push(s.charAt(i) + "");
            }

        }
    }


    @Test
    public void reverseLinkedList() {

        ListNode head = new ListNode(1);
        final ListNode second = new ListNode(2);
        ListNode third = new ListNode(3);

        head.next = second;
        second.next = third;

        head = ReverseLinkedList.reverseList(head);

        while (head != null) {
            System.out.println(head.val);
            head = head.next;
        }


    }

    @Test
    public void addTwoNumbers() {
        ListNode node01 = new ListNode(8);
        ListNode node02 = new ListNode(9);
        ListNode node03 = new ListNode(9);
        ListNode node04 = new ListNode(2);
        /*ListNode node05 = new ListNode(9);*/
        /*ListNode node06 = new ListNode(7);
        ListNode node07 = new ListNode(7);*/
        node01.next =node02;
        node02.next=node03;
     /*   node04.next=node05;*/
       // node05.next=node06;
       // node06.next=node07;
        AddTwoNumbers addTs = new AddTwoNumbers();

       ListNode X= addTs.addTwoNumbers(node01, node04);
        while (X!=null){
            System.out.print(X.val+" -> ");
            X=X.next;
        }


    }

    @Test
    public void houseRobber() {

        int[] data = new int[]{2, 1, 1, 2, 5};

        System.out.println(HouseRobber.rob(data));

    }
    @Test
    public  void testooo(){
        MergeTwoSortedLists mergeTwoSortedLists=new MergeTwoSortedLists();
        ListNode node01 = new ListNode(8);
        ListNode node02 = new ListNode(9);
        ListNode node03 = new ListNode(9);
        ListNode node04 = new ListNode(2);
        node01.next =node02;
        node02.next=node03;
       ListNode a = mergeTwoSortedLists.mergeTwoLists02(node01,node04);
        while (a!=null){
            System.out.println(a.val);
            a=a.next;
        }
        
    }
}

