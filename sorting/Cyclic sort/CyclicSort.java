import java.util.Arrays;

public class CyclicSort {
    public static void main(String[] args) {
        int[] arr = {};

        // for (int i : arr) {
        // System.out.println(i);
        // }
        int miss = firstMissingPositive(arr);
        System.out.println(miss);
    }

    public static int firstMissingPositive(int[] nums) {
        int i = 0;
        while (i < nums.length) {
            
            int correctIndex = nums[i] - 1;
            if (nums[i] > 0 && nums[i] <= nums.length && nums[i] != nums[correctIndex]) {
                int temp = nums[i];
                nums[i] = nums[correctIndex];
                nums[correctIndex] = temp;
            } else {
                i++;
            }
        }

        System.out.println(Arrays.toString(nums));
        for (i = 0; i < nums.length; i++) {

            if (nums[i] != (i + 1)) {
                return (i + 1);
            }
        }
        return (nums.length+1);
    }

    public static void cyclicSort(int[] nums) {
        int i = 0;
        //just remmeber correct position of any number is that number -1
            // for example [4,3,2,1] :- 4 should be at positon i = 3 means arr[3] = 4
            // so correctIndex = arr[i] - 1
            // so in sorted array 1 should present at 0
            // then check will apply as this :- arr[correctIndex] = arr[i]
        while (i < nums.length) {
            int correctIndex = nums[i] - 1;
            if (nums[i] != nums[correctIndex]) {
                swap(i, nums);
            } else {
                i++;
            }
        }
    }

    public static void swap(int i, int[] nums) {
        int correctIndex = nums[i] - 1;
        int temp = nums[i];
        nums[i] = nums[correctIndex];
        nums[correctIndex] = temp;
    }
}
