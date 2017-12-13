package LinkList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Merge two sorted linked lists and return it as a new list.
 * The new list should be made by splicing together the nodes of the first two lists.
 */
public class MergeTwoSortedLists {
    public ListNode mergeTwoLists01(ListNode l1, ListNode l2) {

        List<Integer> list = new ArrayList<>();
        ListNode current = null;
        ListNode newHead=null;
        while (l1 != null || l2 != null) {
            if (l1 != null) {
                list.add(l1.val);
                l1 = l1.next;
            }
            if (l2 != null) {
                list.add(l2.val);
                l2 = l2.next;
            }
          
            
        }
        Collections.sort(list);
        for (int i = 0; i < list.size(); i++) {
            if(current==null){
                current=new ListNode(list.get(i));
                newHead=current;
            }else {
                current.next=new ListNode(list.get(i));
                current=current.next;
            }
            
        }
        return newHead;
    }
    public ListNode mergeTwoLists02(ListNode l1, ListNode l2) {
        
        if(l1==null) return  l2;
        if(l2==null) return  l1;
        ListNode current=null;
        ListNode head=null;
        while (l1!=null||l2!=null){
            if(l1.val>=l2.val){
                current=l2;
                current.next=l1;
            }else {
                current=l1;
                current.next=l2;
                
            }
            if(head==null){
                head=current;
            }
            current=current.next;
            if(l1.next!=null){
                l1=l1.next; 
            }
           if(l2.next!=null){
               l2=l2.next; 
           }
           
        }
        
        return head;
      
    }
}