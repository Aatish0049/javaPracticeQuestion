
import java.util.Scanner;

public class largestString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] Fruits = new String[3];
        System.out.println("Enter three different Fruits:");
        for (int i = 0; i < Fruits.length; i++){
            Fruits[i] = scanner.nextLine();
        }
        String largest = Fruits[0];
        for(int i=1; i<Fruits.length; i++) {
            if(largest.compareToIgnoreCase(Fruits[i]) < 0) {
                largest = Fruits[i];
            }
        }
        System.out.println("The largest string is: " + largest);
    }
    
}
