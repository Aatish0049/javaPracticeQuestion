import java.util.*;
public class SentenceReverse {
    public static String REversesentence(String Sentence){
        String[]word=Sentence.split(" +");
        StringBuilder sb=new StringBuilder();
        for(int i=word.length-1; i>=0; i--){
            sb.append(word[i]).append(" ");
        }
        return sb.toString().trim();

    }
    public static void main(String[] args) {
        System.out.println("Enter the String");
        Scanner scanner=new Scanner(System.in);
    String Sentence=scanner.nextLine();
    scanner.close();
    String Reverse=REversesentence(Sentence);
    System.out.println(Reverse);
}
    
}
