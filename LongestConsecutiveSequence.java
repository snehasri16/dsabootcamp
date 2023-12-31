
/*
You are given an array of ‘N’ integers. You need to find the length of the longest sequence which contains the consecutive elements.

Example 1:

Input: [100, 200, 1, 3, 2, 4]

Output: 4

Explanation: The longest consecutive subsequence is 1, 2, 3, and 4.

Input: [3, 8, 5, 7, 6]

Output: 4

Explanation: The longest consecutive subsequence is 5, 6, 7, and 8.
*/

..................................................................
import java.util.*;
public class LongestConsecutiveSequence {

    //bruth force
    static int fun2(int[] a){
        int max=Integer.MIN_VALUE;
        int n=a.length;
        Arrays.sort(a);
        int c=1;
        int p=a[0];
        for(int i=1;i<n;i++){
            if(p+1==a[i]){
                c++;
            }
            else  {
                c=1;
            }
            p=a[i];
            max=Math.max(max,c);
        }
        return max;
    }

    //optimal solnn......
    static int findLenOfLongestSequence(int[] a){
        int n=a.length;
        HashSet<Integer> s=new HashSet<>();
        for(int i:a){
            s.add(i);
        }
        int longstreak=0;
        for(int i=0;i<n;i++){
            if(!s.contains(a[i]-1)){
                int current=a[i];
                int curstreak=1;
            while(s.contains(current+1)){
                curstreak+=1;
                current=current+1;
            }
            longstreak=Math.max(curstreak,longstreak);

            }
        }
        return  longstreak;
    }

    public static void main(String[] args) {
        int[] a={13 ,342,64,0,1,2,3,4,7};
        System.out.println(findLenOfLongestSequence(a));
       // System.out.println(fun2(a));
    }
}
