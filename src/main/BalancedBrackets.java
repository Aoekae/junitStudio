package main;


import java.util.ArrayList;

public class BalancedBrackets {
    /**
     * The function BalancedBrackets should return true if and only if
     * the input string has a set of "balanced" brackets.
     *
     * That is, whether it consists entirely of pairs of opening/closing
     * brackets (in that order), none of which mis-nest. We consider a bracket
     * to be square-brackets: [ or ].
     *
     * The string may contain non-bracket characters as well.
     *
     * These strings have balanced brackets:
     *  "[LaunchCode]", "Launch[Code]", "[]LaunchCode", "", "[]"
     *
     * While these do not:
     *   "[LaunchCode", "Launch]Code[", "[", "]["
     *

     *
     * @param str - to be validated
     * @return true if balanced, false otherwise
     */
    public static boolean hasBalancedBrackets(String str) {
        int openBracket = 0;
        int closeBracket = 0;
        ArrayList<Character> brackets = new ArrayList<>();

        //to determine if the bracket is in the right order:
        //create an arraylist to store brackets
        //loop through chars
        //if the character is an opening bracket, add the opening bracket to the arraylist
        //if the character is a closing bracket, check to see if the arraylist contains the opening bracket, or if

        //if it contains the opening bracket,

        for (char ch : str.toCharArray()) {
            if (ch == '[') {
                openBracket++;
            } else if (ch == ']') {
                closeBracket++;
            }
        }
        return openBracket==closeBracket;
    }
}
