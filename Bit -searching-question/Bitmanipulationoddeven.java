import java.util.*;
public class Bitmanipulationoddeven {
    public static boolean isOdd(int num) {
        int bit=1;
        if((num & bit )==0) {
            return false;
    
        }
        return true;
    
}
public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int num =scanner.nextInt();
    System.out.println("Is the number odd? " + isOdd(num));
}
}