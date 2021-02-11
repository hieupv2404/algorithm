/*
Given the mapping a = 1, b = 2, ... z = 26, and an encoded message, count the number of ways it can be decoded.

For example, the message '111' would give 3, since it could be decoded as 'aaa', 'ka', and 'ak'.
 */

package puzzel.Problem2701;

public class NumberDecode {
    private static int numDecodings(String s) {
        int n = s.length();
        int[] count = new int[n + 1];
        count[0] = count[1] = 1;
        if(s.charAt(0) =='0')
            return 0;
        for (int i = 2; i <= n; i++)
        {
            count[i] = 0;

            if (s.charAt(i - 1) > '0')
                count[i] = count[i - 1];

            if (s.charAt(i - 2) == '1' || (s.charAt(i - 2) == '2' && s.charAt(i - 1) < '7'))
                count[i] += count[i - 2];
        }
        return count[n];
    }

    public static void main(String[] args) {
        System.out.println(numDecodings("111"));
    }
}
