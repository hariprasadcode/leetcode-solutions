class Solution {
    public int maxDifference(String s) {
        char[]str=s.toCharArray();
        HashMap<Character,Integer>h=new HashMap<>();
      

        for(char x : str){ 
          if(h.containsKey(x)){
            int y=h.get(x);
            y++;
            h.put(x,y);
          }
          else{
            h.put(x,1);
          }
        }

        int odd=0;
        int even=Integer.MAX_VALUE;

     

        for(char x : h.keySet()){
            int count=h.get(x);

            if(count%2!=0){
                odd=Math.max(count,odd);
            }
            else{
                even=Math.min(count,even);
            }
            
        }

     

        return odd-even;

        

        
    }
 }