class Solution {
    public String[] getFolderNames(String[] names) {
       HashMap<String,Integer>h= new HashMap<>();
        String[]ans=new String[names.length];

        for(int i=0;i<=names.length-1;i++){
            String x=names[i];
        if(!h.containsKey(names[i])){
            h.put(x,1);
            ans[i]=x;
        }
        else{
            int y=h.get(names[i]);
            String newName=x+"("+y+")";
            while(h.containsKey(newName)){
                y++;
                newName=x+"("+y+")";
            }
            h.put(x,y+1);
            h.put(newName,1);

            ans[i]=newName;
        }

        }
        return ans;
        
    }
}