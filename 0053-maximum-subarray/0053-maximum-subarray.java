class Solution {
    public int maxSubArray(int[] nums) {

        int psum=0;
        int submax=nums[0];

        for(int x : nums){
            psum=Math.max(psum+x,x);
            submax=Math.max(psum,submax);
        }
        return submax;
        


    }
}