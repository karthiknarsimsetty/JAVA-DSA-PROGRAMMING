public class Anagram {
    public static boolean isAnagram(String s1, String s2) {
        if (s1.length() != s2.length()) return false;
        int[] cnt = new int[256];
        for (int i = 0; i < s1.length(); i++) { cnt[s1.charAt(i)]++; cnt[s2.charAt(i)]--; }
        for (int c : cnt) if (c != 0) return false;
        return true;
    }
    public static void main(String[] args) { System.out.println(isAnagram("listen","silent")); }
}
