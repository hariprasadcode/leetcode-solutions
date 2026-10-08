class Solution {
    public boolean judgeSquareSum(int c) {

        int i=0;
        long j=(long)Math.sqrt(c);
      while(i<=j){
        int mid=c/2;
       long num= (i*i)+(j*j);
       if(num==c){
        return true;
       }

       if(num>c){
        j--;
       }

       else if(num<c){
        i++;
       }

      }
      return false;
        
    }
}