# Approach - 

In this solution, I will give you an optimal approach, but in an interview, you may start with a brute-force approach, which will be beneficial. In the brute-force approach, for each index, you need to check the max value, and likewise compare for the each indices, and return the overall max value. It can be simply done using O(n^2).

To understand this solution, we will start with the base case, which is

1. We are taking the widest container (using first and last pointer in the array) as our starting candidate, because of its width. Its water level is the height of the smaller one of first and last boundary.
2. All the other boundaries can be less than / greater than/ equal to these 2 lines.
3. If any of the line between two line is smaller, then we can omit that line after calculating the water capacity (the capacity will be calculated and stored (if necessary) in the max variable).
4. For that reason, we are checking for the smaller line and increasing / decreasing the width based on that.
5. Finally after all the iteration, the max variable will contain the maximum water capacity, hence return it.

The formula for calculating the width water capacity is = `max = max(max, min(height[start], height[end]) * (end - start));`

**Time Complexity: O(n)**

**Space Complexity: O(1)**

Happy Coding :)