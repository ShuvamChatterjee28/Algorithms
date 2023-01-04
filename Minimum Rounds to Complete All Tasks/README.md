# Intuition - 

There are few points to note - 

1. If the length of array is 0 or 1, then we can not combine the numbers.
2. We need to get the freq of each individual number, henc using the Hashmap, we will get the freq of each individual number.
3. If anyone's freq is 1, then by deafult we will return -1.
4. Next we need to get multiple of 3, closest to current frequency. Ex - if val (freq) = 7, then ans = 7/3 = 2. We need this to get the minimum rounds possible, since taking a chunk of 3 will make it shorter.
5. Now if the freq is NOT divisible by 3, then we need to add another round, means ans will be increased by 1
6. That's it, return the ans.



# Complexity
- Time complexity: **O(n)**
<!-- Add your time complexity here, e.g. $$O(n)$$ -->

- Space complexity: **O(n)**
<!-- Add your space complexity here, e.g. $$O(n)$$ -->
