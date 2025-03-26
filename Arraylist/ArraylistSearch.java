import java.util.*;
public class ArraylistSearch {
    public static void search(ArrayList<Integer> list, int key){
        for(int i=0; i<list.size(); i++){
            if(list.get(i) == key){
                System.out.println(key + " found at index " + i);
                return;
            }
        }
        System.out.println(key + " not found in the list");
    }
    public static void main(String[] args) {    
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(50);
        list.add(75);
        list.add(40);
        search(list, 20);
        search(list, 50);
     //to sort the list
  Collections.sort(list);
  System.out.println("Sorted list: " + list);

  //to copy one arraylist into another
   //copy.addAll(list);directly add all in copy list

 ArrayList<Integer> List2=new ArrayList<>();
 List2.add(5);
 List2.add(7);
 List2.add(9);
 List2.add(11);
 Collections.copy(list, List2);
 //copy list2 to list 
 System.out.println("Copied list: " + list);
 
 //reverse List
  Collections.reverse(list);
 System.out.println("Reversed list: " + list);
 //extract exact portion of list
 List<Integer> sublist = list.subList(0, 1);
 System.out.println("Sublist: " + sublist);

}    
}
