import java.util.*;
public class Arraykistiterate {
    public static void print(ArrayList<String> List){
        for(String str: List){
            System.out.println(str);
        }

    }
    public static void main(String[] args) {
        ArrayList<String> List=new ArrayList<>();
        List.add("One");
        List.add("Two");
        List.add("Three");
        print(List);
        //to add at specific position in the list
        List.add(0,"zero"); 
        print(List);
        //to get value of specific position in the list
        String element=List.get(0);
        System.out.println("Element at index 0 is: "+element);

        //to remove element from the list
        List.remove(0);
        print(List);
    }
    
}
