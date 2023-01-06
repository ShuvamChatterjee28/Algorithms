# Brute-Forced (Greedy)
```
class Solution {
    public int maxIceCream(int[] costs, int coins) {

        // Sort the costs in ascending order.
        // This is required to find the smaller (optimal) bars.
        Arrays.sort(costs);
        int count = 0;

        for(int i = 0; i < costs.length; i++){
            // If the number of coins after buying a bar is negative, 
            // then we can not buy.
            if(coins - costs[i] < 0){
                break;
            }

            // Else increment the count & update the count.
            count++;
            coins = coins - costs[i];
        }

        // Return the ans.
        return count;
    }
}
```
# Optimal
```
class Solution {
    public int maxIceCream(int[] costs, int coins) {

        // Initialize an array "freq" to store the frequency of each cost in the input array.
        // The size is 100001, because in the question, it is given that the max size of cost can be 10^5.
        int[] freq = new int[100001];
        int count = 0;

        // Here storing the freq of each cost in the input array
        for(int i = 0; i < costs.length; i++){
            freq[costs[i]]++;
        }

        for(int i = 0; i < 100001; i++){
            // If this cost ever exists or not (using the freq array)    
            if(freq[i] > 0){

                // "amount" is variable where we will update the maximum coin, that we can spend on that cost.
                // Either take the freq of that cost, if we have that much coin or coin / i to get the max number of bar we can buy using currently avaiable coins.
                int amount = Math.min(coins/i, freq[i]);

                // We need to update the coins left after we have found the optimal coins, we can spend.
                coins -= amount * i;

                // Update the count, which is our ans.
                count += amount;
            }
        }

        return count;
    }
}
```