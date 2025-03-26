import java.util.*;
public class SwapArraylist {
    public static void swap(ArrayList<Integer>list, int indx1, int indx2) {
        int temp=list.get(indx1);
        list.set(indx1, list.get(indx2));
        list.set(indx2, temp);
    }
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(7);
        list.add(3);
        list.add(8);
        list.add(5);
        System.out.println("original list "+list);
        swap(list, 0, 4);
        System.out.println("Swap List" +list);
        Collections.sort(list);
        System.out.println("Sorted List: "+list);
        //reverse arraylist
        for(int i=list.size()-1; i>=0; i--){
            System.out.print(list.get(i)+" ");
        }
        //Collections.reverse(list);
    }
    
}
