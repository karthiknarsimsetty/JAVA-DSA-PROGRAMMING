public class TwoSum {
    // Example: find two indices such that nums[i] + nums[j] == target
    public int[] twoSum(int[] nums, int target) {
        java.util.Map<Integer,Integer> map = new java.util.HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement)) {
                return new int[]{map.get(complement), i};
            }
            map.put(nums[i], i);
        }
        return new int[0];
    }
    public static void main(String[] args) { System.out.println("TwoSum example"); }
}
