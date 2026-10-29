public class XORInRange {
    public static void main(String[] args) {
        int a = 3;
        int b = 10;
        
        int ans1 = xOrInRanges(b);
        int ans2 = xOrInRanges(a-1);
        System.out.println(ans1^ans2);

        // ans = XOR(b) ^ XOR(a-1)
        // XOR(a-1) will cancel out the numbers from 0 to a-1 and we will be left with the numbers from a to b
    


    }

    private static int xOrInRanges(int n){
        if(n % 4 == 0){
            return n;
        }else if(n%4==1){
            return 1;
        }else if(n%4==2){
            return (n +1);
        }else{
           return 0;
        }
    }
}
