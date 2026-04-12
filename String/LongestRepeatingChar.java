package String;

import java.util.HashMap;

public class LongestRepeatingChar {
    public static int longestCharacter(String s, int k){
        int left = 0;
        int maxCount = 0;
        int maxLength = 0;
        HashMap <Character, Integer> map = new HashMap<>();

        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);
            map.put(ch, map.getOrDefault(ch, 0)+1);
            maxCount = Math.max(maxLength, map.get(ch));

            //if the string is invalid, then shrik the length of the string
            while((i-left-1) - maxCount > k){
                char leftChar = s.charAt(left);
                map.put(leftChar,map.get(leftChar)-1);
                left++;
            }
            maxLength = Math.max(maxLength, i-left+1);
        }
        return maxLength;
    }

    public static void main(String[] args) {
        String s = "AABABBA";
        int k = 1;
        System.out.println(longestCharacter(s,k));
    }
}
