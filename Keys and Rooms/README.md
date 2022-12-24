# Intuition
Since this problem is all about checking if we can traverse all the rooms, which can be considered as nodes, so we can be sure that we can either solve it by DFS or BFS.

# Approach
We will apply a DFS algorithm to check if we can traverse all the nodes/rooms starting from the first one. The procedure is - 
1. Make a new method to calculate the DFS traversal.
2. Pass the current index of the rooms array (outer list), the list "rooms", and a newly created boolean array isVisited.
3. isVisited is used to mark the nodes/rooms, we have visited.
4. Base case of this recursive function will be if we have aready visited that node/room, then return.
5. Otherwise mark it as visited, and for the sub-indices under that particular current index (namely the inner list), we will be performing the same DFS operations now.
6. This way we will cover all the nodes, that can starting only from the first node.

# Complexity
- Time complexity: $$O(n.m)$$, where n = length of outer list rooms, and m = average length of inner list of rooms

- Space complexity: $$O(n)$$, where n = length of list rooms
