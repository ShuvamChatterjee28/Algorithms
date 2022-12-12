1. Beginner Level -

In this approach, we are using an auxliary space (HashMap and HashSet) to point out duplicates and in the HashSet we are not considering those duplicates.

I can certainly tell that it is a very lengthy approach, but in an Interview, it is bit easy to come up with, if you have a good knowledge of HashMap & HashSet.


Time Complexity = O(n)
Space Complexity = O(n)

2. Optimised Level :-

Below is the algorithm for the problem -

Make three nodes pre, 'ans' & curr.
pre will be the previous node to the current node and curr will be the current node. 'ans' will point to pre at first, and will stay there.
While duplicates found in current node(curr), then move on to the next node.
If we move on, then the curr will NOT certainly be the next node to the pre node.
At this point of time pre's next pointer will point to curr's next pointer. This way we are linking the non-duplicate nodes togher.
Else the pre's next pointer will point to curr. Also pre will move on by 1 node like curr.
Move forward the curr.
After traversing the entire list as curr, just return the next pointed node of ans, which is our answer.
Please practise it to get a better point of view.


Time Complexity: O(n)
Space Complexity: O(1)

