
public class Q3_Sum {
    public static void main(String[] args) {
        System.out.println(add(5));
        System.out.println(sumOfDigits(1342));
        System.out.println(productDigits(1342));
    }

    static int add(int n) {
        if (n <= 1)
            return 1;
        return n + add(n-1);
    }

    // 1342 -> 1+3+4+2 = 10
    static int sumOfDigits(int n) {
        if (n == 0)                                     // 1 + sumOfDigits(342)
            return 0;                                   // 3 + sumOfDigits(42)
        return (n%10) + sumOfDigits(n/10);           // 4 + sumOfDigits(2)
    }

    static int productDigits(int n) {
        if (n%10 == n)
            return n;
        return (n%10) * productDigits(n/10);
    }
}
