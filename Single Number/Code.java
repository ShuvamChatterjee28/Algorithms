class Solution {
    public int singleNumber(int[] nums) {
        int len = nums.length, ans = 0;
        for(int i = 0; i < len; i++) ans = ans ^ nums[i];
        return ans;
    }
}