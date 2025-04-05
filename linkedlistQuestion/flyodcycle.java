public class flyodcycle {
    public  class Node{
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


    public static boolean isCycle(){
        Node slow=head;
        Node fast=head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast){
                return true;
            }
    
    }
    return false;
    
}
    public static void main(String[] args) {
 /*head=new Node(1);
 head.next=new Node(2);
 head.next.next=new Node(3);
 head.next.next.next=new Node(4);
 head.next.next.next.next=new Node(5);
 //head.next.next.next.next.next=head;*/
 flyodcycle ll=new flyodcycle();
 ll.addFirst(1);
 ll.addFirst(2);
 ll.addFirst(3);
 ll.addFirst(4);
 ll.addFirst(5);
 head.next.next.next.next.next=head;
 System.out.println(isCycle()); //true

}
}