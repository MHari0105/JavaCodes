
// BACKTRACKING

public class BT3_MazeAllDirections {
    public static void main(String[] args) {

        boolean[][] mazeBoard = {
                //    0      1     2
                {true, true, true},   // 0
                {true, true, true},  // 1
                {true, true, true},   // 2
        };
        allPaths("", mazeBoard, 0, 0);
    }

    static void allPaths(String p, boolean[][] maze, int row, int col) {
        if (row == maze.length-1 && col == maze[0].length-1) {
            System.out.println(p);
            return;
        }

        if (! maze[row][col])
            return;

        // WHEN A PARTICULAR CELL OF THE MAZE IS VISITED MARK IT AS FALSE SO THAT,
        // TRAVELLING BACK TO SAME CELLS AGAIN AND AGAIN WON'T HAPPEN
        maze[row][col] = false;

        // DOWN
        if (row < maze.length-1)
            allPaths(p+'D', maze, row+1, col);

        // RIGHT
        if (col < maze[0].length-1)
            allPaths(p+'R', maze, row, col+1);

        // UP
        if (row > 0)
            allPaths(p+'R', maze, row-1, col);

        // LEFT
        if (col > 0)
            allPaths(p+'L', maze, row, col-1);

        // AFTER ONE TRAVERSAL IS COMPLETED MAKE THE CELL VISIBLE BY SETTING IT TO TRUE,
        // SO THAT NEXT PATH CAN VISIT THE CELL
        maze[row][col] = true;

    }
}
