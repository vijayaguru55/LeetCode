package org.LeetCode;
/*Problem No.2
 * You are given two non-empty linked lists representing two non-negative integers. 
 * The digits are stored in reverse order, and each of their nodes contains a single digit. 
 * Add the two numbers and return the sum as a linked list.
 * You may assume the two numbers do not contain any leading zero, except the number 0 itself
 * The number of nodes in each linked list is in the range [1, 100].
 */

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}
public class AddTwoNumbers{

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode head = new ListNode(0);
         ListNode p=l1, q=l2, current = head;
         int carry = 0;
         while(p!=null || q!= null){
             int x = (p!=null )?p.val:0;
             int y = (q!= null)? q.val: 0;
             int sum = carry +x+y;
             carry = sum/10;
             current.next = new ListNode(sum%10);
             current = current.next;
             if(p!=null) p = p.next;
             if(q!= null) q=q.next;
         }
         
         if(carry>0){
             current.next = new ListNode(carry);
         }
         
         return head.next;
     }
    public static void main(String[] args) {
        ListNode list1 = new ListNode(5,new ListNode(5,new ListNode(3)));
        ListNode list2 = new ListNode(2,new ListNode(7,new ListNode(9)));
        
        AddTwoNumbers a =new AddTwoNumbers();
        ListNode sum =  a.addTwoNumbers(list1, list2);
        while(sum!=null){
            System.out.print(sum.val+" ");
            sum=sum.next;
        }
    }
 }