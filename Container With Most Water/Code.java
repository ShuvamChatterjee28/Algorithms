class Solution {
    public int maxArea(int[] height) {
        int len = height.length, start = 0, end = len-1, max = Integer.MIN_VALUE;
        
        while(start < end){
            max = Math.max(max, Math.min(height[start], height[end]) * (end - start));
            if(height[start] < height[end]){
                start++;
            }
            else{
                end--;
            }
        }
        
        return max;
    }
}