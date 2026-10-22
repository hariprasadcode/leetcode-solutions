class Solution {
    public long maximumSubarraySum(int[] nums, int k) {

        HashMap<Integer, Integer> h = new HashMap<>();

        int i = 0;
        int j = 0;

        long sum = 0;
        long max = 0;

        while (j < nums.length) {

            sum = sum + nums[j];

            if (h.containsKey(nums[j])) {
                h.put(nums[j], h.get(nums[j]) + 1);
            } else {
                h.put(nums[j], 1);
            }

            if (j - i + 1 == k) {

                if (h.size() == k) {
                    max = Math.max(max, sum);
                }

                sum = sum - nums[i];

                h.put(nums[i], h.get(nums[i]) - 1);

                if (h.get(nums[i]) == 0) {
                    h.remove(nums[i]);
                }

                i++;
            }

            j++;
        }

        return max;
    }
}