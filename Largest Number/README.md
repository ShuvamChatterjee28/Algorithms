# Intuition
<!-- Describe your first thoughts on how to solve this problem. -->
Our main focus is to somehow compare two integers and then take the greater one. For example - 
```
[10, 2]

10 + 2 = 102
2 + 10 = 210

```
compare 102 & 210, which one is greater, just take that one. In this case it is 210. Hence our ans is also 210.

# Approach
<!-- Describe your approach to solving the problem. -->
Since adding two very large numbers can result in overflow, hence we will fist convert the integers to string, as string comparison will work exactly like integers. So, 
1. First convert all the integers to strings, and store them in a seperate array.
2. Define one comparator to compare the concatenated strings, and return the greater. Now in Java, we can use the Comparator interfaces, but in python, and cpp, you have another interface or class, that you can use. Example can be seen above. we are gonna need this comparator while we will sort the array.
3. This step, we will sort the newly created string array using our comparator. Since our comparator is programmed such a way that it will take the greater one only, hence the sorting will go in reversed manner.
4. Lastly, use a StringBuilder (in java) to build a new string from the sorted array. Iterate over it and make a new string by combing all the strings, and return it.

**Note 1:- If the integer/input array is empty, then return a empty string.**
**Note 2:- If we only have couple of zeros (0) in the input string, then only output "0".** 

**TC** - (Sorting will take `O(nlogn)` * On an average each string length `k`, so comparing those from an array will be `O(k)`) + Building the string `O(n)` = `O(knlogn)`

# Complexity
- Time complexity: $$O(knlogn)$$

- Space complexity: $$O(n)$$
