class Solution {
    public int findJudge(int n, int[][] trust) {

        ArrayList<Integer> a = new ArrayList<>();

        for (int i = 0; i < trust.length; i++) {
            a.add(trust[i][0]);
        }

        for (int i = 1; i <= n; i++) {

            if (!a.contains(i)) {

                int count = 0;

                for (int j = 0; j < trust.length; j++) {
                    if (trust[j][1] == i) {
                        count++;
                    }
                }

                if (count == n - 1) {
                    return i;
                }
            }
        }

        return -1;
    }
}