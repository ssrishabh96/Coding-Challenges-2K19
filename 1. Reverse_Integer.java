class Solution {
    public int reverse(int x) {
        int max=Integer.MAX_VALUE-1;
        // Use negative flag to flag x as negative and then make it positive
        boolean negative=false;
        
        if(x<0 && x<((max+1)*-1)) {
            return 0;
        }else  if(x>max) {
            return 0;
        }
        
        // Make the number positive and set the flag
        if(x<0){
            negative=true;
            x=x*(-1);
        }
        
        int newNum=0;
        while(x>0){
            newNum=(newNum*10)+(x%10);
            x/=10;
            // Check boundary condition for minimum and maximum unsigned int value 
        }

        if(negative){
            newNum*=-1;
        }
            return newNum;
    }
}