public class Pattern2 {

    static void patternTwo(int n) {
        for (int row=1; row<=n; row++) {
            for (int col=1; col<=row; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
