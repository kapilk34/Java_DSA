/*class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class LinkedListInsert {
    //insert at end
    public static Node insert(Node head, int data) {
        Node newNode = new Node(data);
        if (head == null) {
            return newNode;
        }
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
        return head;
    }

    //insert at beginning
    public static Node insertAtStart(Node head, int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
        return head;
    }

    //delete from beginning
    public static Node deleteFromStart(Node head) {
        if (head == null) {
            System.out.println("List is empty");
            return null;
        }
        head = head.next;
        return head;
    }

    //delete from end
    public static Node deleteFromEnd(Node head) {
        if (head == null) return null;
        if (head.next == null) return null;
        Node temp = head;
        while (temp.next.next != null) {
            temp = temp.next;
        }
        temp.next = null;
        return head;
    }

    public static void main(String[] args) {
        // existing linked list
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);

        System.out.println("Existing Linked List:");
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");

        // //add node at beginning
        // head = insertAtStart(head, 5);

        // //add new node
        // head = insert(head, 50);

        // delete from start
        // head = deleteFromStart(head);

        // delete from end
        head = deleteFromEnd(head);

        //print updated list
        System.out.println("\nUpdated Linked List:");
        temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }
}
*/


class Node{
    int data;
    Node next;

    Node(int data){
        this.data = data;
        this.next = null;
    }
} 

public class LinkedListInsert{
    //inserting a new node in the End of the node
    public static Node insertAtEnd(Node head, int data){
        Node newNode = new Node(data);
        if(head == null){
            return newNode;
        }
        Node temp = head;
        while(temp.next != null){
            temp = temp.next;
        }
        temp.next = newNode;
        return head;
    }

    //inserting a new node in the starting of the list
    public static Node insertAtStarting(Node head, int data){
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
        return head;
    }

    public static void main(String args[]){
        Node head = new Node(10);
        head.next = new Node(5);
        head.next.next = new Node(25);
        head.next.next.next = new Node(30);
        
        System.out.println("Existing List:");
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");

        head = insertAtEnd(head, 13);

        System.out.println("Updated List:");
        temp = head;
        while(temp != null){
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }
}