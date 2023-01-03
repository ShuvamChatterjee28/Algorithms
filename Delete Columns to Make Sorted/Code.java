# brute - 

class Solution {
    public int minDeletionSize(String[] strs) {
        if(strs.length == 1) { return 0; } 
        int ans = 0;
        List<Integer> idx = new ArrayList<>();

        for(int i = 0; i < strs.length-1; i++){
            for(int j = 0; j < strs[i].length(); j++){
                if(idx.contains(j)) { continue; }
                if(strs[i].charAt(j)-'a' > strs[i+1].charAt(j)-'a'){
                    idx.add(j); ans++; continue;
                }
            }
        }

        return ans;
    }
}

# Optimized - 

class Solution{
public int minDeletionSize(String[] strs) {
    // Return 0 if the input array is null or empty
    if (strs == null || strs.length == 0) {
        return 0;
    }
    // Initialize the number of columns to the length of the first string
    int numColumns = strs[0].length();
    int numColumnsToDelete = 0;
    // Iterate through each column of the grid
    for (int i = 0; i < numColumns; i++) {
        // Initialize the current character to the first character in the column
        char currChar = strs[0].charAt(i);
        // Iterate through each element in the column
        for (int j = 1; j < strs.length; j++) {
            // If the current element is lexicographically smaller than the previous element,
            // increment the number of columns to delete and break out of the loop
            if (strs[j].charAt(i) < currChar) {
                numColumnsToDelete++;
                break;
            }
            // Otherwise, update the current character to the current element
            currChar = strs[j].charAt(i);
        }
    }
    // Return the number of columns to delete
    return numColumnsToDelete;
  }
}