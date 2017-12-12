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
                if(tensDigits>0){
                    tensDigits=0;
                }
            }
            if(newHead==null){
                newHead=new ListNode(singleDigits);
                current=newHead;
            }else {
                newHead.next=new ListNode(singleDigits);
                newHead=newHead.next;
            }
            l1=l1.next;
            l2=l2.next;
            current01=l1;
            current02=l2;
        }
        if(current01!=null){
           tensDigits=  geti(current01,newHead,tensDigits);
        }
        if(current02!=null){
            tensDigits= geti(current02,newHead,tensDigits);
        }
        if(tensDigits>0){
            while (newHead.next!=null){
                newHead=newHead.next;
            }
             newHead.next=new ListNode(tensDigits);
        }
        return current;
    }
          public  static  int  geti(ListNode s,ListNode newhead,int tensDigits){
              int val;
              while (s!=null){
                  
                  if(tensDigits>0){
                     val=s.val+tensDigits;
                      tensDigits=0;
                  }else {
                      val=s.val;
                  }
                  if(val>=10){
                      val=0;
                      tensDigits=1;
                  }
                  newhead.next=new ListNode(val);
                  newhead=newhead.next;
                  s=s.next;
              }
              
              return tensDigits;
          }

}
