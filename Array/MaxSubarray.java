public class MaxSubarray {
    public static void MAx_subarray(int number[]){
        int currSum = 0;  // initialize current sum as 0
        int MaxSum = Integer.MIN_VALUE;
        
        for(int i=0; i<number.length; i++){
            int start = i;
            for(int j=i; j<number.length; j++){   
       int end = j;
       currSum = 0;
       for(int k=start; k<=end; k++){
           currSum += number[k];
       }
       System.out.println(currSum);
       if(currSum > MaxSum){
           MaxSum = currSum;
       }
    }
    
}
System.out.println("max subarray sum=" + MaxSum);
    }
    public static void main(String[] args) {
        int numbers[] = {1,2,3,-1,2};
        MAx_subarray(numbers);
    }
    
}
