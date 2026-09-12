class Solution {
    public int[] twoSum(int[] nums, int target) {

        HashMap<Integer,Integer>h= new HashMap<>();
        int[] ans=new int[2];

        for(int i=0;i<=nums.length-1;i++){

            int val=target-nums[i];

            
            if(h.containsKey(val)){
                ans[0]=h.get(val);
                ans[1]=i;
                return ans;
            }
            h.put(nums[i],i);

        }
        return ans;
    }
}