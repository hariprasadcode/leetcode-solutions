class Solution {
    public List<Integer> findMissingElements(int[] nums) {

        int max=0;
        int min=100;

        ArrayList<Integer>a=new ArrayList<>();

        for(int x : nums){
            if(max<x){
                max=x;
            }
            if(min>x){
                min=x;
            }
            a.add(x);
        }
        List<Integer>l= new ArrayList<>();

        for(int i=min;i<=max;i++){
            if(!a.contains(i)){
                l.add(i);
            }

        }
        return l;
        
    }
}