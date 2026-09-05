class Solution {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {

    Arrays.sort(arr);
    List<List<Integer>> al= new ArrayList<>(); 
      int min=Math.abs(arr[0]-arr[1]);
        for(int i=0;i<arr.length-1;i++){
             
                   int sub=Math.abs(arr[i+1]-arr[i]);
                   if(sub<min){
                    min=sub;
                    al.clear();
                   ArrayList<Integer>a= new ArrayList<>();
                    a.add(arr[i]);
                    a.add(arr[i+1]);
                    al.add(a);
                   }
                   else if(sub==min){

                    ArrayList<Integer>a= new ArrayList<>();
                    a.add(arr[i]);
                    a.add(arr[i+1]);
                    al.add(a);


                   }
                
            
        }
       
        return al;
        
    }
}