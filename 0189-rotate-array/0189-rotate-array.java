class Solution {
    public void rotate(int[] nums, int k) {

        int len=nums.length;
        k=k%len;
        int j=0;
        int[]temp=new int[nums.length];
        for(int i=len-k;i<=nums.length-1;i++){
            temp[j]=nums[i];
            j++;
        }

        for(int i=0;i<=len-k-1;i++){
            temp[j]=nums[i];
            j++;
        }

        int i=0;
        for(int x : temp){
            nums[i]=x;
            i++;
        }
        
    }
}