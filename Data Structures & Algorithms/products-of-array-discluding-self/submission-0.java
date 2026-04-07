class Solution {
    public int[] productExceptSelf(int[] nums) {
        int i = 1, j = nums.length-2;
        int[] prefix = new int[nums.length];
        int[] suffix = new int[nums.length];
        prefix[0] = nums[0];
        suffix[nums.length-1] = nums[nums.length-1];

        while(i < nums.length) {
            prefix[i] = nums[i] * prefix[i-1];
            suffix[j] = nums[j] * suffix[j+1];
            i++;
            j--;
        }

        int[] result = new int[nums.length];
        for(i = 0; i < nums.length; i++) {
            if(i == 0) {
                result[i] = suffix[i+1];
            }
            else if(i == nums.length-1) {
                result[i] = prefix[i-1];
            }
            else {
                result[i] = prefix[i-1] * suffix[i+1]; 
            }
        }

        return result;
    }
}  
