class Solution {
    public int uniqueMorseRepresentations(String[] words) {

        String[] morse={".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};

        HashMap<Character,String>h= new HashMap<>();
        int z=0;
        for(char i='a';i<='z';i++){
          h.put(i,morse[z]);
          z++;
        }

       
    HashMap<String,String>h1=new HashMap<>();
        for(int i=0;i<=words.length-1;i++){
            String w="";
            for(int j=0;j<=words[i].length()-1;j++){
                char[] ch=words[i].toCharArray();
                 String y= h.get(ch[j]);
                 w+=y;
            }
            h1.put(words[i],w);
        }

        HashSet<String>ht= new HashSet<>();
        for(String x : h1.keySet()){
            ht.add(h1.get(x));
        }

        return ht.size();

        
        
    }
}