public class BinarySearch {
    public static int binarySearch(int[] arr, int target) {
        int l = 0, r = arr.length - 1;
        while (l <= r) {
            int m = l + (r - l) / 2;
            if (arr[m] == target) return m;
            if (arr[m] < target) l = m + 1; else r = m - 1;
        }
        return -1;
    }
    public static void main(String[] args) { System.out.println("BinarySearch example"); }
}
