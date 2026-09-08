class Solution {
    public int countBalls(int lowLimit, int highLimit) {
        HashMap<Integer,Integer>h= new HashMap<>();
        

        for(int i=lowLimit;i<=highLimit;i++){

            int num=i;
            int sum=0;
            while(num!=0){
                int r=num%10;
                num=num/10;
                 sum+=r;
            }
            if(h.containsKey(sum)){
                int y=h.get(sum);
                y++;
                h.put(sum,y);
            }
            else{
                h.put(sum,1);
            }
            

        }
        
        int max=0;
        for(int x :h.keySet()){
            if(h.get(x)>max){
                max=h.get(x);
            }

        }
        return max;

        
    }
}