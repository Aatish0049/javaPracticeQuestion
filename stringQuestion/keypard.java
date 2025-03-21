import java.util.*;

public class keypard {
    

    public static void Countpressed(String Str){
        int count=0;
        for(int i=0;i<Str.length();i++){
            char ch=Str.charAt(i);
            if(ch=='a' || ch=='d' || ch=='g' || ch=='j'||ch=='m'||ch=='p'||ch=='t'||ch=='w'){
                count++;
            }
            else if(ch=='b' || ch=='e' || ch=='h' || ch=='k'||ch=='n'||ch=='q'||ch=='u'||ch=='x'){
                count=count+2;
            }
            else if(ch=='c' || ch=='f' || ch=='i' || ch=='l'||ch=='o'||ch=='r'||ch=='v'||ch=='y'){
                count=count+3;
            }
            else{
                count=count+4;
            }

    }
    System.out.println("Number of keys pressed: "+count);
    
}
public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter a string: ");
    String Str=sc.next().toLowerCase();
    Countpressed(Str);
}
}
    

