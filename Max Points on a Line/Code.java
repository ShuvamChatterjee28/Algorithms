class Solution {
    public int maxPoints(int[][] points) {
        int len = points.length, ans = 2;

        if(len <= 2) { return len; }

        for(int i = 0; i < len; i++){
            for(int j = i+1; j < len; j++){
                int temp = 2;
                for(int k = j+1; k < len; k++){
                    int x = (points[k][1] - points[i][1]) * (points[j][0] - points[i][0]);
                    int y = (points[j][1] - points[i][1]) * (points[k][0] - points[i][0]);

                    if(x == y) {
                        temp++;
                    }
                }
                if(temp > ans){
                    ans = temp;
                }
            }
        }

        return ans;
    }
}