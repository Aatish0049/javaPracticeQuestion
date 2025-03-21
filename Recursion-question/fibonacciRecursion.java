import java.util.*;
public class fibonacciRecursion {
    public static int fab(int x){
        if(x==0 || x==1){
            return x;
        }
        int fnm1= fab(x-1);
        int fnm2=fab(x-2);
        int fabb= fnm1 + fnm2;
        return fabb;
    }
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n=sc.nextInt();
     System.out.println(fab(n));
    }
}
