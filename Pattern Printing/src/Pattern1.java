public class Pattern1 {

    static void patternOne(int n) {
        for (int row=0; row<n; row++) {
            for (int col=0; col<n; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
