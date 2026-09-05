class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {

        int[]n=new int[nums.length];
        
        int j=0;
        for(int i=1;i<=nums.length;i++){
            n[j]=i;
            j++;
        }

        HashSet<Integer>hs= new HashSet<>();
        for(int x: nums){
            hs.add(x);
        }
        List<Integer>l=new ArrayList<>();
        for(int x :n){
            if(!hs.contains(x)){
                l.add(x);
            }
        }

        return l;
      
   
   
        
    }
}