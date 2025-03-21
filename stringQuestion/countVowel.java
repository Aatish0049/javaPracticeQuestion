import java.util.*;
public class countVowel {
    public static void main(String[] args) {
        String str = new String();
        System.out.println("Enter a Word: ");
        Scanner sc = new Scanner(System.in);
        str = sc.nextLine();
        int count = 0;
      //  for (char ch: str.toCharArray()){
      for(int i = 0; i < str.length(); i++){
        char ch=str.charAt(i);
      
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
                count++;
            }
        }
        System.out.println("Number of vowels in the word: " + count);
    }
    }

