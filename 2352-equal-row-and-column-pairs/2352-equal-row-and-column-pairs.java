class Solution {
    public int equalPairs(int[][] grid) {

        HashMap<String,Integer>h= new HashMap<>();

        for(int i=0;i<=grid.length-1;i++){

            String row=Arrays.toString(grid[i]);
            if(h.containsKey(row)){
                int y=h.get(row);
                y++;
                h.put(row,y);
            }
            else{

           h.put(row,1);
            }
        }
        int count=0;

        for(int i=0;i<=grid.length-1;i++){
            int[] arr= new int[grid.length];
            for(int j=0;j<=grid[i].length-1;j++){
                arr[j]=grid[j][i];
            }
            String col=Arrays.toString(arr);
            if(h.containsKey(col)){
                count+=h.get(col);
            }

        }

        return count;
        
        
    }
}