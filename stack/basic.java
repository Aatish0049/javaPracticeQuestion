import java.util.*;

public class basic {
    public static void main(String args[]){
        Stack <Integer> ll=new Stack<>();
        
        ll.push(1);
        ll.push(2);
        ll.push(3);

         while(!ll.isEmpty()){
           System.err.println(ll.peek());
           ll.pop(); 
        }
        



    }
    
}
