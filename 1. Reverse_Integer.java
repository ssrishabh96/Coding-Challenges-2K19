class Solution {
    public int reverse(int x) {
        int max=Integer.MAX_VALUE;
        // Use negative flag to flag x as negative and then make it positive
        boolean negative=false;
               
        // Make the number positive and set the flag
        if(x<0){
            negative=true;
            x=x*(-1);
        }
        
        int unit=0, newNum=0;
        while(x>0){
            unit=x%10;
            // Boundary Conditions
            if(negative && (newNum==max/10 && unit>7) ) return 0;
            if((newNum>max/10) || (newNum==max/10 && unit>8) ) return 0;
            newNum=(newNum*10)+unit;
            x/=10;
        }

        if(negative){
            newNum*=-1;
        }
            return newNum;
    }
}
