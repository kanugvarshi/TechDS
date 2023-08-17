import java.util.*;
import java.lang.*;
public class str {
    public static void main(String[] args) {
        String s;
        String n="";
        int count=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter any string: ");
        s=sc.nextLine();
        for (int i=0;i<s.length();i++){
            if(s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u'||s.charAt(i)=='A'||s.charAt(i)=='E'||s.charAt(i)=='I'||s.charAt(i)=='O'||s.charAt(i)=='U'){
                count++;
            }
            if(s.charAt(i)>=97 && s.charAt(i)<=122){
               n+= Character.toUpperCase(s.charAt(i));
            }
            else{
                n+=Character.toLowerCase(s.charAt(i));
            }
        }
        System.out.println("frequency of vowels is: "+ count+ "\n"+ n);
        
    }
    
}
