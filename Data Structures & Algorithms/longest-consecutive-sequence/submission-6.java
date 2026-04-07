class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet<>();

        for(int i : nums) {
            set.add(i);
        }

        int maxCnt = 0, cnt = 0;
        for(int i : nums) {
            if(!set.contains(i-1)) {
                while(set.contains(i++)) {
                    cnt++;
                }
                if(cnt > maxCnt) {
                    maxCnt = cnt;
                }
                cnt = 0;
            }
        }

        return maxCnt;
    }
}
