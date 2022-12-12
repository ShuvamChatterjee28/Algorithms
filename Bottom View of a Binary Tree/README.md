Steps:-

1. Do a in-order traversal to traverse through each node.

2. While traversing, store the current node's Horizontal distance, and the node's metadata such as the value and height in a Map named TreeMap.

**TreeMap is nothing but a Red-Black Tree**

3. Now inside this TreeMap, the key will be the horizontal distance of the current or i'th node and the value will be a tuple (x, y), where x is the value of the node and y is the height of the node.

4. For each node:
 a. Add the node to the newly created map if this is the first node, which have the current horizontal distance.
 b. Else, if a tuple is already present in the map for the particular horizontal distance, then replace the current node with the already existing one, if and only if the height of the current node is greater than or equal to the already existing node's height.