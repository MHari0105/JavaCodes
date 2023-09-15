
public class Ascii {
    public static void main(String[] args) {

        System.out.println("Ascii a value : " + ('a' + 0));
        System.out.println("Ascii b value : " + ('a' + 1));
        System.out.println("Ascii c value : " + ('a' + 2));

        subSeqAscii("", "abc");
    }

    static void subSeqAscii(String p, String up) {
        if (up.isEmpty()) {
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);
        subSeqAscii(p+ch, up.substring(1));
        subSeqAscii(p, up.substring(1));
        subSeqAscii(p+(ch+0), up.substring(1));
    }
}
