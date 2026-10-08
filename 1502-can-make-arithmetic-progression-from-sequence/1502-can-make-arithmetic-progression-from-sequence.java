class Solution {
    public boolean canMakeArithmeticProgression(int[] arr) {
        HashSet<Integer>hs= new HashSet<>();

      
        for(int i=0;i<=arr.length-1;i++){
            for(int j=i+1;j<=arr.length-1;j++){
                if(arr[i]>arr[j]){
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }

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