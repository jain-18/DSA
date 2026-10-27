// write a code to check whether an array contains pair of number or not and tell which number is not in pair

public class PairOfNumber {
    public static void main(String[] args) {
        int[] arr = {2,3,4,5,6,6,5,4,3,2,1,1,8};
        int num = nothavingPair(arr);
        System.out.println(num);
    }

    private static int nothavingPair(int[] arr) {
        int a = 0;
        for(int i = 0;i < arr.length;i++){
            a = arr[i] ^ a;
        }
        return a;
    }
}
