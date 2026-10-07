class Solution {
    public boolean digitCount(String num) {

        char[] n=num.toCharArray();
        int[] nu=new int[n.length];
        int z=0;
        for(char x:n){
           nu[z]=x-'0';
           z++;
        }
        HashMap<Integer,Integer>h= new HashMap<>();
        for(int x : nu){
            if(h.containsKey(x)){
                int y=h.get(x);
                y++;
                h.put(x,y);
            }
            else{
                h.put(x,1);
            }
        }

        for(int i=0;i<=nu.length-1;i++){
            if(nu[i]!=h.getOrDefault(i,0)){
                return false;
            }
        }
        return true;




        
    }
}