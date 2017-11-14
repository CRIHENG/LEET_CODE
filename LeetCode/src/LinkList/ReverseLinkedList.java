package LinkList;

import java.util.Stack;

/**
 * Created by githu on 2017/11/10.
 */
public class ReverseLinkedList {
    public static ListNode reverseList(ListNode head) {
        if (head == null) {
            return head;
        }
        ListNode b = head.next;
        ListNode a = head;
        while (b != null) {
            a.next = b.next;
            b.next = head;
            head = b;
            b = a.next;
            
        }
        return head;
    }

    public ListNode reverseListII(ListNode head) {

        if (head == null){
            return null;
        }

        ListNode newHead = new ListNode(head.val);

        // init
//        newHead.next = null;
        while (head.next != null){
            ListNode temp = newHead;

            // 直接重新构建，避免 对象互相影响。
            int next = head.next.val;
            newHead = new ListNode(next);
            newHead.next = temp;

            // 下一个
            head = head.next;
        }
        return newHead;
    }

    public ListNode reverseListI(ListNode head){
        // 用 栈 。。。
        Stack<ListNode> stack = new Stack<>();
        while (head != null){
            stack.push(head);
            head = head.next;
        }
        // init
        ListNode newHead = stack.pop();
        ListNode tempNode = newHead;
        while (!stack.isEmpty()){

            ListNode temp = stack.pop();
            tempNode.next = temp;
            tempNode = tempNode.next;
            tempNode.next = null;
        }
        return newHead;

    }

}
