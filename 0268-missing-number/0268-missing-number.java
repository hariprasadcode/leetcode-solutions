class Solution {
    public int missingNumber(int[] nums) {

   int total=0;
   int count=0;
        for(int x : nums){
          total+=x;
          count++;
        }
    int real=0;
        for(int i=0;i<=count;i++){
        real+=i;
        }

        return real-total;


        
    }
}