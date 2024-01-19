package java;
import java.util.*;
class Lab4b{
    public static void main(String[] args) {
        char ch;
        // Scanner s = new Scanner(System.in);
        // String str=s.nextLine();
        // String s1 = ;
        
        for(int i=0;i<args[0].length();i++){
           
            ch = args[0].charAt(i);
           
            if(ch=='a' || ch=='e' ||ch=='i' ||ch=='o' ||ch=='u'){
                System.out.println("Vowel : " + ch);
            }else{
                System.out.println("componants : " + ch);
            }
           } 
    }
}