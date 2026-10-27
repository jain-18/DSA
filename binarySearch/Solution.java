import java.util.Arrays;
import java.util.HashSet;

public class Solution {

    public static void main(String[] args) {
        int[] arr = {-1,0,2,3};
        // System.out.println(maximumCount(arr));
    }
    public int getCommon(int[] nums1, int[] nums2) {
         if(nums1[nums1.length-1]<nums2[0])return -1;
        int i = 0,j=0;

        while(i<nums1.length && j<nums2.length){
            if(nums1[i]==nums2[j]){
                return nums1[i];
            }
            if(nums1[i]<nums2[j]){
                i++;
            }else{
                j++;
            }
        }

        return -1;
    }
}
