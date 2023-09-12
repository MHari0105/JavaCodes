
public class Pattern5 {

    static void patternFive(int n) {
        for (int row=1; row<=n; row++) {
            for (int col=1; col<=row; col++) {
                System.out.print("x ");
            }
            System.out.println();
        }

        for (int row=0; row<n; row++) {
            for (int col=1; col<n-row; col++) {
                System.out.print("x ");
            }
            System.out.println();
        }
    }
}
