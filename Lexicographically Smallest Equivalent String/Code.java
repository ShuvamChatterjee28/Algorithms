class Solution {
    public String smallestEquivalentString(String s1, String s2, String baseStr) {
        int baseStrLen = baseStr.length();
        int len = s1.length();

        HashMap<Character, HashSet<Character>> map = new HashMap<>();

        for(int i = 0; i < len; i++){
            char c1 = s1.charAt(i);
            char c2 = s2.charAt(i);

            if(!map.containsKey(c1)){
                HashSet<Character> temp = new HashSet<>(); temp.add(c2);
                map.put(c1, new HashSet<>(temp));
            }
            else{
                map.get(c1).add(c2);
                map.put(c1, map.get(c1));
            }
            if(!map.containsKey(c2)){
                HashSet<Character> temp = new HashSet<>(); temp.add(c1);
                map.put(c2, new HashSet<>(temp));
            }
            else{
                map.get(c2).add(c1);
                map.put(c2, map.get(c2));
            }
        }

        System.out.println(map);

        String result = "";

        for(int i = 0; i < baseStrLen; i++){
            char c = baseStr.charAt(i);
            int[] visited = new int[26];
            result += DFS(map, c, visited);
        }

        return result;
    }

    public char DFS(HashMap<Character, HashSet<Character>> map, char curr_char, int[] visited){
        visited[curr_char - 'a'] = 1;

        char minChar = curr_char;

        System.out.println("curr_char = "+curr_char+" set = "+map.get(curr_char));

        if(map.get(curr_char) == null) { return curr_char; }

        for(char c : map.get(curr_char)){
            if(visited[c-'a'] == 0){
                char temp = DFS(map, c, visited);
                if(temp-'a'<minChar-'a'){ minChar = temp; }
            }
        }

        return minChar;
    }
}