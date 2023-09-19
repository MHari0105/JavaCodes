
public class N_Queens {
    public static void main(String[] args) {

        // YET TO COMPLETE
    }

    static int nQueens(boolean[][] board, int row) {
        if (row == board.length) {
            display(board);
            return 1;
        }
        return 1;
    }

    private static void display(boolean[][] board) {
        for (boolean[] row : board) {
            for (boolean element : row) {
                if (element)
                    System.out.println("Q");
                else System.out.println("X");
            }
        }
    }

}
