# Neat approach with Swaps

I have read few solutions, and personally I find them pretty complex. So, here is the one with a lot less complexity.

What we are doing is simple, using the two pointer approach, we are taking two characters (from front and rear) from the array. Then swaping their positions in the array itself using another helper function named swap. Keep in mind that, you have to stop the iteration when you reach the half way of the array, or while the start index is less than end index.

Example -
```
s = ['h', 'e', 'l', 'l', 'o']

start = 0, end = 4
swap(s, 0, 4)
s = ['o', 'e', 'l', 'l', 'h']

start = 1, end = 3
swap(s, 1, 3)
s = ['o', 'l', 'l', 'e', 'h']

start = 2, end = '2'
Loop end, and our array is reversed
```

Time Complexity: O(n)

Space Complexity: O(1)