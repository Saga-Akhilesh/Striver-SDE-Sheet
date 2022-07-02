import java.util.*;
public class lengthOfLongestSubstringNoRepeating{
static int lengthOfLongestSubstring(String s) {
    HashMap<Character,Integer>map=new HashMap<Character,Integer>();
    int left=0, right=0;
    int n=s.length();
    int lengthofSubstring=0;
    while(right<n){
        if(map.containsKey(s.charAt(right)))   //if map contains the character at right pointer
            left=Math.max(map.get(s.charAt(right))+1,left);  //if repeating number is there before range of left to right  pointers then dont worry and dont move left. or if repeating number is in the range of left to right pointers then move left pointer ahead of its index which is there previously in map. 
            map.put(s.charAt(right),right);   //update the map with character at right index and also with its index 
            lengthofSubstring=Math.max(right-left+1,lengthofSubstring); 
        right++;
        }
        return lengthofSubstring;
    }
    public static void main(String args[]){
        String s ="abcabcbb";
        System.out.println(lengthOfLongestSubstring(s));
    }
}