Now we can not use the + operator, which means it is obvious that we have to use some sort of bit manupulation. But the real question is how?
The ans lies within the procedure of the addition, which I am going to show you below.

from binary level, how do we exactly add two numbers, let us see -->

         _
a = 2 = 010
b = 3 = 011
------------
c = 5 = 101
In the position, where we have a dash above, there we are generating a carry, which will be carried over to the next bit, and added to that next bit. So, the addition pattern goes like -

  0         0         1         1
+ 0        +1       + 0       + 1
----      ----      ----      ----
  0         1         1         0 (with a carry 1)
Is this pattern similar to you? Have you seen this in the XOR table? Let's see the XOR table quickly -

a b | XOR
- - | - -
0 0 | 0
0 1 | 1
1 0 | 1
1 1 | 0
These are the exact same, hence for addition, we need to use the XOR operator. But what to do with the carry? Hey, we need to add that carry to the next bit, right? That is what we have seen in the implementation of the addition as well. We will do that only, but we can NOT use addition anyway.
But, before that, let's do the XOR for 2 and 3 example.

-- Doing only XOR --
a = 2 = 010
b = 3 = 011
------------
c = 1 = 001
1 is NOT our answer, and in this procedure, we have left the carry out, which is 100. Now what's the pattern for finding the carry? It is after we AND the two numbers, we will LEFT-SHIFT the result by 1. Didn't get it?

-- Doing only AND --
a = 2 = 010
b = 3 = 011
------------
c = 2 = 010
-----------
Doing Left-Shift by 1 (<<1)
-----------
c = 4 = 100
So, we found out the carry as well, and believe me or not, but it is the entire Algorithm. You have to repeat the steps of 1. XOR and 2. AND with Left-Shift, until the step no 2. becomes 0, and you will have your answer.

Example -

a = 2 = 010
b = 3 = 011
-----------
x = 1 = 001 = a
c = 4 = 100 = b
-----------
x = 5 = 101
c = 0 = 000

x = XOR & c = AND with Left-Shift
Since carry becomes 0, hence our answer is the XOR result = 5.

Time Complexity: O(1)
Space Complexity: O(1)

Time is O(1), because the max and min bounds are 1000 and -1000 respectively, which means the input will NOT be arbitrarily large, and it will be in the limits, hence the time will be constant.

The code for c and c++ will be very similar, and python will be a little different. If you like this approach, then please give me a thumbs up.

Thanks & Happy Coding :)