public class poweCalculation {
    public static int pon(int x,int y){
        if (y==0){
            return 1;
        }
        return  pon(x, y-1)*x;
    }
    
    public static void main(String[] args) {
        System.out.println("power of a number is :"+pon(2, 4));
    }
}
