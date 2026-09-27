class Solution {
    public int majorityElement(int[] nums) {

        HashMap<Integer,Integer>h= new HashMap<>();
        for(int x: nums){
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
            if(h.get(x)>nums.length/2){
                return x;
            }

        }
        return 0;
        
    }
}