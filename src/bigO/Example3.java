package bigO;

public class Example3 {

    // time: O(N^2)
    static void printPairs(int[] arr) {
        int length = arr.length;
        for (int i = 0; i < length; i++) {
            for (int j = i + 1; j < length; j++) {
                System.out.println(arr[i] + " " + arr[j]);
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        printPairs(arr);
    }
}
