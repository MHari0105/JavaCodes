
public class Q4_Fibonacci {
    public static void main(String[] args) {
        int position = 4;
        int ans = fibonacci(position);
        System.out.println("At " + position +"th position fibonacci value is : " +ans);

        for (int i=0; i<11; i++) {
            System.out.println(fiboFormula(i));
        }

        System.out.println(fiboFormula(50));
    }

    static int fiboFormula(int n) {
        return (int)((Math.pow(((1 + Math.sqrt(5)) / 2), n) - Math.pow(((1 - Math.sqrt(5)) / 2), n)) / Math.sqrt(5));
    }

    static int fibonacci(int n) {
        if (n < 2)
            return n;
        int i = fibonacci(n-1) + fibonacci(n-2);
        return i;
    }
}
