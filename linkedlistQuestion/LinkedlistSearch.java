public class LinkedlistSearch {
   // public class Linkedlist {
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
       
            // To print the linked List
            public void printList(){
                Node temp=head;
                while(temp!=null){
                    System.out.print(temp.data+" ");
                    temp=temp.next;
                }
                System.out.println("null");
        }

        //to search in linked list KEY 
        public  int itrSearch(int key){
            Node temp=head;
            int i=0;
            while(temp!=null){
                if(temp.data==key){
                    return i;
                }
                temp=temp.next;
                i++;
            }
            return -1;
        }
        public static void main(String[] args){
            LinkedlistSearch list = new LinkedlistSearch();
            list.addFirst(1);
            list.addFirst(2);
            list.addFirst(3);
            list.addFirst(4);
            list.addFirst(5);
            list.printList();
            System.out.println("Search 3 in linked list: "+list.itrSearch(8));
    }
        }
    
