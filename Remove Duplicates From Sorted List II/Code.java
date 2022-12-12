// Beginner Level Code - 

class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        if(head == null) { return null; }
        
        HashMap<Integer, Integer> map = new HashMap<>();
        ListNode node = head;
        
        // Traversing the LL and making the Map such that we can point duplicates
        while(node != null){
            if(map.containsKey(node.val)) { map.put(node.val, 1); }
            else { map.put(node.val, 0); }
            node = node.next;
        }
        
        HashSet<Integer> finalNodeVals = new HashSet<>();
        for(int i : map.keySet()){
            if(map.get(i) == 0) { finalNodeVals.add(i); }
        }
        
        if(finalNodeVals.size() == 0) { return null; }
        
        ListNode node1 = head, finalHead = head;
        boolean first = true;
        
        while(node1 != null){
            if(finalNodeVals.contains(node1.val) && first == true) { 
                head = node1; finalHead = head; first = false; 
            }
            else if(finalNodeVals.contains(node1.val) && first == false) { 
                head.next = node1; head = head.next;
            }
            node1 = node1.next;
        }
        
        head.next = null;
        
        return finalHead;
    }
}

// -------------------------- //

// Optimised Level Code - 

class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode pre = new ListNode(0);
        pre.next = head;
        ListNode curr = head, ans = pre;
        
        while(curr != null){
            while(curr.next != null && curr.val == curr.next.val){
                curr = curr.next;
            }
            if(pre.next != curr){
                pre.next = curr.next;
            }
            else{
                pre.next = curr; pre = pre.next;
            }
            curr = curr.next;
        }
        
        return ans.next;
    }
}