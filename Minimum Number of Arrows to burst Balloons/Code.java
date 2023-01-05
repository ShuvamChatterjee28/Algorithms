class Solution {
    public int findMinArrowShots(int[][] points) {
        int len = points.length;
        if(len == 1) { return 1; }

        Arrays.sort(points, (a,b) -> Integer.compare(a[0], b[0]));
        int lastpoint = points[0][1];
        int ans = 1;

        for(int i = 1; i < len; i++){
            if(points[i][0] > lastpoint){
                ans++; lastpoint = points[i][1];
            }
            lastpoint = Math.min(lastpoint, points[i][1]);
        }

        return ans;
    }
}