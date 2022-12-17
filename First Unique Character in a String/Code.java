<!-- Add your space complexity here, e.g. $$O(n)$$ -->

# Code
```
class Solution {
    public int firstUniqChar(String s) {
        if(s == null || s.equals("")){ return -1; }
        HashMap<Character, Integer> map = new HashMap<>();

        for(char c : s.toCharArray()){
            if(!map.containsKey(c)) {
                map.put(c,0);
            }
            else if(map.get(c) == 0){
                map.put(c,-1);
            }
            else if(map.get(c) == -1){
                continue;
            }
        }

        for(char c : s.toCharArray()){
            if(map.get(c) == 0){
                return s.indexOf(c);
            }
        }

        return -1;
    }
}
```