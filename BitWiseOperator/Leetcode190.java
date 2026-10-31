public class Leetcode190 {
    public static void main(String[] args) {
        int n = 43261596;
        int value = reverseBits(n) ;
        System.out.println(value);
    }

    public static int reverseBits(int n) {
        int[] tempArray = new int[32];
        for(int i = 0;i<32;i++){
            int lastIndex = n & 1;
            tempArray[i] = lastIndex;
            n = n>>1;
        }
        int ans = 0;
        for(int i = 0;i<32;i++){
            ans = ans | (tempArray[i] << (31-i));
        }
        return ans;
    }
}
