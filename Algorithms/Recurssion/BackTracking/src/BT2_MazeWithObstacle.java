
public class BT2_MazeWithObstacle {
    public static void main(String[] args) {
        boolean[][] mazeBoard = {
            //    0      1     2
                {true, true, true},   // 0
                {true, false, true},  // 1
                {true, true, true},   // 2
        };
        riverInBetween("", mazeBoard, 0, 0);
    }

    static void riverInBetween(String path, boolean[][] maze, int row, int col) {
        if (row == maze.length-1 && col == maze[0].length-1) {
            System.out.println(path);
            return;
        }

        if (! maze[row][col])
            return;

        if (row < maze.length-1)
            riverInBetween(path+'D', maze, row+1, col);

        if (col < maze[0].length-1)
            riverInBetween(path+'R', maze, row, col+1);
    }
}


/*
    O-Path, X-Obstacle
               0 1 2
    Maze : 0 [ 0 0 0 ]
           1 [ O X O ]
           2 [ O O O ]
 */