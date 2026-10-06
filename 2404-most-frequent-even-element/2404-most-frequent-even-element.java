class Solution {
    public int mostFrequentEven(int[] nums) {

        HashMap<Integer,Integer>h= new HashMap<>();
        for(int x : nums){
            if(h.containsKey(x)){
                int y=h.get(x);
                y++;
                h.put(x,y);
            }
            else{
                h.put(x,1);
            }
        }


        int m=0;
        int num=-1;

        for(int x : h.keySet()){
            if(x%2==0){
                if(h.get(x)>m ||(h.get(x)==m) && (num==-1 ||x<num)){

                m=h.get(x);
                num=x;
                }
                
            }

           
        }


        return num;
        
    }
}