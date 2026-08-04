import java.util.Arrays;

public class ArraySum {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int sum = 0;
        for (int v : arr) sum += v;
        System.out.println("Array: " + Arrays.toString(arr));
        System.out.println("Sum: " + sum);
    }
}
