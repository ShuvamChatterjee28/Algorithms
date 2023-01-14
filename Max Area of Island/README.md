# Approach - 

The point is,

* You have to check which is the node, which has value 1 AND (NOT Visited at the same time).
* Start from that node and check its area.
* Once you found it, then iterate over the 2D array and find the max area among all the values, which is 1 in the graph.
* You have found your answer.

**TC : O(n^2)**

**SC : O(n^2) -- because of the boolean array**

Happy Coding !!!