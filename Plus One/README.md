# Approach - 

Here for our given number, we have to add 1 with that number and return the resultant number in an array format. Example,

[1,2,3] ==> 123 ==> 123 + 1 = 124 ==> [1,2,4], it is the flow according to the question
The only edge case for this question is,

When all the digits are 9, then after adding 1, the resultant number has 1 more digit or the count of digit increases. Example,
[9,9] ==> 99 ==> 99+1 ==> 100 ==> [1,0,0]
This code will handle all the test cases.

**Time Complexity: O(n)**

**Space Complexity: O(n)**