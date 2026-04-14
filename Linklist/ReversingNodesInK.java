class ListNode{
    int data;
    ListNode next;
    ListNode(int data){
        this.data = data;
        this.next = null;
    }
}

public class ReversingNodesInK {
    public static ListNode reverseNode(ListNode head, int k){
        if(head == null || k == 1) return head;
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode prev = dummy;
        ListNode current = dummy;
        int count = 0;

        while(current.next != null){
            current = current.next;
            count++;
        }

        while(count >= k){
            current = prev.next;
            ListNode next = current.next;

            //Reverse the nodes
            for(int i = 1; i < k; i++){
                current.next = next.next;
                next.next = prev.next;
                prev.next = next;
                next = current.next;
            }
            prev = current;
            count -= k;
        }
        return dummy.next;
    }

    // Print function
    public static void printList(ListNode head) {
        ListNode temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }
    
    public static void main(String[] args) {
        ListNode head = new ListNode(10);
        head.next = new ListNode(20);
        head.next.next = new ListNode(30);
        head.next.next.next = new ListNode(40);
        head.next.next.next.next = new ListNode(50);
        int k = 2;

        head = (reverseNode(head,k));
        printList(head);
    }
}