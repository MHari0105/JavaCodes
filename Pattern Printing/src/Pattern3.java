public class Pattern3 {

    static void patternThree(int n) {
        for (int row=0; row<n; row++) {
            for (int col=0; col<n-row; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
