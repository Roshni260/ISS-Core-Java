// string is basically an object that represents sequence of char values. A string is declared using 'String' keyword
import java.util.Scanner;

public class RevString {
    static void reverse(String s){
        String rev="";
        char ch[]= s.toCharArray();
        for(int i=ch.length-1;i>=0;i--){ //for loop
            rev=rev+ch[i];
        }
        System.out.println("The reverse of "+s+" is "+rev);
    }

    public static void main(String[] args) {
        Scanner s =new Scanner(System.in);
        System.out.print("Enter the string: ");
        String str= s.next();
        reverse(str);
    }
}
