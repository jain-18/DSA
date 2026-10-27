// 1. write a code to get ith index of a number after converting it to binary number.
// 2. set ith bit means make it 1 if it 0 make it 1 if it is one
class IbifOfNumber{
    public static void main(String[] args) {
        System.out.println(IBitNumber(10,4));
        System.out.println(setIthBit(10, 1));
        System.out.println(resetIthBit(10, 2));
    }

    static int IBitNumber(int n,int i) {
        return (n >> (i - 1)) & 1;
    }

    static int setIthBit(int n,int i){
        return n | (1 << (i - 1));
    }

    static int resetIthBit(int n, int i){
        return n & ~(1<<(i-1));
    }
}