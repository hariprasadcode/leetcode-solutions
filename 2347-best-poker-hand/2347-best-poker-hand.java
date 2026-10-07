class Solution {
    public String bestHand(int[] ranks, char[] suits) {

        HashSet<Character>hs= new HashSet<>();
        HashMap<Integer,Integer>h= new HashMap<>();

        for(char x : suits){
            hs.add(x);
        }
        if(hs.size()==1){
            return "Flush";
        }

        for(int x : ranks){
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
            if(h.get(x)>=3){
                return "Three of a Kind";
            }
        }
        
        for(int x : h.keySet()){
            if(h.get(x)==2){
                return "Pair";
            }
        }
        return "High Card";
       


    }
}