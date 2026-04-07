class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length == 0) {
            return 0;
        }
        Arrays.sort(nums);
        for(int k : nums) {
            System.out.print(k + " ");
        }
        int maxCount = 0, count = 0;
        for(int i = 1; i < nums.length; i++) {
            if(nums[i] == nums[i-1]) {
                continue;
            }
            else if(nums[i] - nums[i-1] == 1) {
                count++;
                if(count > maxCount) {
                    maxCount = count;
                }
            }
            else {
                count = 0;
            }
        }
        return maxCount+1;
    }
}
