class Solution {
    public int findLHS(int[] nums) {
        HashMap<Integer,Integer>h= new HashMap<>();
        for(int x : nums){
            if(h.containsKey(x)){
                int y= h.get(x);
                y++;
                h.put(x,y);
            }
            else{
                h.put(x,1);
            }
        }

        int max=0;

        for(int x : h.keySet()){
            if(h.containsKey(x+1)){
                int count=h.get(x)+h.get(x+1);

                if(count>max){
                    max=count;
                }
            }
        }
        return max;
        
    }
}