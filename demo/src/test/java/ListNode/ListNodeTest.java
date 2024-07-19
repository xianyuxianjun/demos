package ListNode;

import static org.junit.jupiter.api.Assertions.*;

class ListNodeTest {

    //初始化链表
    ListNode n0 = new ListNode(1);
    ListNode n1 = new ListNode(2);
    ListNode n2 = new ListNode(3);
    ListNode n3 = new ListNode(4);
    @org.junit.jupiter.api.Test
    void insert() {
        ListNode p = new ListNode(6);
        ListNode.insert(n0,p);
        ListNode.showNode(n0);
    }

    @org.junit.jupiter.api.Test
    void remove() {
    }

    @org.junit.jupiter.api.Test
    void access() {
    }

    @org.junit.jupiter.api.Test
    void find() {
    }
}