public class NextGreaterElement {
    public static int[] nextGreater(int[] nums){
        int n = nums.length; int[] res = new int[n]; java.util.Stack<Integer> st = new java.util.Stack<>();
        for (int i = n-1; i>=0; i--){ while(!st.isEmpty() && st.peek()<=nums[i]) st.pop(); res[i]=st.isEmpty()?-1:st.peek(); st.push(nums[i]); }
        return res;
    }
    public static void main(String[] args){ System.out.println(java.util.Arrays.toString(nextGreater(new int[]{2,1,2,4}))); }
}
