class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {

       int[] a=new int[nums1.length + nums2.length];
       int k=0;

       for(int x : nums1){
       a[k]=x;
       k++;
       }
        for(int x : nums2){
       a[k]=x;
       k++;
       }
       Arrays.sort(a);

       int i=0;
       int j=a.length-1;

      if (a.length % 2 == 1) {
            return a[a.length / 2] * 1.0;
        } else {
            double x = a[a.length / 2] + a[(a.length / 2) - 1];
            return x / 2;
        }
     

        
    }
}