class Solution {
    public int findSpecialInteger(int[] arr) {

       HashMap<Integer,Integer>h= new HashMap<>();
       for(int x : arr){
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
        if(h.get(x)*4>arr.length){
            return x;
        }
       }
       return -1;
        
    }
}