class Solution {
    public int numIdenticalPairs(int[] nums) {

        HashMap<Integer,Integer>h= new HashMap<>();
        for(int x : nums){
            if(h.containsKey(x)){
                int y=h.get(x);
                y++;
                h.put(x,y);
            }
            else{
                h.put(x,1);
            }
        }

     int count=0;
        for(int x : h.keySet()){
            if(h.get(x)>1){
                int y=h.get(x);
                count+=y*(y-1)/2;
            }
        }

        return count;
 
        
    }
}