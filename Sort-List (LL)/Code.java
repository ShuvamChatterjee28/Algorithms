class Solution {
    public ListNode sortList(ListNode head) {
        if(head == null || head.next == null) return head;
        
        ListNode left = head;
        ListNode right = getMid(head);
        ListNode temp = right.next;
        right.next = null;
        right = temp;
        
        left = sortList(left);
        right = sortList(right);
        
        return merge(left, right);
    }
    
    public ListNode getMid(ListNode head){
        ListNode slow = head, fast = head.next;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
    
    public ListNode merge(ListNode left, ListNode right){
        ListNode tail = new ListNode(0);
        ListNode ans = tail;
        while(left != null && right != null){
            if(left.val < right.val){
                tail.next = left;
                left = left.next;
            }
            else{
                tail.next = right;
                right = right.next;
            }
            tail = tail.next;
        }
        if(left!=null) tail.next = left;
        if(right!=null) tail.next = right;
        return ans.next;
    }
}