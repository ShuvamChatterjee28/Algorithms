class Solution {
    int[] count;
    public List<Integer> countSmaller(int[] nums) {
        count = new int[nums.length];
        List<Integer> ans = new ArrayList<>();
        int[] indexes = new int[nums.length];
        for(int i = 0; i < nums.length; i++){
            indexes[i] = i;
        }
        mergeList(nums, indexes, 0, nums.length-1);
        for(int i = 0; i < count.length; i++){
            ans.add(count[i]);
        }
        return ans;
    }

    public void mergeList(int[] nums, int[] indexes, int start, int end){
        if(end <= start) { return; }
        int mid = start + (end-start)/2;

        mergeList(nums, indexes, start, mid);
        mergeList(nums, indexes, mid+1, end);

        merge(nums, indexes, start, end);
    }

    public void merge(int[] nums, int[] indexes, int start, int end){
        int mid = start + (end-start)/2;
        int left_index = start, right_index = mid+1, rightcount = 0, sidx = 0;
        int[] sorted_index = new int[end-start+1];

        while(left_index <= mid && right_index <= end){
            if(nums[indexes[right_index]] < nums[indexes[left_index]]){
                sorted_index[sidx] = indexes[right_index];
                rightcount++;
                right_index++;
            }
            else{
                sorted_index[sidx] = indexes[left_index];
                count[indexes[left_index]] += rightcount;
                left_index++;
            }
            sidx++;
        }
        while(left_index <= mid){
            sorted_index[sidx] = indexes[left_index];
            count[indexes[left_index]] += rightcount;
            sidx++;
            left_index++;
        }
        while(right_index <= end){
            sorted_index[sidx++] = indexes[right_index++];
        }
        for(int i = start; i <= end; i++){
            indexes[i] = sorted_index[i-start];
        }
    }
}