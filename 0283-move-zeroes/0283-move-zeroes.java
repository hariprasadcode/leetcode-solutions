class Solution {
    public void moveZeroes(int[] nums) {

        int j=0;
        for(int x : nums){
            if(x!=0){
                nums[j]=x;
                j++;
            }
        }

        while(j<=nums.length-1){
            nums[j]=0;
            j++;
        }
        


        
    }
}