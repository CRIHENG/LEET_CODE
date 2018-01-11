import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class ThreeSum {
    public static List<List<Integer>> threeSum(int[] nums) {
        int i;
        List<List<Integer>> outList=new ArrayList<>();
       for(i=0;i<nums.length;i++) {
           Map<Integer, Integer> cache_ = new HashMap<>();
           for (int j = 0; j < nums.length; i++) {
               if(nums[i]!=nums[j]&&i!=j){
                   
               }
               if (cache_.containsKey(nums[i])) {
                   List<Integer> innerList = new ArrayList<>();
                   if (nums[cache_.get(nums[j])] + nums[j] == -nums[i]) {
                       innerList.add(nums[cache_.get(nums[i])]);
                       innerList.add(nums[i]);
                       innerList.add(nums[i]);
                       outList.add(innerList);
                   }
               } else {
                   cache_.put(-(nums[i] - nums[i]), i);
               }
           }

       }
      return outList;
    }

    public static void main(String[] args) {
        int[] nums={-1, 0, 1, 2, -1, -4};
        System.out.println(threeSum(nums));
    }
}