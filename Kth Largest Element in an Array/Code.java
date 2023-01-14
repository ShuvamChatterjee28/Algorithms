# Brute - 

class Solution {
    public int findKthLargest(int[] nums, int k) {
        int len = nums.length;
        Arrays.sort(nums);
        return nums[len-k];
    }
}

# Optimized - 

class Solution {
    public void swap(int[] nums, int a, int b){
        int temp = nums[a];
        nums[a] = nums[b];
        nums[b] = temp;
    }
    
    public int partition(int[] nums, int start, int end, int k){
        int pivot = nums[end], p = start, ans = 0; 
        
        for(int i = start; i < end; i++){
            if(nums[i] <= pivot) { swap(nums, i, p); p++; }
        }
        
        swap(nums, end, p);
        
        if(k < p) { ans = partition(nums, start, p-1, k); }
        else if(k > p) { ans = partition(nums, p+1, end, k); }
        else if(k == p) { return nums[p]; }
        return ans;
    }
    
    public int findKthLargest(int[] nums, int k) {
        return partition(nums, 0, nums.length-1, nums.length-k);
    }
}