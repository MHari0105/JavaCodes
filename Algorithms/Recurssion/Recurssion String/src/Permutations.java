public class Permutations {
    public static void main(String[] args) {
        permutations("", "abc");
    }

    static void permutations(String p, String up) {
        if (up.isEmpty()) {
            System.out.println(p);
            return;
        }

        char ch = up.charAt(0);
        for (int i=0; i<=p.length(); i++) {
            String first = p.substring(0, i);
            String second = p.substring(i, p.length());
            permutations(first + ch + second, up.substring(1));
        }
    }
}

/*
* Permutations of abc = cba, bca, bac, cab, acb, abc
*
* i.e. How many permutations is possible ? - factorial of length of the word
* abc.length() - 3 so number of permutations possible = 3! = 3 x 2 x 1 = 6
*
* How many times recursion should happen ? - No of times the size of the word
*
 */