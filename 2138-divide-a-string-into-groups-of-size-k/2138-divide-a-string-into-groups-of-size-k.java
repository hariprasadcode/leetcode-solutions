class Solution {
    public String[] divideString(String s, int k, char fill) {

        List<String> l = new ArrayList<>();
        String val = "";
        int count = 0;

        for(char x : s.toCharArray()) {

            val += x;
            count++;

            if(count == k) {
                l.add(val);
                val = "";
                count = 0;
            }
        }

    
        if(count > 0) {
            while(count < k) {
                val += fill;
                count++;
            }
            l.add(val);
        }

        String[] ans = new String[l.size()];

        int i = 0;
        for(String x : l) {
            ans[i] = x;
            i++;
        }

        return ans;
    }
}