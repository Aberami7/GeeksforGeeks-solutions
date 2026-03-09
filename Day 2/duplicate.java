import java.util.*;
public class duplicate {
    class Solution {
    public boolean hasDuplicate(int[] nums) {
     Arrays.sort(nums);
     int count=1;
     for(int i=1;i<nums.length;i++)
     {
        if(nums[i]==nums[i-1])
        {
            count++;
        }
     }
     return count>1;
        
    }
}
    
}
