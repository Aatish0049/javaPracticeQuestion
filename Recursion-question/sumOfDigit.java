public class sumOfDigit {
    public static int sod(int num){
        if(num>0 && num<10){
            return num;
        }
        int sum=sod(num/10)+num%10;
        return sum;
    }
    public static void main(String[] args) {
       System.out.println(sod(1234));
    }
    
}
