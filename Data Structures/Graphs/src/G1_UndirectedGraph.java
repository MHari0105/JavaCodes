
import java.util.ArrayList;

public class G1_UndirectedGraph {
    public static void main(String[] args) {

        // VERTICES AND EDGES
        int v = 3, e = 3;
        ArrayList<ArrayList<Integer>> adj = new ArrayList<ArrayList<Integer>>();

        // V + 1
        for (int i=0; i<=v; i++)
            adj.add(new ArrayList<Integer>());

        // EDGES 1-2
        adj.get(0).add(2);
        adj.get(1).add(1);

        // EDGES 2-3
        adj.get(1).add(3);
        adj.get(2).add(2);

        // EDGES 3-1
        adj.get(2).add(1);
        adj.get(0).add(3);

        // PRINT ALL THE EDGES
        for (int i=0; i<v; i++) {
            for (int j=0; j<adj.get(i).size(); j++) {
                System.out.print(adj.get(i).get(j) + " ");
            }
            System.out.println();
        }
    }
}
