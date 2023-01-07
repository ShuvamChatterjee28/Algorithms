# Brute (Recursive) - 

class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        boolean ans = false;
        for(int i = 0; i < cost.length; i++){
            ans = helper(gas, cost, i, 0, 0);
            if(ans == true){ return i; }
        }
        return -1;
    }

    public boolean helper(int[] gas, int[] cost, int idx, int leftGas, int count){
        if(count == cost.length) { return true; }
        int calcLeftGas = gas[idx] - cost[idx] + leftGas;
        if(calcLeftGas < 0){
            return false;
        }

        return helper(gas, cost, (idx+1)%cost.length, calcLeftGas, count+1);
    }
}

# Brute - 

class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int len = gas.length;
        
        for(int i = 0; i < len; i++){
			// If we can start the traversal
            if(gas[i] >= cost[i]){
                int idx = i, Gas = 0, j = 0;
                int remainingGas = 0;
                for(j = i; j < i+len; j++){
                    int index = j % len;
                    Gas = gas[index] + remainingGas;
                    if(Gas < cost[index]){
                        break;
                    }
                    remainingGas = Gas - cost[index];
                }
				// to verify that if the circuit is fully traversed
                if((j % len) == idx){
                    return idx;
                }
            }
        }
        
        return -1;
    }
}

# Optimal - 

class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int len = gas.length;
        int total = 0;
        int consume = 0;
        int tank = 0;
        int index = 0;
        
        for(int i = 0; i < len; i++){
            consume = gas[i] - cost[i];
            tank += consume;
            if(tank < 0){
                index = i + 1;
                tank = 0;
            }
            total += consume;
        }
        
        return (total < 0) ? -1 : index;
    }
}