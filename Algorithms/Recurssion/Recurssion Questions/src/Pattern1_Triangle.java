
public class Pattern1_Triangle {
    public static void main(String[] args) {
        System.out.print("Right Triangle");
        rightTriangle(4, 0);

        System.out.println("\n\n===============================================================\n");

        System.out.println("Upside Down Right Triangle");
        upSideDownRightTriangle(4, 0);
    }


    static void rightTriangle(int row, int column) {
        if (row == 0)
            return;
        if (column < row) {
            rightTriangle(row, column+1);
            System.out.print("* ");
        }
        else {
            rightTriangle(row-1, 0);
            System.out.println();
        }
    }

    static void upSideDownRightTriangle(int row, int column) {
        if (row == 0)
            return;
        if (column < row) {
            System.out.print("* ");
            upSideDownRightTriangle(row, column+1);
        }
        else {
            System.out.println();
            upSideDownRightTriangle(row-1, 0);
        }
    }
}
