package bigO;

public class Example5 {

    // time: O(N * M)
    static void printUnorderedPairs(int[] arrA, int[] arrB) {
        for (int i : arrA) {
            for (int j : arrB) {
                for (int k = 0; k < 100000; k++) {
                    System.out.println(i + " " + j + " " + k);
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
