
import java.util.Arrays;

public class SearchStrings {
    public static void main(String[] args) {

        String name = "Britania";
        char target = 'n';

        boolean answer = search(name, target);
        System.out.println(answer);

        System.out.println(Arrays.toString(name.toCharArray()));
        boolean answer2 = search2(name, target);
        System.out.println(answer2);
    }

    static boolean search(String s, char value) {
        for (int i=0; i<s.length(); i++) {
            if (s.charAt(i) == value)
                return true;
        }
        return false;
    }

    static boolean search2(String s, char target) {
        for (char ch : s.toCharArray()) {
            if (ch == target)
                return true;
        }
        return false;
    }
}
