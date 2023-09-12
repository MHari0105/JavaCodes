
public class Q1 {
    public static void main(String[] args) {
        printDescending(5);
        System.out.println();

        printAscending(5);
        System.out.println();

        printBothWays(5);
        System.out.println();
    }

    // N : 5, Print Numbers from N to 1
    static void printDescending(int n1) {
        if (n1 == 0)
            return;
        System.out.print(n1 + " ");
        printDescending(n1-1);
    }

    // Print 1 to N
    static void printAscending(int n2) {
        if (n2 == 0)
            return;
        printAscending(n2-1);
        System.out.print(n2 + " ");
    }

    static void printBothWays(int n3) {
        if (n3 == 0)
            return;
        System.out.print(n3 + " ");
        printBothWays(n3-1);
        System.out.print(n3 + " ");
    }
}
