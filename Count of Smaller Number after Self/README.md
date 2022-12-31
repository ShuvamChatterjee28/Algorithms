The basic idea is to do merge sort to nums[]. To record the result, we need to keep the index of each number in the original array. So instead of sort the number in nums, we sort the indexes of each number.
Example: nums = [5,2,6,1], indexes = [0,1,2,3]
After sort: indexes = [3,1,0,2]

While doing the merge part, say that we are merging left[] and right[], left[] and right[] are already sorted.

We keep a rightcount to record how many numbers from right[] we have added and keep an array count[] to record the result.

When we move a number from right[] into the new sorted array, we increase rightcount by 1.

When we move a number from left[] into the new sorted array, we increase count[ index of the number ] by rightcount.

Time Complexity: o(nlogn)

Space Complexity: O(n)

* Imp:- If (nums[indexes[right_index]] < nums[indexes[left_index]]) is true, then obviously (nums[indexes[++right_index]] < nums[indexes[left_index]]). For example - 

```
Numbers --> 2, 5, 1, 6
Indexes -->   1, 0, 3, 2

left_index = 0, right_index = 2
```

Here as 2 is < 1, hence 5 < 1 as well. It is a very important point to understand.