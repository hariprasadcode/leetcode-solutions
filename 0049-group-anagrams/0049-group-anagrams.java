class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>> h= new HashMap<>();

        for(int i=0;i<=strs.length-1;i++){
            char[] ch=strs[i].toCharArray();

            for(int j=0;j<=ch.length-1;j++){
                for(int k=j+1;k<=ch.length-1;k++){
                    if(ch[j]>ch[k]){
                        char temp=ch[k];
                        ch[k]=ch[j];
                        ch[j]=temp;
                    }
                }
            }
            String key=new String(ch);
            if(h.containsKey(key)){
                h.get(key).add(strs[i]);
            }
            else{
                List<String>l= new ArrayList<>();
                l.add(strs[i]);
                h.put(key,l);
            }
        }

        return new ArrayList<>(h.values());
        

    }
}