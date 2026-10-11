class Solution {
    public int[] kWeakestRows(int[][] mat, int k) {

        int[] sol = new int[mat.length];
        int[] ans = new int[k];

        for (int i = 0; i < mat.length; i++) {
            int count = 0;

            for (int j = 0; j < mat[i].length; j++) {
                if (mat[i][j] == 1) {
                    count++;
                }
            }

            sol[i] = count;
        }


        for (int i = 0; i < k; i++) {

            int min = Integer.MAX_VALUE;
            int ind = -1;

            for (int j = 0; j < sol.length; j++) {
                if (sol[j] < min) {
                    min = sol[j];
                    ind = j;
                }
            }

            ans[i] = ind;

  
            sol[ind] = Integer.MAX_VALUE;
        }

        return ans;
    }
}