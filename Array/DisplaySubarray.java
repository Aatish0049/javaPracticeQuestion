public class DisplaySubarray {
    public static void Displaysubarray(int numbers[]){
        int ts=0;
        for(int i=0; i<numbers.length;i++) {
            int start = i;
            for(int j=i; j<numbers.length; j++) {
                int end = j;
                for(int k=start; k<=end; k++) {
                    System.out.print(numbers[k] + " ");
     }ts++;
     System.out.println();
        } System.out.println();
    }
    System.out.println(ts);
}
public static void main (String[] args) {
    int numbers[] = {0,1,2,3,2};
   
    Displaysubarray(numbers);
}
    
}
