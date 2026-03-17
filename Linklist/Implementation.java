class Node{ //user define data type
    int val;
    Node next;

    Node(int val){
        this.val = val;
    }
}

class Linkedlist{ //user define data structure
    Node head;
    Node tail;
    int size;
    void addAtTail(int val){
        Node temp = new Node(val);
        if(tail == null){
            head = tail = temp;
        }
        else{
            tail.next = temp;
            tail = temp;
        }
        size++;
    }

    void displayList(){
        if(head == null) return;
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.val+" ");
            temp = temp.next;
        }
        System.out.println();
    }

    void addAtHead(int val){
        Node temp = new Node(val);
        if(head == null){
            head = tail = temp;
        }
        else{
            temp.next = head;
            head = temp;
        }
        size++;
    }

    void deleteAtHead(){
        if(head == null) {
            System.out.println("list is empty");
            return;
        }
        head = head.next;
        if(head == null) tail = null;
        size--;
    }
}

public class Implementation {
    public static void main(String[] args) {
        Linkedlist list = new Linkedlist();
        list.addAtTail(10); 
        list.addAtTail(20); 
        list.addAtTail(30); 
        list.addAtTail(40); 
        list.displayList();
        list.addAtHead(60);
        list.displayList();
        list.deleteAtHead();
        list.displayList();
        System.out.println(list.size);
    }
}
