//to delete from last nth element
public class LinkedlistDelete {
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
      // To print the linked List
      public void printList(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
        System.out.println("null");
}
// to delete from last nth node

public  void deleteLastNthNode(int n) {
    //Calculate size
    int sz=0;
    Node temp=head;
    while(temp!=null){
        
        temp=temp.next;
        sz++;

    }
    System.out.println("sz="+sz);
    if(n==sz){
        head=head.next;
        return;

    }
    //sz-n
   int i=1;
   int j=sz-n; //j= to find element//3
   Node prev=head;
   while(i<j){
    prev=prev.next;
    i++;
   }
   prev.next=prev.next.next;
   

}

public static void main(String[] args) {
    LinkedlistDelete list = new LinkedlistDelete();
    list.addFirst(1);
    list.addFirst(2);
    list.addFirst(3);
    list.addFirst(4);
    list.addFirst(5);
    System.out.println("Original Linked List: ");
    list.printList();
    list.deleteLastNthNode(2);
    System.out.println("\nLinked List after deleting last 2 nodes: ");
    list.printList();
}
}