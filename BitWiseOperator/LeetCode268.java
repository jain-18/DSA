public class LeetCode268 {
    public static void main(String[] args) {
        int[] nums = {3,0,1};
        System.out.println(missingNumber(nums));
    }
    public static int missingNumber(int[] nums) {
        int ans = 0;
        for(int i = 0; i<nums.length;i++){
            ans = ans ^ nums[i] ^ (i+1);
        }
        return ans;
    }
}
