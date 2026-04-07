class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();

        Arrays.sort(nums);

        for(int i = 0; i < nums.length; i++) {
            int p1 = nums[i];
            if(i > 0 && nums[i] == nums[i-1]) continue;

            int l = i+1, r = nums.length-1;
            while(l < r) {
                int p2 = nums[l], p3 = nums[r];
                int sum = p1 + p2 + p3;
                if(sum > 0) {
                    r --;
                }
                else if(sum < 0) {
                    l ++;
                }
                else if(sum == 0) {
                    result.add(List.of(p1, p2, p3));
                    l ++;
                    r --;
                    
                    while(l < r && nums[l] == nums[l-1]) {
                        l++;
                    }
                } 
            }
        }
        return result;
    }
}
