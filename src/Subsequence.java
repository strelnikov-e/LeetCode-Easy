public class Subsequence {

    /*
    A subsequence of a string is a new string that is formed from the original string by deleting some
    (can be none) of the characters without disturbing the relative positions of the remaining characters.
    (i.e., "ace" is a subsequence of "abcde" while "aec" is not).
     */
    public static boolean isSubsequence(String s, String t) {
        int j = 0;
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            while (j < t.length()) {
                if (c == t.charAt(j)) {
                    stringBuilder.append(c);
                    j++;
                    break;
                }
                j++;
            }
        }
        return s.equals(stringBuilder.toString());
    }

    public static void main(String[] args) {

        System.out.println(isSubsequence("ace", "abcdef"));
        System.out.println(isSubsequence("acg", "abcdef"));
    }
}
