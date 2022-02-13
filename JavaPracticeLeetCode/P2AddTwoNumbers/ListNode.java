/**
 * https://www.youtube.com/watch?v=NZq2Qtt1SbE
 * How to make a class : https://velog.io/@damhee6624/자바의-클래스선언-필드-생성자
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 *    
 *   carry 0  1
 *l1   2   4  3
 *l2   5   6  4
 *ans  7   0  8
 * 4+6=10 carry : 1 transfer->3+4=>1+3+48 
 */

public class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

class Solution {
    
    //meathod 
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        //empty node create
        //1. Allocating a memory space to be stored in 'ref' object by 'New' operator.
        //2. The cunstructor initializes the ref object (the default generator operates above).)
        //3. 'New' operator stores the address of the newly created object in the 'ref' variable.
        //4. You can access ListNode through 'ref'.

        //Importing an external class → class variablename = new class();
        ListNode ret = new ListNode();
        
        //point answer node above
        //target=ret: The answer node that the target points to keeps changing.

        //so we have to return ret at the final. 
        ListNode target = ret; 
        
        //carry value
        int carry=0;
        
        //if l1 or l2 has the node at least then start while loop
        while(l1!=null || l2!=null){
            //first node initialize
            int val1=0; 
            //second node initialize
            int val2=0;
            if(l1!=null){
                val1=l1.val;
            }
            if(l2!=null){
                val2=l2.val;
            }
            
            //sum two nodes value
            int sum=val1+val2+carry;
            
            //check the tens' number(check carry)
            target.val=sum%10;
            
            //4+6=10, then regard tens' number as a carry
            //10=> carry:1
            //20=> carry:2
            if(sum>=10){
                carry=1;
            }
            
            //3+2=05, no carry
            else{
                carry=0;
            }
            
            if(l1!=null){
                l1=l1.next;
            }
            if(l2!=null){
                l2=l2.next;
            }
            
            if(l1!=null|| l2!=null){
                target.next=new ListNode();
                target=target.next;
            }
        }
        
        //l1==null && l2==null
        if(carry==1){
            
            //create last answer node to 1
            //ListNode(int val) { this.val = val; }
            target.next=new ListNode(1);
        }
        
        return ret;
    }
}