class Solution {
    public int maxArea(int[] heights) {
        int i = 0, j = heights.length - 1;

        int max = 0;
        while(i < j) {
            int distance = j - i;
            int n1 = heights[i];
            int n2 = heights[j];
            
            int count = 0;
            if(n1 <= n2) {
                count = n1 * distance;
                i++;
            }
            else {
                count = n2 * distance;
                j--;
            }

            if(count > max) {
                max = count;    
            }
        }

        return max;
    }
}
