# Approach (We need to calc the slope of the line/(s) to get the ans) - 
1. It does this by iterating through every combination of two points (i and j) in the input array of points and then checks every other point (k) to see if it is collinear with i and j.

2. To determine if three points are collinear, the code calculates the slope between point i and point j, and then compares it to the slope between point i and point k. If the slopes are equal, then the three points are collinear.

3. The slope between two points (x1, y1) and (x2, y2) is calculated as (y2 - y1) / (x2 - x1).Let suppose we have three points (x1, y1),(x2, y2) and (x3, y3) and compare the two slopes then expression is written in this formet(y2 - y1) * (x3 - x1) = (y3 - y1) * (x2 - x1) similarly In this code, this calculation is broken down into two separate parts: (points[j][1] - points[i][1]) * (points[k][0] - points[i][0]) and (points[k][1] - points[i][1]) * (points[j][0] - points[i][0]). The reason for this is to avoid a division by zero error in cases where the two points have the same x-coordinate.

4. If the code determines that three points i, j, and k are collinear, it increments a temporary count variable temp. After checking every point k, the code compares temp to the current maximum number of collinear points found so far, ans, and updates ans if temp is larger.

5. Finally, the code returns the maximum number of collinear points, ans.

**Time Complexity: O(n^3)**

**Space Complexity: O(1)**