# Approach - 

This problem may not be the best for using linear solution approach. Below is the solution approach -

1. We will use a recursive helper function to calculate the power.

2. Will have to use return type as double because of the result, which can be fractional too.

3. In the helper function, when the number n will become 0, then we will start to return 1.

4. For the odd number, we have to do an extra calculation, hence if the n is odd, then add an extra multiplication.

This is because -
If n = 2, then
a. n = 2
b. n = 1
c. n = 0
whereas n = 3,
a. n = 3
b. n = 1
c. n = 0

The steps counts are the same, but for n = 3, we need to go an extra step. Hence multipling `x` again.

5. The recursive function will be of `O(logn)`, as we will go `n/2`.

6. Lastly check the if the n is negative, then we will invert the value.

Now we have our answer in our hand, and returning it.

**Time Complexity: O(logn)**

**Space Complexity: O(logn), if you consider the stack space, O(1) otherwise**