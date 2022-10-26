import java.util.HashSet;
import java.util.Set;

class Solution {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<>();
        int j = nums.length-1;
        for(int i=0;i<j+1; i++) {
            set.add(nums[i]);
        }
        if(set.size() < nums.length) {
            return true;
        } else return false;
    }
}