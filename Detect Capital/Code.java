class Solution {
    public boolean detectCapitalUse(String word) {
        int len = word.length();
        if(len == 0 || len == 1) { return true; }
        
        boolean isCap = false;
        if(Character.isUpperCase(word.charAt(0)) && Character.isUpperCase(word.charAt(1))) { 
            isCap = true; 
        }
        else if(Character.isUpperCase(word.charAt(0)) && Character.isLowerCase(word.charAt(1))){
            isCap = false;
        }

        for(int i = 1; i < len; i++){
            if(Character.isLowerCase(word.charAt(i)) && isCap == true){
                return false;
            }
            else if(Character.isUpperCase(word.charAt(i)) && isCap == false){
                return false;
            }
        }

        return true;
    }
}