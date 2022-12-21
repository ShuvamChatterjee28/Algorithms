class Solution {
    public String largestNumber(int[] nums) {
        if(nums.length == 0 || nums == null) { return ""; }

        String[] s_nums = new String[nums.length];
        for(int i = 0; i < nums.length; i++) { s_nums[i] = String.valueOf(nums[i]); }

        Comparator<String> comp = new Comparator<>(){
            @Override
            public int compare(String s1, String s2){
                String str1 = s1 + s2;
                String str2 = s2 + s1;
                return str2.compareTo(str1); // Since we want the reverse sorted order
            }
        };

        Arrays.sort(s_nums, comp); // Sorting using the comparator

        if(s_nums[0].charAt(0) == '0') { return "0"; }

        StringBuilder str = new StringBuilder();
        for(String s : s_nums) { str.append(s); }

        return str.toString();
    }
}