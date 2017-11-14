import java.util.HashMap;
import java.util.Map;

/**
 * Created by githu on 2017/10/26.
 */
/*
* Given an array of integers, return indices of the two numbers
 * such that they add up to a specific target.
 
  You may assume that each input would have exactly one solution,
  and you may not use the same element twice.
* 
* */
public class TwoSum {
    /*
    * 解题思路：遍历数组，讲数组里的某元素 与总数相减，
    * 得到的值。把这个值，和当前的数组的位置存下
    * ，然后找剩下数组的元素与刚存下的是否存在；
    * 
    * */
    
    public   static  int[] twoSum(int[] array,int sum){
        Map<Integer,Integer> saveElement  =new HashMap<>();
        for(int i=0;i<array.length;i++){
            if(saveElement.containsKey(array[i])){
                return  new int[]{saveElement.get(array[i]),i};
            }else {
                saveElement.put(sum-array[i],i);
            }
            
        }
        return null;
    }
}
