
public class Q6_Palindrome {

    static boolean checkNumber(int num) {
        if (num < 0)
            return false;
        int value = num;
        int reversed = reversedNum(num, 0);
        return value == reversed;
    }

    private static int reversedNum(int num, int reversed) {
        if (num == 0)
            return reversed;
        int last = num % 10;
        reversed = reversed * 10 + last;
        return reversedNum(num / 10, reversed);
    }


    static boolean checkString(String str) {
        return reversedString(str, 0, str.length()-1);
    }

    private static boolean reversedString(String str, int start, int end) {
        if (start >= end)
            return true;

        if (str.charAt(start) != str.charAt(end))
            return false;

        return reversedString(str, start+1, end-1);
    }


    public static void main(String[] args) {

        int number = 612216;
        if (checkNumber(number))
            System.out.println(number + " is a Palindrome");
        else System.out.println(number + " is not a Palindrome");

        String s = "malyalam";
        if (checkString(s))
            System.out.println(s + " is a Palindrome");
        else System.out.println(s + " is not a palindrome");

    }

}
