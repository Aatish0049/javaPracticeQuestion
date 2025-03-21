public class StringLAstword {
    public static int LEngthOFlastStringWord(String S){
        String Str=S.trim();
        int count=0;
        for(int i=Str.length()-1; i>=0; i--){
            if(Str.charAt(i)==' '){
                return count;
            }
            count++;
        }
    return count;
    }
    
    public static void main(String[] args){
        String S=" My name is JAmes BOnd ";
        System.out.println(LEngthOFlastStringWord(S));
    }
}
