class Solution {
    public int countSpecialIntegers(int[] nums) {

        boolean[] seen = new boolean[101];
        boolean[] bad = new boolean[101];

        int count = 0;

        for(int i = 0; i <= nums.length - 1; i++) {

            if(i > 0 && nums[i] != nums[i - 1]) {

                if(seen[nums[i]]) {
                    bad[nums[i]] = true;
                }

                seen[nums[i]] = true;
            }
            else {
                seen[nums[i]] = true;
            }
        }

        for(int i = 1; i <= 100; i++) {

            if(seen[i] && !bad[i]) {
                count++;
            }
        }

        return count;
    }
}