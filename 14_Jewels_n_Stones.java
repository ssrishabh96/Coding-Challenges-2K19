class Solution {
    public int numJewelsInStones(String Jt, String St) {
        
        HashSet<Character> myHash=new HashSet<>();
        int count=0;
        
        for(int i=0; i<Jt.length();i++){
            myHash.add(Jt.charAt(i));          
        }
        
        for(int i=0; i<St.length();i++){
            if(myHash.contains(St.charAt(i)))
                count++;
            
        }
        
        return count;
    }
}