lass Solution {
    public double myPow(double x, int n) {
        return n < 0 ? 1/helper(x, Math.abs(n)) : helper(x, n);
    }
    
    public double helper(double x, int n){
        if(x == 0) return 0;
        if(n == 0) return 1;
        
        return n % 2 != 0 ? x * helper(x * x, n/2) : helper(x * x, n/2);
    }
}