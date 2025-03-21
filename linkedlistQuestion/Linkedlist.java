//package linkedlist;
public class Linkedlist {
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

            // to add in the first node
    public void addFirst(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            tail = newNode;
            
        } else{
            newNode.next = head;
            head = newNode;
        }
    }
    //to ADD THE data in last node
        public void addLast(int data){
            Node newNode = new Node(data);
            if(tail == null){
                head = newNode;
                tail = newNode;
            } else{
                tail.next = newNode;
                tail = newNode;
            }
        }
        // To print the linked List
        public void printList(){
            Node temp=head;
            while(temp!=null){
                System.out.print(temp.data+" ");
                temp=temp.next;
            }
            System.out.println("null");
    }
    //to add in middle in linked list
    public void add(int idx,int data){
        Node newNode = new Node(data);
        Node temp=head;
        int i=0;
        while(i<idx-1){
            temp=temp.next;
            i++;
        }
        newNode.next=temp.next;
        temp.next=newNode;
    }
        //to search in linked list KEY 
        public static void main(String[] args) {
            
        
        Linkedlist list = new Linkedlist();
        list.addFirst(1);
        list.addFirst(2);
        list.addLast(3);
        list.addLast(4);
        list.addLast(5);
        list.add(2, 6);
        list.printList();
}
    }
