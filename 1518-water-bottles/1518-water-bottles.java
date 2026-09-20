class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
       
       int total=numBottles;
       while(numBottles>=numExchange){
        int nb=numBottles/numExchange;
        int empty=numBottles%numExchange;
        total+=nb;

        numBottles=nb+empty;


       }
return total;

        
    }
}