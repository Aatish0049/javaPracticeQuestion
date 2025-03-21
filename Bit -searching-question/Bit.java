public class Bit {
    public  static int getithBit(int n,int i){
        int bitmask=1<<i;
        if((n&bitmask)==0){
            return 0;
        }
        else{
            return 1;
        }
    }
    public static int setithBit(int n,int i){
        int bitmask=1<<i;
        return n|bitmask;
    }
    public static int clearithBit(int n,int i){
        int bitmask=~(1<<i);
        return n&bitmask;
    }
public static int LastithBit(int n,int i){
    int bitmask=(1<<i)-1;
    return (n&bitmask);
}
    public static void main(String[] args) {
        int n=10;
        int i=2;
        System.out.println(getithBit(n,i));
        System.out.println(setithBit(n,i));
        System.out.println(clearithBit(n,i));
        System.out.println(LastithBit(n,i));
        

    }

}
