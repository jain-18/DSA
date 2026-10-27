// write a code to calculate the sum of the number till nth row
public class PascalTriangle {
    public static void main(String[] args) {
        int n = 5;
        System.out.println(sumOfNthRow(n));
    }

    private static int sumOfNthRow(int n) {
        return (int)(1 << (n-1));
    }


}
