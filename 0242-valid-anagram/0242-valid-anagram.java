class Solution {
    public boolean isAnagram(String s, String t) {

        HashMap<Character,Integer>h= new HashMap<>();
        char[]sc=s.toCharArray();
        char[] tc=t.toCharArray();

        if(sc.length!=tc.length){
            return false;
        }
        for(char x : sc){
            if(h.containsKey(x)){
                int y= h.get(x);
                y++;
                h.put(x,y);
            }
            else{
                h.put(x,1);
            }
        }

        for(int i=0;i<=tc.length-1;i++){

            if(!h.containsKey(tc[i])){
                return false;
            }
            if(h.containsKey(tc[i])){
                int y=h.get(tc[i]);
                y--;
                if(y<0){
                    return false;
                }
                h.put(tc[i],y);
            }
        }
        return true;
        
    }
}