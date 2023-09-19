import java.util.ArrayList;

public class BT1_Maze {
    public static void main(String[] args) {

        System.out.println(count(3, 3));
        System.out.println(allPaths("", 3, 3));
        System.out.println(moveDiagonal("", 3, 3));
    }

    static int count(int row, int col) {
        if (row == 1 || col == 1)
            return 1;
        int left = count(row-1, col);
        int right = count(row, col-1);
        return left + right;
    }



    static ArrayList<String> allPaths(String path, int row, int col) {
        if (row == 1 && col == 1) {     // reached the destination path
            ArrayList<String> list = new ArrayList<>();
            list.add(path);
            return list;
        }

        ArrayList<String> list = new ArrayList<>();

        if (row > 1)    // DOWN
            list.addAll(allPaths(path+'D', row-1, col));

        if (col > 1)    // RIGHT
            list.addAll(allPaths(path+'R', row, col-1));

        return list;
    }



    static ArrayList<String> moveDiagonal(String path, int row, int col) {
        if (row == 1 && col == 1) {
            ArrayList<String> list = new ArrayList<>();
            list.add(path);
            return list;
        }

        ArrayList<String> list = new ArrayList<>();

        if (row > 1 && col > 1)     // DIAGONAL
            list.addAll(moveDiagonal(path+'D', row-1, col-1));

        if (row > 1)    // VERTICAL
            list.addAll(moveDiagonal(path+'V', row-1, col));

        if (col > 1)    // HORIZONTAL
            list.addAll(moveDiagonal(path+'H', row, col-1));

        return list;
    }
}

/*
Calculate total number of parts b/w X to Y
       3   2   1
     _____________
  3  | X |   |   |
     ----+---+----
  2  |   |   |   |
     ----+---+----
  1  |   |   | Y |
     -------------
 */
