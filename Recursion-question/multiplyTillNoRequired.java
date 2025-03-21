//no multiplication till user wants to

public class multiplyTillNoRequired {
    public static void multiplyno(int x, int y) {
        if(y==0) return;
        multiplyno(x, y-1);
        System.out.println(x * y);
        
    }
    public static void main(String[] args) {
        multiplyno(5,4);
    }
}
