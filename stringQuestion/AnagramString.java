

import java.util.Arrays;
import java.util.Scanner;

public class AnagramString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first string: ");
        String str1 = scanner.nextLine().toLowerCase();
        System.out.println("Enter second string: ");
        String str2 =scanner.nextLine().toLowerCase();
        scanner.close();
        if (str1.length()==str2.length()) {
        char[] charStr1= str1.toCharArray();
        char[] charStr2= str2.toCharArray();
        Arrays.sort(charStr1);
        Arrays.sort(charStr2);
        boolean result= Arrays.equals(charStr1,charStr2);
        if(result){
            System.out.println("The strings are anagrams.");
        }      
        else{
            System.out.println("The strings are not anagrams.");
        }

    }
    else{
        System.out.println("The strings must be of equal length.");
    }
}
}