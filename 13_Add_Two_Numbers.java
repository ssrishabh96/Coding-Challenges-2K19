/**
 * You are given two non-empty linked lists representing two non-negative integers. The digits are stored in reverse order and each of their nodes contain a single digit. Add the two numbers and return it as a linked list.
 * You may assume the two numbers do not contain any leading zero, except the number 0 itself.
 * Example:
 * Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
 * Output: 7 -> 0 -> 8
 * Explanation: 342 + 465 = 807.
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        
        
        ListNode temp1;
        ListNode temp2;

        temp1=l1;
        temp2=l2;
        
        int sum=0, num1=0, num2=0;
        
        int count=0;
        
        // Retreive number 1
        while(temp1.next!=null){
            num1+=(temp1.val*(Math.pow(10, count)));
            count++;
            temp1=temp1.next;
        }
        num1+=(temp1.val*(Math.pow(10, count)));
            count++;
        
        count=0;
        // Retreive number 2
        while(temp2.next!=null){
            num2+=(temp2.val*(Math.pow(10, count)));
            count++;
            temp2=temp2.next;
        }
        num2+=(temp2.val*(Math.pow(10, count)));
            count++;
        sum=num1+num2;
        
        // Check the sum
        //  System.out.println("Sum: "+sum);
        
        temp1=new ListNode(0);
        temp2=null;
        num1=sum;
        num2=0;
        ListNode list=temp1;
        
        while(num1!=0){
            
            
            
            // flag variable to store list head pointer
            if(num2==0){
                list=new ListNode(num1%10);
                temp1=list;
                num2=1;
            }else
            {
                list.next=new ListNode(num1%10);
                list=list.next;
            }
            num1=(num1/10);
        }
        
        return temp1;
    }
}