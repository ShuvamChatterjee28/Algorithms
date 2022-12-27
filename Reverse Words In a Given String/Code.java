class Solution 
{
    //Function to reverse words in a given string.
    String reverseWords(String S)
    {
        // code here
        int end = S.length();
        String ans = "";
        for(int i = end-1; i >= 0; i--){
            if(i==0 && S.charAt(i) != '.'){
                ans+=S.substring(i, end);
            }
            if(S.charAt(i) == '.'){
                ans+=(S.substring(i+1, end)+"."); end = i;
            }
        }
        return ans;
    }
}