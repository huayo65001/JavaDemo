package com.caleb.alorithm.leetcode;

import com.caleb.offerdemo.ListNode;

/**
 * 环形链表
 * 给定一个链表，判断链表中是否有环。
 * 如果链表中有某个节点，可以通过连续跟踪 next 指针再次到达，则链表中存在环。
 * 为了表示给定链表中的环，我们使用整数 pos 来表示链表尾连接到链表中的位置（索引从 0 开始）。
 * 如果 pos 是 -1，则在该链表中没有环。注意：pos 不作为参数进行传递，仅仅是为了标识链表的实际情况。
 * 如果链表中存在环，则返回 true 。 否则，返回 false 。
 * 进阶：
 * 你能用 O(1)（即，常量）内存解决此问题吗？
 * @author：hanzhigang
 * @Date : 2021/4/23 11:20 PM
 */
public class HasCycle141 {

    /**
     * 思路：快慢指针想法
     * @param head
     * @return
     */
    public boolean hasCycle(ListNode head) {
        if(head == null){
            return true;
        }
        ListNode fastNode = head.next;   // 快指针, 快指针走两步
        ListNode slowNode = head;   // 慢指针, 慢指针走一步
        while(fastNode != null && fastNode != slowNode){
            fastNode = fastNode.next;
            if(fastNode != null){
                fastNode = fastNode.next;
            }
            slowNode = slowNode.next;
        }
        return fastNode == slowNode;
    }
}