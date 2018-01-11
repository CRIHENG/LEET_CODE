/**
 * 
 * There are two sorted arrays nums1 and nums2 of size m and n respectively.

 Find the median of the two sorted arrays. The overall run time complexity should be O(log (m+n)).
 * 
 * */
public class MedianOfTwoSorteArrays {
    public  static  double findMedianSortedArrays(int[] nums1, int[] nums2) {
        double result=0d;
        if(nums1.length==0&&nums2.length==0){
            return result;
        }
        int[] newArray =new int[nums1.length+nums2.length];
        int j=0,k=0,l=0; 
       
        while (j<nums1.length&&k<nums2.length){
           if(nums1[j]<nums2[k]){
               newArray[l++]=nums1[j++];
           }else {
               newArray[l++]=nums2[k++];
           }
        }
        while (j<nums1.length) newArray[l++]=nums1[j++];
        while (k<nums2.length) newArray[l++]=nums2[k++];
        
    if((newArray.length&1)!=0){
       result=(double) newArray[newArray.length/2];
    }else {
        result=((double)newArray[newArray.length/2]+(double) newArray[newArray.length/2-1])/2;
    }
    
      return  result;
        
      

    }

    public static void main(String[] args) {
        int[] o={1,2,3,4,5};
        int[] e={2,3,4,5,6,7,8,9,12,13,41,51};

        System.out.println(    findMedianSortedArrays(o,e));
        
    }
}