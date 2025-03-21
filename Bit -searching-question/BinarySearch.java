public class BinarySearch {
    public static int BINARY_SEARCH(int a[], int b){
        int start=0
;
        int end=a.length-1;
        while(start<=end){
            int mid=(start+end)/2;
            if(a[mid]==b){
                return mid;
            }
            else if(a[mid]<b){
                start=mid+1;
            }
            else{
                end=mid-1;
            }

        }
        return -1;
    }

public static void main(String[] args){
    int a[]={2, 3, 4, 10, 40};
    int b=10;
    int result=BinarySearch.BINARY_SEARCH(a, b);
    if(result==-1)
        System.out.println("Element is not present in array");
    else
        System.out.println("Element is present at index "+result);
}
    
}
