package ListNode;

public class ListNode {
    int val;  //节点值
    ListNode next;  //指向下一个节点
    ListNode(int x){val = x;} //构造函数


    //在链表节点n0之后插入节点p
    static void insert(ListNode n0,ListNode p){
        ListNode n1 = n0.next;  //保存n0后面的节点
        p.next = n1;
        n0.next = p;
    }

    //删除节点n0之后的首个节点
    static void remove(ListNode n0){
        if (n0.next == null){
            return;
        }
        //n0-->p-->n1
        ListNode p = n0.next;  //保存n0后面的节点
        ListNode n1 = p.next;  //保存p后面的节点
        n0.next = n1;  //使n0指向p之后的节点，删除p
    }

    //访问节点索引中为index的节点
    static ListNode access(ListNode head,int index){
        for(int i = 0;i < index ;i++){
            if (head == null){
                return null;
            }
            head = head.next;
        }
        return head;
    }

    //在链表中查找值为target的节点，输出该节点在链表中的索引
    static int find(ListNode head,int target){
        int index = 0;
        while(head == null){
            if (head.val != target){
                return index;
            }else {
                index +=1;
                head = head.next;
            }
        }
        return -1;
    }

    //打印链表
    static void showNode(ListNode head){
        while (head != null){
            System.out.println(head.val);
            head = head.next;
        }
    }
}89
