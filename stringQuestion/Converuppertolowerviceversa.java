public class Converuppertolowerviceversa {
    
    public static void convert(String value){
        StringBuffer sb = new StringBuffer(value);
        for (int i = 0; i < value.length(); i++){
            if(Character.isLowerCase(value.charAt(i))){
               sb.setCharAt(i, Character.toUpperCase(value.charAt(i)));
            }
            else{
                sb.setCharAt(i, Character.toLowerCase(value.charAt(i)));
            }
        }
        System.out.println(sb);
    }
    
    public static void main(String[] args) {
        convert("Hello World");
    }
}
