public class Pattern4 {

    static void patternFour(int n) {
        for (int row=1; row<=n; row++) {
           for (int col=1; col<=row; col++) {
               System.out.print(col+" ");
           }
            System.out.println();
        }
    }
}
