public class tilingproblem {
    public static int noOfways(int n){
        if (n==0 || n==1) {
            return 1;
    }
// vertically arrangement
int v=noOfways(n-1);

// horizontally arrangement
    int h=noOfways(n-2);
    
    int total=v+h;
    
    return total;
    
}
    public static void main(String[] args) {
        int n=4;
        System.out.println("Number of ways to tile a 2*n floor  is "+noOfways(n));
    }
}

