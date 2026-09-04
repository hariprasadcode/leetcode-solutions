class Solution {
    public String kthDistinct(String[] arr, int k) {

        ArrayList<String> al = new ArrayList<>();

        for(int i = 0; i <= arr.length - 1; i++) {

            boolean found = false;

            for(int j = 0; j <= arr.length - 1; j++) {

                if(i != j && arr[i].equals(arr[j])) {
                    found = true;
                    break;
                }
            }

            if(!found) {
                al.add(arr[i]);
            }
        }

        for(int i = 0; i < al.size(); i++) {

            if(i == k - 1) {
                return al.get(i);
            }
        }

        return "";
    }
}