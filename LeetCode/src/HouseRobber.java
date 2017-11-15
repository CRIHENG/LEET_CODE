/**
 * Created by githu on 2017/11/15.
 */
public class HouseRobber {

    public static int rob(int[] nums) {
        
        if(nums.length==0||nums==null){
            return 0;
        }
        switch (nums.length){
            case 1:
                return nums[0];
            case 2:
                return max(nums[0],nums[1]);
        }
        if(nums.length>2){
            nums[2]+=nums[0];
        }
        int i=3;
        for(;i<nums.length;i++){
            nums[i]+=max(nums[i-2],nums[i-3]);
        }
        return max(nums[i-1],nums[i-2]);
        
    }
    public static int max(int a, int b) {
        return (a >= b) ? a : b;
    }
}
