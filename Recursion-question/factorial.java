public class factorial {
    public static int Factorialnum(int num){
        if (num==0) {
            return 1;
        }
      return num *Factorialnum(num-1);
    /* /  int fnm1=Factorialnum(num-1);
      int fn=num * Factorialnum(num-1);
      return fn;*/
    }
    public static int CAlsum(int num){
      if (num==1){
return 1;
      }
    //  int sum1=CAlsum(num-1);
      int sn=CAlsum(num-1) +num;
      return sn;
    }
    
    public static void main(String[] args) {
        
        int num = 5;
   System.out.println( CAlsum(num));
        //     System.out.println("Factorial of " + num + " is: " + Factorialnum(num));
    }
}
