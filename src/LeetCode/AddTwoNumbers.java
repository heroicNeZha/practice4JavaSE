package LeetCode;
/**
 * Created by Administrator on 2017/8/5.
 */
public class AddTwoNumbers {
    public class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode head = new ListNode(l1.val+l2.val);
        ListNode temp = head;

        while (l1.next!=null) {
            l1 = l1.next;
            if (l2.next != null) {
                l2 = l2.next;
                temp.next = new ListNode(l2.val + l1.val);
                temp = temp.next;
            } else {
                temp.next = l1;
                temp = temp.next;
            }
        }
        if(l2.next!=null)
            temp.next = l2.next;

        temp = head;
        while(temp.next != null) {
            if (temp.val > 9) {
                temp.next.val += temp.val / 10;
                temp.val = temp.val%10;
            }
            temp = temp.next;
        }

        if(temp.val>9) {
            temp.next = new ListNode(temp.val / 10);
            temp.val = temp.val % 10;
        }
        return head;
    }
}
