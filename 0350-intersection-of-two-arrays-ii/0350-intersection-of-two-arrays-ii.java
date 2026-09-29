class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        HashMap<Integer,Integer>h= new HashMap<>();

        for(int x : nums1){
            if(h.containsKey(x)){
                int y=h.get(x);
                y++;
                h.put(x,y);
            }
            else{
                h.put(x,1);
            }
        }

        int k=0;
        int[]arr=new int[nums1.length];
        for(int x : nums2){
            if(h.containsKey(x) && h.get(x)>0){
                arr[k]=x;
                k++;
                h.put(x,h.get(x)-1);
            }
        }

        int[] ans= new int[k];

        for(int i=0;i<=k-1;i++){
        ans[i]=arr[i];
        }
        return ans;
        
    }
}