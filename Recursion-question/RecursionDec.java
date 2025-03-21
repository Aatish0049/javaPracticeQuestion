
import java.util.Scanner;

public class RecursionDec {
  /*   public static void RecursionDecresasing(int n){
        if(n>0){
            System.out.print(n);
            RecursionDecresasing(n-1);
        }
        }  */ 
        public static void RecursionIncreasing(int n){
            if(n==1){
                System.out.print(n);
                return;
            }
            RecursionIncreasing(n-1);
            System.out.print(n);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number:");  //test input 10
        int n =sc.nextInt();
       // RecursionDecresasing(n);
        RecursionIncreasing(n);
    }
}
