/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problems;

/**
 *
 * @author JOSALAZA
 */
public class StringProblems {

    public void reverseString(char[] s) {

        for (int i = 0; i < (s.length / 2); i++) {
            char aux = s[i];
            s[i] = s[s.length - 1 - i];
            s[s.length - 1 - i] = aux;
        }
        for (char so : s) {
            System.out.print(so);
        }
    }

    public int firstUniqueChar(String s) {
        int idx = -1;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == s.charAt(i + 1)) {

            }
        }
        return idx;
    }

    public static void main(String[] args) {
        StringProblems sp = new StringProblems();
        char[] s = new char[]{'h', 'e', 'l', 'l', 'o'};
        char[] s0 = new char[]{'H', 'a', 'n', 'n', 'a', 'h'};
        sp.reverseString(s);
        sp.reverseString(s0);
    }
}
