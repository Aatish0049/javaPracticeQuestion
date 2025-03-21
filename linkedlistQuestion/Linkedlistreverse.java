public class Linkedlistreverse {
    public static class Node{
        int data;
        Node next;
        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    public static Node head;
    public static Node tail;
    public  void addFirst(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            tail = newNode;
        } else{
            newNode.next = head;
            head = newNode;
        }
    }
    public  void reverseList(){
        Node prev = null;
        Node current = head;
        Node next;
        while(current!=null){
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        
        }
        head = prev;
    }
    public  void printList(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
        System.out.println("null");
    
    }
    public static void main(String[] args) {
        Linkedlistreverse aa= new Linkedlistreverse();
        aa.addFirst(5);
       aa.addFirst(4);
        aa.addFirst(3);
        aa.addFirst(2);
        aa.addFirst(1);
       System.out.println("Original Linked List: ");
        aa.printList();
        aa.reverseList();
        System.out.println("\nReversed Linked List: ");
        aa.printList();
    
}
}
