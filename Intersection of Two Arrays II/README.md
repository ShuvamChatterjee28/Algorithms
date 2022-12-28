# Approach
<!-- Describe your approach to solving the problem. -->
The brute force one is the one, which comes to mind first, so let's discuss it, and then jump to the better version. 
**Note:- Somehow I feel that the optimized one is easier to come up with. My mind is working complicatedly. :)**
## Brute - 
Here what we can do is that,
1. Since, we have to keep track of what are the common numbers between the arrays, and there can be duplicacy, so we need a DS, where we can store the count or freq.
2. HashMap is the perfect for that. The logic is being, we will iterate the **first** array, and store all its elements to the map. Inside the map, we will store it's index as **Key**, and `[nums1[i], freq]` as **Value**. Initially all `freq`s will be set as 0.
3. Once the map is ready, then iterate the **second** array to check the matched values, and mark the `freq` as 1.
4. See, now we have all the intersected elements with freq as 1.
5. Now its simple, just iterate over the map, and find the values with freq as 1. Add it up in an array. We're done.
## Optimized - 
1. Again use a hashmap to directly store the **nums1 array elements** as **Key** and freq as **Value**.
2. Once you found one duplicate, you need to increase the count of the freq to 1.
3. Then iterate over the nums2 array, and if the element is found in map, then add it to our resultant array & decrease the count as it is used.
4. After the iteration, you must have the final array with you, just return it.

# Complexity (For optimized one)
- Time complexity: O(m+n), where m = length of first array & n = length of second array
<!-- Add your time complexity here, e.g. $$O(n)$$ -->

- Space complexity: O(m)
<!-- Add your space complexity here, e.g. $$O(n)$$ -->

If you want to connect, then follow me on [twitter](https://twitter.com/debprakashc).