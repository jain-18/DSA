public class MagicNumber {
    public static void main(String[] args) {
        int number = 6;
        System.out.println(isMagicNumber1(number));
        System.out.println(isMagicNumber2(number));
    }
    static int isMagicNumber1(int n){
        int ans = 0;
        for(int i = 0; i< 32;i++){
            if((n>>i & 1) != 0){
                ans = ans + (int)Math.pow(5, i+1);
            }
        }
        return ans;
    }
    static int isMagicNumber2(int n){
        int ans = 0;
        int base = 5;
        while(n>0){
            int last = n & 1;
            n = n >> 1;
            ans += last * base;
            base = base * 5;
        }
        return ans;
    }
}
