public class ReverseString {
    public static String ReverseStr(String Str){
        StringBuilder sb = new StringBuilder();
        char[] ch = Str.toCharArray();  // Convert the string into a character array to reverse it in-place
  
     
       for(int i=Str.length()-1; i>=0; i--){
        sb.append(ch[i]);
       }
       return sb.toString();

    }


    public static void main(String[] args) {
        String  Str = "Hello";
        System.out.println(ReverseStr(Str));  
    }
    
}
