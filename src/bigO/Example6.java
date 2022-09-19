package bigO;

import java.util.Arrays;

public class Example6 {

    // time: O(N)
    static int[] reverse(int[] arr) {
        int length = arr.length;
        for (int i = 0; i < length / 2; i++) {
            int other = length - i - 1;
            int temp = arr[i];
            arr[i] = arr[other];
            arr[other] = temp;
        }
        return arr;
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(reverse(arr)));
    }
}
