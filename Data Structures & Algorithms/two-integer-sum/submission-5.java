class Solution {
    public int[] twoSum(int[] nums, int target) {
        
        Map<Integer, Integer> map = new HashMap<>();
        int k = 0;
        for(int i : nums) {
            int remain = target - i;

            if(map.containsKey(remain)) {
                return new int[] {map.get(remain), k};
            }
            else {
                map.put(i, k);
            }
            k++;
        }
        return null;
    }
}
