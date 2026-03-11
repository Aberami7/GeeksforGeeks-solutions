class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
           int x = 0;
        int count = 0;

        for (int num : nums) {
            if (num == 1) {
                count++;               
                x = Math.max(x, count);
            } else {
                count = 0;             
            }
        }
        return x;
    }
        
    }
