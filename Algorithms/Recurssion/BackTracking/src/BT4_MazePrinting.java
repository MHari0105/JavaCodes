import java.util.Arrays;

public class BT4_MazePrinting {
    public static void main(String[] args) {

        boolean[][] mazeBoard = {
                //    0      1     2
                {true, true, true},   // 0
                {true, true, true},  // 1
                {true, true, true},   // 2
        };
        int[][] path = new int[mazeBoard.length][mazeBoard[0].length];
        printAllPaths("", mazeBoard, 0, 0, path, 1);
    }

    static void printAllPaths(String p, boolean[][] maze, int row, int col, int[][] path, int step ) {
        if (row == maze.length - 1 && col == maze[0].length - 1) {
            path[row][col] = step;
            for (int[] arr : path) {
                System.out.println(Arrays.toString(arr));
            }
            System.out.println(p + "\n");
            return;
        }

        if (!maze[row][col])
            return;

        maze[row][col] = false;
        path[row][col] = step;

        // DOWN
        if (row < maze.length - 1)
            printAllPaths(p + 'D', maze, row + 1, col, path, step+1);

        // RIGHT
        if (col < maze[0].length - 1)
            printAllPaths(p + 'R', maze, row, col + 1, path, step+1);

        // UP
        if (row > 0)
            printAllPaths(p + 'R', maze, row - 1, col, path, step+1);

        // LEFT
        if (col > 0)
            printAllPaths(p + 'L', maze, row, col - 1, path, step+1);

        maze[row][col] = true;
        path[row][col] = 0;
    }
}
