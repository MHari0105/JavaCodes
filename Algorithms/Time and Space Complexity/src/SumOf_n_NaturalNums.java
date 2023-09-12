
// TIME AND EFFICIENCY OF A PROGRAM ARE INVERSELY PROPORTIONAL

public class SumOf_n_NaturalNums {
    public static void main(String[] args) {

        int ans1 = approachOne(8);
        int ans2 = approachTwo(8);
        int ans3 = approachThree(8);

        System.out.println(ans1);
        System.out.println(ans2);
        System.out.println(ans3);
    }

    // TAKES MORE TIME FOF THE COMPUTER TO APPROACH
    static int approachOne(int n) {
        int sum = 0;
        for (int i=1; i<=n; i++) {
            for (int j=1; j<=i; j++) {
                sum++;
            }
        }
        return sum;
    }

    // THIS APPROACH TAKES WAY LESSER TIME COMPLEXITY THAN THE ABOVE
    static int approachTwo(int n) {
        int sum = 0;
        for (int i=1; i<=n; i++) {
            sum += i;
        }
        return sum;
    }

    // THIS TAKES THE LEAST TIME COMPLEXITY WHEN COMPARED TO BOTH
    static int approachThree(int n) {
        int sum = 0;
        sum = n*(n+1)/2;
        return sum;
    }

}

