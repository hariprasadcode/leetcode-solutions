class Solution {
    public boolean canMakeArithmeticProgression(int[] arr) {
        HashSet<Integer>hs= new HashSet<>();

        Arrays.sort(arr);

        for(int i=1;i<=arr.length-1;i++){
            int num=Math.abs(arr[i-1]-arr[i]);
            hs.add(num);

        }
        if(hs.size()==1){
            return true;
        }
        return false;
        
    }
}