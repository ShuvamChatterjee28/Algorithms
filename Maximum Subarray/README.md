# Java || Kadane's Algorithm || Few Interview Questions Answered

I will first post the general Kadane's Algorithm, using which you will be able to pass the particular question. Although mind you that, this one will pass for the all the test cases including the one where all the array elements have negative number. 

Now in the interview there can be subquestions that can be directly asked from this questions, which are also stated below:-

* Length of the max subarray
* Elements of the max subarray
* Start and End index of max subarray
I will give the solutions for all of them, but let us approach it one by one. To solve all three question, you just need to know the starting and ending index of the subarray. That is our main target.
```
class Solution {
    
    public void print(int i){
        System.out.println(i);
    }
    
    public int maxSubArray(int[] nums) {
        int currSum = 0;
        int len = nums.length;
        int maxSum = Integer.MIN_VALUE;
        int startIdx = -1;
        int endIdx = -1;
        int start = 0;
        
        for(int i = 0; i < len; i++){
            currSum += nums[i];
            
            if(currSum > maxSum) {
                maxSum = currSum;
                endIdx = i;
                start = startIdx;
            }
            
            if(currSum < 0) {
                currSum = 0;
                startIdx = i+1;
            }
        }
        
        // Start Index
        print(start);
        
        // End Index
        print(endIdx);
        
        // Len of subarray
        print(endIdx - start + 1);
        
        // Element of subarray
        for(int i = start; i <= endIdx; i++){
            print(nums[i]);
        }
        
        return maxSum;
    }
} 
```
Run this code and you will get proper answer, but why it is working? It is working because when the last time currSum will be > maxSum will be the time when we will get our final maxSum. Hence we just need to take the index number where final time maxSum is calculated. We get our final Index.

For the first/starting index, we will capture it from when the currSum == 0. So, when currSum becomes negative then we will make it as 0, and take the next index as our starting index, and save it in another variable, because even after finding the maximum sub array, there we can have new currSum, which may lead to < 0. For example,
[-2,1,-3,4,-1,2,1,-7,4]

I hope this way it makes sense. Thank you.