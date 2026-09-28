class Solution {
    public int addDigits(int num) {

        while(num>9){

            int number=0;

            int ans=0;
            while(num!=0){
                int r= num%10;
                ans=ans+r;
                num=num/10;
               
                
            }
            num=ans;
        }
        return num;
        
    }
}