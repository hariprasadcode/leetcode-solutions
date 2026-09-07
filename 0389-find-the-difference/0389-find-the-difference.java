class Solution {
    public char findTheDifference(String s, String t) {
     HashMap<Character,Integer>hs= new HashMap<>();
     HashMap<Character,Integer>ht= new HashMap<>();
    
     char[] chs= s.toCharArray();
     char[] cht= t.toCharArray();

     for(char x : chs){
        if(hs.containsKey(x)){
            int y= hs.get(x);
            y++;
            hs.put(x,y);
        }
        else{
            hs.put(x,1);
        }
     }

     
     for(char x : cht){
        if(ht.containsKey(x)){
            int y= ht.get(x);
            y++;
            ht.put(x,y);
        }
        else{
            ht.put(x,1);
        }
     }
    

    for(char x : ht.keySet()){
        if(hs.get(x)!=ht.get(x)){
            return x;
        }
    }
     
     return 'a';

    
    }
}