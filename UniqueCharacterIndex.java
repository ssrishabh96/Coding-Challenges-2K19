/* First Unique Character in a String

Given a string, find the first non-repeating character in it and return it's index. If it doesn't exist, return -1. Examples:

s = "leetcode"
return 0.

s = "loveleetcode",
return 2.

Note: You may assume the string contain only lowercase letters.
*/

class UniqueCharacterIndex {
    public int firstUniqChar(String s) {
        
        // Base Case: Empty string or null string passed
        if(s.length()==0 || s==null) return -1;
        // Assuming only the alphabets are included in the string
        int frequencyCount[]=new int[26];
        
        for(int i=0; i<s.length();i++){
            frequencyCount[s.charAt(i)-'a']++;
        }
        
        for(int i=0; i<s.length();i++){
            if(frequencyCount[s.charAt(i)-'a']==1) return i;
        }
        
        return -1;
    }
}
