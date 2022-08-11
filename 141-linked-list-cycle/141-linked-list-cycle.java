/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        // 리스트의 개수를 구하자
       // 시간 초과로 작동하지 않음
//         int count=0;
//         while(true) {
//             if(head.next==null) break;
//             head=head.next;
//             count++;
//         }
//         int pos = head.val;
        
//         if(pos==-1 ||pos>count){
//             return false;
//         }
//         return true;
        
        // fast 포인터와 slow 포인터를 사용하자
        // fast 포인터는 두 칸씩 움직이고 slow 포인터는 한 칸씩 움직인다.
        // 링크드 리스트에 사이클이 형성되면 두 개의 포인터는 언젠가 만날 수밖에 없다. 
        
//         ListNode fast = head;
//         ListNode slow = head;
        
//         while(fast!=null && fast.next!=null) {
//             slow=slow.next;
//             fast=fast.next.next;
//             if(slow==fast) return true;
//         }
        
        
//         return false;
        
        if (head==null || head.next==null) {
            return false;
        }
        
        ListNode a = head;
        ListNode b = head.next;
        while(a!=b) {
            if(b==null || b.next == null) return false;
            a=a.next;
            b=b.next.next;
        }
        return true;
    }
}