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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        // List1과 List2이 null이면 합쳐도 null
        if(list1 == null && list2 == null) return null;
        // 둘 중 하나가 null이면 그 하나를 출력
        if(list1 == null && list2 != null) return list2;
        if(list1 != null && list2 == null) return list1;
        
        // 합치고 순서를 비교하자
        // 새로운 노드에 넣자
        ListNode merged = new ListNode();
        ListNode tail = merged;
        while(list1 != null && list2 != null) {
            if(list1.val > list2.val) {
                tail.next = list2;
                list2 = list2.next;
            } else {
                tail.next = list1;
                list1= list1.next;
            } 
            tail = tail.next;
        }
        // 둘 중 하나가 null이 될 경우엔 나머지 값을 전부 노드에 집어 넣자
        if(list1 == null) {
            tail.next = list2;
        } else if(list2 == null) tail.next = list1;
        
        
        return merged.next;
    }
}