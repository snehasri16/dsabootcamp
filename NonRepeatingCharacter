/*
Find the non-repeating character from a given string.If there is no such character return $.
*/
..........................................................
import java.util.*;
public class NonRepeatingCharacter {
    static char nonrepeatingCharacter(String s){
        int[] h=new int[26];
        Arrays.fill(h,0);
        for(int i=0;i<s.length();i++){
            h[s.charAt(i)-'a']+=1;
        }

        for(int i=0;i<s.length();i++){
            if(h[s.charAt(i)-'a']==1){
                return s.charAt(i);
            }
        }
        return '$';
    }
    public static void main(String[] args) {
        String s="hellooo";
        System.out.println(nonrepeatingCharacter(s));
    }
}
