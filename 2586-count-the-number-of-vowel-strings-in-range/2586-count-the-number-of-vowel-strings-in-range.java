class Solution {
    public int vowelStrings(String[] words, int left, int right) {
   
   int count=0;

        for(int i=left;i<=right;i++){
            char[]ch=words[i].toCharArray();
            if(ch[0]=='a' || ch[0]=='e'|| ch[0]=='i'|| ch[0]=='o'|| ch[0]=='u'){
                if(ch[ch.length-1]=='a'|| ch[ch.length-1]=='e'||ch[ch.length-1]=='i'||ch[ch.length-1]=='o'||ch[ch.length-1]=='u'){
                    count++;
                }
            }
        }

        return count;
        
    }
}