Here we have to reverse the order of the words, and NOT the string. The words are separated by a dot ('.'), and using this pivot point, we will reverse the order.

# Steps - 
1. First we need to loop through the string from backwards. This way we will be able to track individula words. We will also use a variable, named 'end'. This is required to track the end of the current word.
2. Our strategy is to go backward, and when ever a separator ('.') comes, then only use a substring method to cut from the index+1 till the 'end' variable.
3. Here we will encounter a special scenario, where we need to cut the first word, and there we will not be having the '.' separator, so how we gonna cut it? For that we will use this condition as, **if the index is 0 AND the 0th index is NOT '.', then cut from current index till 'end' variable**. Second AND condition is there because suppose first word is "", then we have to also tackle that.

Time Complexity: $$O(n)$$
Space Complexity: $$O(1)$$