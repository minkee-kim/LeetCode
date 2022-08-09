/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode reverseList(ListNode head) {
    if(head==null) {
                return head;
            }
            ListNode prev = null ;
            ListNode present = head;
            ListNode next = null;
            while (present!=null) {
                // 기존의 포인터 연결이 끊어지기 때문에 next에 현재 헤드의 다음 값을 저장
                next =present.next;
                // 포인터 역순
                present.next = prev;
                // prev에 현재 값을 대입
                prev = present;
                // present는 다음 노드로
                present=next;
            }
            return prev;
    }
}