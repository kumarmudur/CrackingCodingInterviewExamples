package bigO;

public class Example4 {

    // time: O(N * M)
    static void printUnorderedPairs(int[] arrA, int[] arrB) {
        for (int i : arrA) {
            for (int j : arrB) {
                if (i < j) {
                    System.out.println(i + " " + j);
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] arrA = { 1, 2, 3, 4, 5 };
        int[] arrB = { 1, 2, 3, 4, 5 };
        printUnorderedPairs(arrA, arrB);
    }
}
