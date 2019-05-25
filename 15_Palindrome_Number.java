class Solution {
    public boolean isPalindrome(int x) {
        
        int alias=x;
        int y=0;
        
        while(alias>0){
            y=(y*10)+(alias%10);
            alias=alias/10;
        }
        
        
        return y==x;
    }
}