// import java.util.LinkedList;

class Node {
    int data;
    Node next;

    Node(int data1){
        this.data = data1;
        this.next = null;
    }

    public class start {
        public static void traverse(Node head){
            Node temp = head;
            while (temp.next != null) {
                System.out.print(temp.data);
                temp = temp.next;
                
            }
        }
        public static void main(String[] args) {

            // LinkedList<String> l = new LinkedList<String>();
            
            Node Obj1 = new Node(4);
            Node Obj2 = new Node(7);
            Node Obj3 = new Node(8);
            Node Obj4 = new Node(3);

            Obj1.next = Obj2;
            Obj2.next = Obj3;
            Obj3.next = Obj4;
            Obj4.next = null;

            traverse(Obj1);
        }
    }
}
