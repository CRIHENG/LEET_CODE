
/**
 * Given n non-negative integers a1, a2, ..., an, 
 * where each represents a point at coordinate (i, ai).
 * n vertical lines are drawn such that the two 
 * endpoints of line i is at (i, ai) and (i, 0). Find two lines, 
 * which together with x-axis forms a container, 
 * such that the container contains the most water.*/

public class ContainerWithMostWater {

    public static int maxArea(int[] height) {
        
        int vol=0,l=0,r=height.length-1;
        
        while (l<r){
            vol=Math.max(vol,Math.min(height[l],height[r])*(r-l));
            
            if(height[l]<height[r]){
                l++;
            }else {
                r--;
            }
        }
        
        
        return vol;
    }

    public static void main(String[] args) {
        
        int [] a={1,2,3,4,5,6,11};
        System.out.println(maxArea(a));
        
    }
}