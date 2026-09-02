class Solution {
    public int totalMoney(int n) {

        int ans=0;
        int monday=1;
        int day=1;
    
     for(int i=1;i<=n;i++){
      
            ans+=monday+day-1;
            day++;
            if(day==8){
                day=1;
                monday++;
            }
        
        
     }
     return ans;
       


        
    }
}