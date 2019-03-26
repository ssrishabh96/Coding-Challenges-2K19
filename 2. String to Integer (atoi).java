/*  Link to the problem: https://leetcode.com/problems/string-to-integer-atoi/
*   Author: Rishabh Agrawal
*   Date: 25th March, 2019
*/

class Solution {
    public int myAtoi(String input) {
        
        // Base Condition:
        if(input.equals("")) return 0;
        
        System.out.println("Input: "+input);
        // Main Program
        boolean sFlag=false;
        int number=0;
        String sign="";
        StringBuilder sbf=new StringBuilder("");
        
        for(int i=0; i<input.length();i++){
            char cur=input.charAt(i);
            // 1. Check for whiteSpaces
             if(cur==' ') {
                 if(sFlag==true) break;
                continue;
            }else if((cur=='-'||cur=='+') && sFlag==true ){
                break;
            }else if(cur=='+' && sFlag==false){
                sign="+";
                sFlag=true;
            }else if(cur=='-' && sFlag==false){
                sign="-";
                sFlag=true;
            }else if(cur=='.'){
                break;
            }else if(sFlag==false && Character.isAlphabetic(cur)){
                return 0;
            }else if(sFlag==true && Character.isAlphabetic(cur)){
                break;
            }else if(Character.isDigit(cur) || sFlag==true){
                sFlag=true;
                if(sign.equals("")) sign="+";
                sbf.append(""+cur);
            }
        }// for-loop ends here
        
        // Check for empty StringBuffer
        if(sbf.toString().equals("")) return 0;
        
        // Check for corner cases when number is greater of less than the required limit
        
        if(sign.equals("+")){
            try{
                if(sign.equals("+") && Integer.parseInt(sbf.toString())>Integer.MAX_VALUE){}
                    else {
                        number=Integer.parseInt(sbf.toString());
                    }        
                }catch(NumberFormatException nfe){
                number=Integer.MAX_VALUE;
                }
        }else if(sign.equals("-")){
            try{
            if(Integer.parseInt(sbf.toString())<Integer.MIN_VALUE){
            }
                    else {
                        number=Integer.parseInt(sbf.toString())*-1;  
                    }      
                }catch(NumberFormatException nfe){
                    number=Integer.MIN_VALUE;
                }
        }
        return number;
    }
}