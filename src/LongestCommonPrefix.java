/*
Write a function to find the longest common prefix string amongst an array of strings.
If there is no common prefix, return an empty string "".

Example 1:
Input: strs = ["flower","flow","flight"]
Output: "fl"
Example 2:

Input: strs = ["dog","racecar","car"]
Output: ""
Explanation: There is no common prefix among the input strings.
 */

public class LongestCommonPrefix {

    public String longestPrefix(String[] strings) {
        if (strings.length == 1) return strings[0];

        StringBuilder builder = new StringBuilder();
        char c;

        for (int i=0; i < strings[0].length(); i++) {
            c = strings[0].charAt(i);
            for (int j = 1; j < strings.length; j++) {
                if ((strings[j].length() <= i) || (c != strings[j].charAt(i))) return builder.toString();
            }
            builder.append(c);
        }
        return builder.toString();
    }

    public static void main(String[] args) {
        LongestCommonPrefix longestCommonPrefix = new LongestCommonPrefix();
        String[] strings = new String[]{"flower","flo","flight"};

        System.out.println(longestCommonPrefix.longestPrefix(strings));

        System.out.println(4%3);
    }
}
