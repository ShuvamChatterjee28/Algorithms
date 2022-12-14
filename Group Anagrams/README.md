Brute-Force:-
In the brute-force way, we can store the strings directly into the List. For example,
strs = ["eat","tea","tan","ate","nat","bat"] & ans = []

Since index 0 --> eat is not present in the list (list is empty anyway), hence add it to the list ans.
strs = ["eat","tea","tan","ate","nat","bat"] & ans = [["eat"]]
Now loop through the list ans through the first element of each inner list (If they are anagram, then the first element should do the work). Since index 1 --> tea, it's anagram is present in the list, hence add it to the perfect position in the list ans.
strs = ["eat","tea","tan","ate","nat","bat"] & ans = [["eat", "tea"]]
Since index 2 --> tan & any of it's anagrams is not present in the list, hence add it to the list ans.
strs = ["eat","tea","tan","ate","nat","bat"] & ans = [["eat", "tea"], ["tan"]]
While looping through the list, we found out that index 3 --> ate, it's anagram is present in the list, hence add it to the perfect position in the list ans.
strs = ["eat","tea","tan","ate","nat","bat"] & ans = [["eat", "tea", "ate"], ["tan"]]
While looping through the list, we found out that index 4 --> nat, it's anagram is present in the list, hence add it to the perfect position in the list ans.
strs = ["eat","tea","tan","ate","nat","bat"] & ans = [["eat", "tea", "ate"], ["tan", "nat"]]
Since index 5 --> bat & any of it's anagrams is not present in the list, hence add it to the list ans.
strs = ["eat","tea","tan","ate","nat","bat"] & ans = [["eat", "tea", "ate"], ["tan", "nat"], ["bat"]]
Now we have our answer, but the time complexity is O(n^3 * logn), which is very big.

Optimal Way:-
To solve this problem we can use HashMap to store the freq of letter of a particular string as key, and the value will be the words with that particular freq. Then if we find the match for that particular freq as key, immediately add that string in the corresponding arraylist.

Formal Algorithm is described below -

For each String in the strs, maintain an array of count of particular chars
Then for each chars, count the freq of letters, and then store it in a HashMap
This HashMap will have key as the string of counts (converted to string fmo int array) and value will be the matched strings
Return the values of the HashMap and this is our answer.
Code for the same -

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> map = new HashMap<>();
        
        for(String s : strs){
            int[] count = new int[26];
            for(char c : s.toCharArray()){
                count[c-'a']++;
            }
            String temp = Arrays.toString(count);
            if(!map.containsKey(temp)) { map.put(temp, new ArrayList<>()); }
            map.get(temp).add(s);
        }
        
        return new ArrayList<>(map.values());
    }
}
Time Complexity: O(m . n), where m = len of strs, n = avg length of strings in strs
Space Complexity: O(m)

Happy Coding :)