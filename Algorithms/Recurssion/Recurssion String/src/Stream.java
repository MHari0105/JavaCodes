public class Stream {
    public static void main(String[] args) {

        skip("", "abacadae");
        System.out.println(returnSkip("afagahai"));
        System.out.println(skipString("jklstringmn"));
    }

    static void skip(String processed, String unProcessed) {
        if (unProcessed.isEmpty()) {
            System.out.println(processed);
            return;
        }
        char ch = unProcessed.charAt(0);
        if (ch == 'a')
            skip(processed, unProcessed.substring(1));
        else skip(processed+ch, unProcessed.substring(1));
    }

    static String returnSkip(String unPro) {
        if (unPro.isEmpty())
            return "";

        char ch = unPro.charAt(0);
        if (ch == 'a')
            return returnSkip(unPro.substring(1));
        else return ch + returnSkip(unPro.substring(1));
    }

    static String skipString(String str) {
        if (str.isEmpty())
            return "";

        if (str.startsWith("string"))
            return skipString(str.substring(6));
        else return str.charAt(0) + skipString(str.substring(1));
    }
}