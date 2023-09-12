
public class Q7_CountZeros {

    public static void main(String[] args) {
        System.out.println(count(30780720));
    }

    static int count(int n) {
        return helperCount(n, 0);
    }

    private static int helperCount(int n, int count) {
        if (n == 0)
            return count;
        int rem = n % 10;
        if (rem == 0)
            return helperCount(n/10, count+1);
        else return helperCount(n/10, count);
    }
}
