class Solution {
    public int numJewelsInStones(String jewels, String stones) {

        HashSet<Character>hs= new HashSet<>();
        HashSet<Character>hss= new HashSet<>();

        char[]j=jewels.toCharArray();
        for(char x : j){
            hs.add(x);
        }
        
        int count=0;
        char[]s=stones.toCharArray();
        for(char x : s){
            if(hs.contains(x)){
                count++;
            }
        }
        return count;
        
    }
}