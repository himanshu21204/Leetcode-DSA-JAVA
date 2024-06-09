package Easy;
// https://leetcode.com/problems/contains-duplicate/description/
import java.util.HashSet;

public class Contains_Duplicate_217 {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for(int num : nums){
            if(set.contains(num)){
                return true;
            }
            set.add(num);
        }
        return false;
    }
}
