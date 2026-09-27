class Solution {
    public boolean isPalindrome(int x) {

        int copy=x;
        int number=0;

        if(x<0){
            return false;
        }

        while(x!=0){
            int r=x%10;
            x=x/10;

            if(number> Integer.MAX_VALUE/10 || number==Integer.MAX_VALUE/10 && r>7){
                return false;
            }

            number=number*10;
            number+=r;

        }
        if(copy==number){
            return true;
        }
        return false;
        
    }
}