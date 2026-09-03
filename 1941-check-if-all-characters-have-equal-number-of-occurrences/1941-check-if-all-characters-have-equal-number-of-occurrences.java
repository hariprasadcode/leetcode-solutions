class Solution {
    public boolean areOccurrencesEqual(String s) {

        char[] c=s.toCharArray();
        HashMap<Character,Integer>h= new HashMap<>();

        for(char x : c){
            if(h.containsKey(x)){
                int y=h.get(x);
                y++;
                h.put(x,y);
            }
            else{
                h.put(x,1);
            }

        }
        TreeSet<Integer>t= new TreeSet<>(h.values());
        if(t.size()==1){
            return true;
        }
        return false;

        
    }
}