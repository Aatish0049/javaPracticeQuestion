 import java.util.*;
public class Arraylistcontains {
 
  public static void main(String[] args) {
   ArrayList<String> c1= new ArrayList<String>();
          c1.add("Red");
          c1.add("Green");
          c1.add("Black");
          c1.add("White");
          c1.add("Pink");

          ArrayList<String> c2= new ArrayList<String>();
          c2.add("Red");
          c2.add("Green");
          c2.add("Black");
          c2.add("Pink");

          //Storing the comparison output in ArrayList<String>
          ArrayList<String> c3 = new ArrayList<String>();
          for (String e : c1)
             c3.add(c2.contains(e) ? "Yes" : "No");
          System.out.println(c3);
         //Swap the value in list
          Collections.swap(c3,0,3);
          System.out.println(c3);
          //to add 2 array list
        ArrayList<String> c4 = new ArrayList<String>();
        c4.addAll(c1);
        c4.addAll(c2);
        System.out.println(c4);  
// to clone arraylist
ArrayList<String> newc1 = (ArrayList<String>)c1.clone();
          System.out.println("Cloned array list: " + newc1);  
          //to remove all element
          newc1.removeAll(newc1);
          System.out.println(newc1);

        }
}

