# Brute

class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        HashMap<Integer, ArrayList<Integer>> map = new HashMap<>();
        ArrayList<Integer> ansList = new ArrayList<>();

        for(int i = 0; i < nums1.length; i++){
            ArrayList<Integer> temp = new ArrayList<>();
            temp.add(nums1[i]); temp.add(0);
            map.put(i, new ArrayList<>(temp));
        }

        for(int i = 0; i < nums2.length; i++){
            for(ArrayList<Integer> arr : map.values()){
                if(arr.get(0) == nums2[i] && arr.get(1) != 1){
                    arr.set(1, 1);
                    break;
                }
            }
        }

        for(ArrayList<Integer> arr : map.values()){
            if(arr.get(1) == 1){
                ansList.add(arr.get(0));
            }
        }

        int[] ans = new int[ansList.size()];
        for(int i = 0; i < ansList.size(); i++){
            ans[i] = ansList.get(i);
        }

        return ans;
    }
}

# Optimized 

class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        HashMap<Integer, Integer> map = new HashMap<>();
        ArrayList<Integer> ansList = new ArrayList<>();

        for(int i = 0; i < nums1.length; i++){
            if(map.containsKey(nums1[i])) { map.put(nums1[i], map.get(nums1[i])+1); }
            else { map.put(nums1[i], 1); }
        }

        for(int i = 0; i < nums2.length; i++){
            if(map.containsKey(nums2[i])) { 
                if(map.get(nums2[i]) > 0){
                    ansList.add(nums2[i]); map.put(nums2[i], map.get(nums2[i])-1);
                }
            }
        }

        int[] ans = new int[ansList.size()];
        for(int i = 0; i < ansList.size(); i++){
            ans[i] = ansList.get(i);
        }

        return ans;
    }
}