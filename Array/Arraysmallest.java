public class Arraysmallest {
    public static void Smallest(int number[]){
        int smallest=number[0];
        for(int i=0;i<number.length;i++){
            if(smallest>number[i]){
                smallest=number[i];
            }
        }
        System.out.println("smallest: " + smallest);
    }
    public static void main(String args[]){
        int number[]={5, 2, 9, 1, 8};
        Smallest(number);
    }
}    

