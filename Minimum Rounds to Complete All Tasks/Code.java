# Code
```
class Solution {
    public int minimumRounds(int[] tasks) {
        int len = tasks.length;

        // If the length of array is 0 or 1, then we can not combine the numbers
        if(len == 0 || len ==1) { return -1; }
        HashMap<Integer, Integer> map = new HashMap<>();

        // Using the Hashmap, get the freq of each individual number
        for(int i = 0; i < len; i++){
            map.put(tasks[i], map.getOrDefault(tasks[i], 0)+1);
        }

        int ans = 0;

        for(int itr : map.keySet()){
            int val = map.get(itr);

            // If anyone's freq is 1, then by deafult we will return -1
            if(val == 1) { return -1; }

            // Next we need to get multiple of 3, clostest to current freq
            // Ex - if val (freq) = 7, then ans = 7/3 = 2
            ans += val/3;

            // Now if the freq is NOT divisible by 3, then we need to add another round, means ans will be increased by 1
            if(val%3 != 0) { ans++; }
        }

        return ans;
    }
}
```