# Approach - 

In the discussion section, you can find my optimized solution, but I am trying to give you a solution, which is created from the brute-force level.

1. Brute-Force:-
One easiest way to solve this question is to sort the array, as mentioned in the question. Since you do not have to return the kth distinct element, hence you can then return the (length af array - k)th element, which is our answer.

Example -

`Arr = [1,2,3,4,5,6], len = 6, k = 2 ==> nums[len - k] = nums[6 - 2] = nums[4] = 5 (ans)`

**Time Complexity: O(n * logn)**

**Space Complexity: O(1)**

2. Optimized:-

Here is the algorithm in my words -

* Quick Select - (More like Quick Sort)
In the quick select, we will partition the array into parts, and from that we will retrieve our answer.

1. Take a pivot element (generally taken the last element of the array)
2. Point a pointer to the first element of the array
3. Next, start iteration of the array, and when you encounter an element, which is less than or equal to then pivot, then immediately swap the element at the pointer, and that current selected element in the array. Increase the pointer.
4. If the current element is greater than the pivot, then leave it as it it.
5. At last, swap the current pointer with pivot.
6. If you find out the kth position in the first partition in the array, then apply the same quick select there.
7. Else if you find that kth position in the second partition in the array, then apply that in the second part.

**Time Complexity:- O(n) --> (In average Case) & O(n^2) --> (In the worst Case)**

**Space Complexity:- O(1) --> (In average Case) & O(n) --> (In the worst Case)**

Happy Coding :)