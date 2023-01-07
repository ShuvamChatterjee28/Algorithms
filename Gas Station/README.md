# 1. Brute Force:-

In the Brute-Force approach, we will check from which index we can start the traversal, and then from that point, we will start our inner loop.
Ex - gas = [1,2,3,4,5], cost = [3,4,5,1,2]
index = 0 ==> gas[0] < cost[0], hence we can's start traversing from here.

Inside the inner loop, We will traverse the entire loop again to check if we can complete the circuit or not. If completed, then return the index, and if not, then return -1.

**Time Complexity: O(n^2)**

**Space Complexity: O(1)**

# 2. Optimized Version:-

In this optimized version, we are dealing with one very important parameter, which is total. It is the heart of the this program. This variable will tell us, after doing 1-pass of the array, if we can complete the circuit or not. Let us see how.

If we can complete the circuit, then summation of (gas[i] - cost[i]) will always be >= 0. We will check it with an example below -

Ex - gas = [1,2,3,4,5], cost = [3,4,5,1,2]

0th index -> 1 - 3 = -2 ==> total = -2
1st index -> 2 - 4 = -2 ==> total = -4
2nd index -> 3 - 5 = -2 ==> total = -6
3rd index -> 4 - 1 = 3 ==> total = -3
4th index -> 5 - 2 = 3 ==> total = 0

I will request you to try this with your own example, and everytime it will return correctly.

**Time Complexity: O(n)**

**Space Complexity: O(1)**

Well, it is a little easier to come up with the brute-force approach in an actual interview, as optimal approach is easier with given hints only. This opinion may differ person to person.

Happy coding :)