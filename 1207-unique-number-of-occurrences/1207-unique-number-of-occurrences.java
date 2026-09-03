class Solution {
    public boolean uniqueOccurrences(int[] arr) {

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
   HashSet<Integer>hs=new HashSet<>();
       for(int x : h.values()){
        
        if(hs.contains(x)){
            return false;
        }
        else{
            hs.add(x);
        }
       }
       return true;
        
    }
}