class Solution {
    public String restoreString(String s, int[] indices) {
        char[]c=s.toCharArray();
        char[] ans=new char[s.length()];

        for(int i=0;i<=s.length()-1;i++){
            ans[indices[i]]=c[i];
        }
        String a="";
        for(char x : ans){
          a+=x;
        }
        return a;
        
    }
}