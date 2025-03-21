public class bitQuestion {
    public static int ClearBitsinRange(int n,int i,int j){
        int a=((~0)<<(j+1));
        int b=(1<<i)-1;
        int bitmask=a|b;
        return n & bitmask;
    }
    //power of two
    public static boolean isPowerOfTwo(int n){
        return (n & (n-1))==0;
    }
    //count set bits in number [to count 1]
    public static int CountSetBits(int n){
        int count=0;
        while(n>0){
            if((n&1)!=0) {
                count++;
        }
        n=n>>1;
    }
    return count;
}
    public static void main(String[] args) {
        int n=15;
        int i=1;
        int j=3;
        System.out.println(ClearBitsinRange(n, i, j));
        System.out.println(isPowerOfTwo(n));
        System.out.println(CountSetBits(n));
    }
    
}
