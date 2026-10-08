class Solution {
    public boolean checkGoodInteger(int n) {

        int copy=n;
        int digitSum=0;
        int squareSum=0;


        while(n!=0){
            int r=n%10;
            n=n/10;
            digitSum+=r;
            int sqr=r*r;
            squareSum+=sqr;
        }
        if(squareSum-digitSum>=50){
            return true;
        }
        return false;
        
    }
}