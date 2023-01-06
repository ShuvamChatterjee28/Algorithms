# Greedy Appproach - 
1. Here First we will sort the array to get the optimal or smallest elements in the first.
2. Next do a for loop of the array to get the check which element we can add or we can't.
3. If after adding the element, the coins are going negative, means we are not left with nothing, then don't add.
4. Else add and update coins and count.
5. Finally return the answer.

# Optimal Approach - 
1. Here We need to initialize an array "freq" to store the frequency of each cost in the input array.
2. The size of this array is 100001, because in the question, it is given that the max size of cost can be 10^5.
3. Next we will store the freq of each cost inside our aux array.
4. Now perform a loop of this freq array, and perform action, when the freq is > 0.
5. We need a variable where we will update the maximum coin, that we can spend on that cost. This variable's name will be "amount".
6. In "amount", Either take the freq of that cost, if we have that much coin or coin / i to get the max number of bar we can buy using currently avaiable coins.
7. We need to update the coins left after we have found the optimal coins, we can spend.
8. Update the count, which is our ans.
9. Lastly, return the ans.
