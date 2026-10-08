class Solution {
    public int sumOfTheDigitsOfHarshadNumber(int x) {

        int sum=0;
        int copy=x;

        while(x!=0){
            int r= x%10;
            x=x/10;
            sum+=r;
        }
        if(copy%sum==0){
            return sum;
        }
        return -1;
        
    }
}