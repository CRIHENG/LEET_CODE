package LinkList;

/**
 * <p>
 * You are given two non-empty linked lists representing two non-negative integers.
 * The digits are stored in reverse order and each of their nodes contain a single
 * digit.Add the two numbers and return it as a linked list.
 * <p/>
 */

public  class AddTwoNumbers {
    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        ListNode current01=null;
        ListNode current02=null;
        ListNode newHead=null;
        ListNode current=null;
        int tensDigits =0;
        while (l1 != null && l2 != null) {
            int singleDigits;
            if(l1.val+l2.val+tensDigits>=10){
                singleDigits=(l1.val + l2.val+tensDigits) - 1_0;
                tensDigits=1;
            }else {
                singleDigits=l1.val + l2.val+tensDigits;
            }
            if(newHead==null){
                newHead=new ListNode(singleDigits);
                current=newHead;
            }else {
                newHead.next=new ListNode(singleDigits);
                newHead=newHead.next;
            }
            if(tensDigits>0){
                tensDigits=0;
            }
            l1=l1.next;
            l2=l2.next;
            current01=l1;
            current02=l2;
        }
        if(current01!=null){
            geti(current01,newHead);
        }
        if(current02!=null){
            geti(current02,newHead);
        }
        
        return current;
    }
          public  static  ListNode  geti(ListNode s,ListNode newhead){
              while (s!=null){
                  newhead.next=new ListNode(s.val);
                  newhead=newhead.next;
                  s=s.next;
              }
              return newhead;
          }

}
