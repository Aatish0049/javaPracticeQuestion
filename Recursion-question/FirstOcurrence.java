public class FirstOcurrence {
    public static int getFirstOcurrence(int arr[],int key,int i){
        if(i==arr.length){
            return -1;
        }
        if(arr[i]==key){
            return i;
        }
        return getFirstOcurrence(arr,key,i+1);
    }
    public static void main(String[] args) {
        int arr[] = {1,4,6,7,8,7};
        int key = 7;
        int result = getFirstOcurrence(arr, key, 0);
        System.out.println(result);
    }
}
