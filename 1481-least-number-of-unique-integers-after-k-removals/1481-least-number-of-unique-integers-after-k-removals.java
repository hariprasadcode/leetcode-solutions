class Solution {
    public int findLeastNumOfUniqueInts(int[] arr, int k) {
       
      HashMap<Integer,Integer>h= new HashMap<>();
      for(int x : arr){
        if(h.containsKey(x)){
            int y=h.get(x);
            y++;
            h.put(x,y);
        }
        else{
            h.put(x,1);
        }
      }

      ArrayList<Integer>al=new ArrayList<>(h.values());
      Collections.sort(al);
      int count=h.size();
      for(int i=0;i<al.size();i++){
        if(k>=al.get(i)){
            k=k-al.get(i);
            count--;
        }
        else{
            break;
        }
      }
    

     return count;
      
     
        
    }
}