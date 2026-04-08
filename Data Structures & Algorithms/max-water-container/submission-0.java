class Solution {
    public int maxArea(int[] heights) {
        int i = 0, j = heights.length - 1;

        int max = 0;
        while(i < j) {
            int distance = j - i;
            int n1 = heights[i];
            int n2 = heights[j];

            int count = Math.min(n1, n2) * distance;

            if(count > max) {
                max = count;    
            }

            if(n1 <= n2) {
                i++;
            }
            else {
                j--;
            }
        }

        return max;
    }
}
