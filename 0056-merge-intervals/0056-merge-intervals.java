class Solution {
    public int[][] merge(int[][] intervals) {
        
        Arrays.sort(intervals, (a,b) -> a[0] - b[0]);

        List<int[]> a=new ArrayList<>();

        int start=intervals[0][0];
        int end=intervals[0][1];

        for(int i=1;i<=intervals.length-1;i++){
            if(intervals[i][0]<=end){
                if(intervals[i][1]>end){
                    end=intervals[i][1];
                }
            }
            else{
                int[]x= new int[2];
                x[0]=start;
                x[1]=end;

                a.add(x);

                start=intervals[i][0];
                end=intervals[i][1];
            }
            
        }
         int[]x=new int[2];
            x[0]=start;
            x[1]=end;
            a.add(x);

        int[][]ans= new int[a.size()][2];

        for(int i=0;i<=a.size()-1;i++){
            ans[i][0]=a.get(i)[0];
            ans[i][1]=a.get(i)[1];
        }

        return ans;
        
    }
}