class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {

        int k=m;
        int z=0;
        
        for(int i=m;i<=nums1.length-1;i++){
            nums1[i]=nums2[z];
            z++;
        }

        for(int i=0;i<=nums1.length-1;i++){
            for(int j=i+1;j<=nums1.length-1;j++){
                if(nums1[i]>nums1[j]){
                    int temp= nums1[i];
                    nums1[i]=nums1[j];
                    nums1[j]=temp;
                }
            }
        }

       

        
    }
}