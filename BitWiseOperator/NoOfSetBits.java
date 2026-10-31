// write a program to count the number of set bits in a number
// LeetCode 191

public class NoOfSetBits {
    public static void main(String[] args) {
        int n = 10;
        int count = 0;
        while(n>0){
            if((n & 1)==1){
                count++;
            }
            n = n >> 1;
        }
        System.out.println(count);
        System.out.println(setBits(27));
        System.out.println(Integer.toBinaryString(27));
        System.out.println(setBits2(10));
    }

    private static int setBits(int n){
        int count = 0;
        while(n>0){
            count ++;
            n = n -  (n & (-n));
        }
        return count;
    }

    private static int setBits2(int n){
        int count = 0;
        while(n>0){
            count ++;
            n = n & (n-1);
        }
        return count;
    }
}
