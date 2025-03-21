public class ArrayMaxsubkadens {
    public static void kadens(int numbers[]){
        int ms=Integer.MIN_VALUE;
        int cs=0;
        for(int i=0; i<numbers.length; i++){
            cs=cs+numbers[i];
            if(cs>ms){
                ms=cs;
            }
            if(cs<0){
                cs=0;
            }
        
    
    }System.out.println("max sub array: " + ms);
    
}
public static void main(String[] args) {
    int numbers[]={1,2,3,-5,4};
    kadens(numbers);
}
    
    
}
