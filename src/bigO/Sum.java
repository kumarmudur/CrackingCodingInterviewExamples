package bigO;

public class Sum {
    public static int sum(int n) {
        if (n <= 0) return 0;
        return n + sum(n - 1);
    }

    public static int sum1(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        return sum;
    }

    public static int pairSumSequence(int n) {
        int sum = 0;
        for (int i = 0; i <= n; i++) {
            sum += pairSum(i, i + 1);
        }
        return sum;
    }

    static int f(int n) {
        if (n <= 1) return 1;
        return f(n - 1) + f(n - 1);
    }

    static int pairSum(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        System.out.println(pairSumSequence(5));
    }
}
