package bigO;

public class Example13 {

    // time:O(2^N)
    static int calculateFib(int n) {
        if (n <= 0) return 0;
        else if (n == 1) return 1;
        return calculateFib(n - 1) + calculateFib(n -2);
    }

    public static void main(String[] args) {
        System.out.println(calculateFib(10));
    }
}
