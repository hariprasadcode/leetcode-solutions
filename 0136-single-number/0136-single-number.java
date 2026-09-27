class Solution {
    public int singleNumber(int[] nums) {

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

        for(int x : h.keySet()){
            if(h.get(x)==1){
                return x;
            }
        }
        return 0;
        
    }
}