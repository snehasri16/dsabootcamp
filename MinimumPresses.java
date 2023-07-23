
/*
You have a keypad with 9 buttons, numbered from 1 to 9, each mapped to lowercase English letters. You can choose which characters each button is matched to as long as:

All 26 lowercase English letters are mapped to.
Each character is mapped to by exactly 1 button.
Each button maps to at most 3 characters.
To type the first character matched to a button, you press the button once. To type the second character, you press the button twice, and so on.

Given a string s, return the minimum number of keypresses needed to type s using your keypad.

Note that the characters mapped to by each button, and the order they are mapped in cannot be changed.
*/
import java.util.*;
public class MinimumPresses{

    static int minimumKeypresses(String s) {
        int[] cnt = new int[26];
        for (char c : s.toCharArray()) {
            ++cnt[c - 'a'];
        }
        Arrays.sort(cnt);
        int ans = 0;
        for (int i = 1, j = 1; i <= 26; ++i) {
            ans += j * cnt[26 - i];
            if (i % 9 == 0) {
                ++j;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        String s="apple";//5
        System.out.println(minimumKeypresses(s));
    }
}
