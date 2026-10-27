
public class EvenOdd1 {
    public static void main(String[] args) {
        isOddEven(11);
    }

    private static void isOddEven(int i) {
        if((i & 1) == 1) {System.out.println("odd"); }else{System.out.println("even");}
    }
}
