 //给定一个链表，判断链表中是否有环。 
//
// 为了表示给定链表中的环，我们使用整数 pos 来表示链表尾连接到链表中的位置（索引从 0 开始）。 如果 pos 是 -1，则在该链表中没有环。 
//
// 
//
// 示例 1： 
//
// 输入：head = [3,2,0,-4], pos = 1
//输出：true
//解释：链表中有一个环，其尾部连接到第二个节点。
// 
//
// 
//
// 示例 2： 
//
// 输入：head = [1,2], pos = 0
//输出：true
//解释：链表中有一个环，其尾部连接到第一个节点。
// 
//
// 
//
// 示例 3： 
//
// 输入：head = [1], pos = -1
//输出：false
//解释：链表中没有环。
// 
//
// 
//
// 
//
// 进阶： 
//
// 你能用 O(1)（即，常量）内存解决此问题吗？ 
// Related Topics 链表 双指针
  
  package com.james.leetcodejava.leetcode.editor.cn;

 import java.util.HashSet;

 public class LinkedListCycle{
      public static void main(String[] args) {
           Solution solution = new LinkedListCycle().new Solution();

          ListNode head = new ListNode(1);
          ListNode head2 = new ListNode(2);
          ListNode head3 = new ListNode(3);
          ListNode head4 = new ListNode(4);
          ListNode head5 = new ListNode(5);

          head.next = head2;
          head2.next = head3;
          head3.next = head2;
//          head4.next = head5;
//          head5.next = null;

          System.out.println(solution.hasCycle(head));
      }
      

//leetcode submit region begin(Prohibit modification and deletion)
/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {

        if(head == null || head.next == null ){
            return false;
        }
        ListNode slow = head;
        ListNode fast = head;
        for (int i = 0; true ; ) {
            if(fast == null || fast.next == null){
                return false;
            }
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast){
                return true;
            }

        }

    }
}

public class Solution2 {
    public boolean hasCycle(ListNode head) {

        HashSet<ListNode> set = new HashSet<>();
        for (int i = 0; head !=null; head = head.next) {
            if(set.contains(head))
            {
                return true;
            }else{
                set.add(head);
            }
        }

        return false;
        
    }
}
//leetcode submit region end(Prohibit modification and deletion)

      public static class ListNode {
          int val;
          ListNode next;

          ListNode(int x) {
              val = x;
          }
      }
      
  }