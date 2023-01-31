import java.util.Arrays;

public class IsomorphicString {

    /*
    Two strings s and t are isomorphic if the characters in s can be replaced to get t.
     */
    public static boolean isIsomorphic(String s, String t) {
        if (s.length() != t.length()) return false;

        // create auxiliary arrays and populate it with -1
        int[] mappingToS = new int[256];
        int[] mappingToT = new int[256];

        Arrays.fill(mappingToS, -1);
        Arrays.fill(mappingToT, -1);

        for (int i = 0; i < s.length(); i++) {
            char cs = s.charAt(i);
            char ct = t.charAt(i);

            if (mappingToS[cs] == -1 && mappingToT[ct] == -1 ) {
                mappingToS[cs] = ct;
                mappingToT[ct] = cs;
            }
            else {
                if (!(mappingToS[cs] == ct && mappingToT[ct] == cs)) return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(isIsomorphic("pop","sos"));

        System.out.println(isIsomorphic("pot","sos"));
    }
}
