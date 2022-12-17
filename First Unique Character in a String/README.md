# Intuition
<!-- Describe your first thoughts on how to solve this problem. -->
Since, we have to check if any character is repeating or not, hence we either need to use **two for loops** in the worst case time complexity, or we can use a linear time approach, with a **hashmap** storing the **char** as **key** and **freq** as **value**.

# Approach
<!-- Describe your approach to solving the problem. -->
I will use the approach of hashmap, since it is working in linear time complexity. I will list down the steps using the bullet points below - 
* If the input string is of size 0 or does not contains any character, then of course return -1.
* Otherwise initialize a hashmap with Character as key and Integer as value, as discussed earlier.
* Traverse through the array and store all the new or non-present characters in the map. Ideally if every element is unique, then we have to add each and every char in the string.
* The logic being, if the character is new, then add it with value 0. If the character is existing and if the value is 0, which means we have to target it as duplicated, by changing the value as -1.
* This is very important, as it can happen that, a character can present more than 2 times, and in that case the value will already be -1. So, we have to add a new condition that if the char is present && value is -1, then don't do anything and **continue**.
* Finally traverse the array once again && check from the beginning, that which is the first character, whose value is 0. Return it's index.

# Complexity
- Time complexity: $$O(N)$$, where N = length of the String.
<!-- Add your time complexity here, e.g. $$O(n)$$ -->

- Space complexity: $$O(1)$$, since we can have 26 different characters in any given string.
