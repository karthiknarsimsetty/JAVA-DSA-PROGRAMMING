public class BalancedParentheses {
    public static boolean isBalanced(String s){
        java.util.Deque<Character> st = new java.util.ArrayDeque<>();
        for (char c: s.toCharArray()){
            if (c=='('||c=='['||c=='{') st.push(c);
            else{
                if (st.isEmpty()) return false;
                char t = st.pop();
                if ((c==')'&&t!='(')||(c==']'&&t!='[')||(c=='}'&&t!='{')) return false;
            }
        }
        return st.isEmpty();
    }
    public static void main(String[] args){ System.out.println(isBalanced("([{}])")); }
}
