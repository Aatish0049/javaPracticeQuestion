import java.util.Scanner;

public class Arraylargest {
    public static int largest(int numbers[]){
        int largest =Integer.MIN_VALUE;
        for(int i=0; i<numbers.length; i++){
            if(largest<numbers[i]){
                largest = numbers[i];
            }
            }return largest;
    }
public static void main(String args[]) {
    
int numbers[] =new int[7];
    Scanner sc = new Scanner(System.in);
    for (int i = 0; i<7; i++) {
     
        numbers[i] = sc.nextInt();
    }
    
    int largestNumber = largest(numbers);
    System.out.println("The largest number is: " + largestNumber);
    
}
}

