//write a code for finding out a number which appearing
// once in the arrany and rest all are appearing thrice in the array.

public class OnceAndThriceNum {
    public static void main(String[] args) {
        int[] arr = { 2, 2, 3, 2, 7, 7, 8, 7, 8, 8 };
        System.out.println(findNumberWhichAppearingOnce(arr));
    }

    private static int findNumberWhichAppearingOnce(int[] arr) {
        int ans = 0;
        for (int i = 0; i < 32; i++) {
            int count = 0;
            for (int n : arr) {
                System.out.println(n +" "+ (1 << i));
                System.out.println(n & (1 << i));
                if((n & (1 << i)) != 0){
                    count++;
                }
            }
            if(count % 3 != 0){
                ans = ans | (1<<i);
            }
        }
        return ans;
    }
}
