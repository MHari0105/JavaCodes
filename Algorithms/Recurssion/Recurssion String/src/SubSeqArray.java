
import java.util.ArrayList;

public class SubSeqArray {
    public static void main(String[] args) {

        System.out.println(subSet("", "abc"));
    }

    static ArrayList<String> subSet(String p, String up) {
        if (up.isEmpty()) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        char ch = up.charAt(0);
        ArrayList<String> left = subSet(p + ch, up.substring(1));
        ArrayList<String> right = subSet(p, up.substring(1));

        left.addAll(right);
        return left;
    }
}
