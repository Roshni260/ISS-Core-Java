//Data types in java:
// Primitive: int, float, char, byte, boolean, long, short, double
// Non Primitive: String, Array, Class
//Variables type: static, local, instance
import java.util.Scanner;

public class Prime {
    int a =55; // Integer. a is an instance variable
    byte b=4; //Byte
    static char ch= 'A'; //static variable. character data type
    float f= 1.2f; // Floating number
    boolean isPrime=true; //Boolean

    boolean PrimeOrNot(int a){
        int count=0; // local variable
        for(int i=1;i<=a;i++){
            if(a%i==0)
                count++;
        }
        if(count==2)
            return isPrime;
        return !isPrime;
    }

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.print("Enter the number: ");
        int a=s.nextInt();
        Prime p=new Prime();
        if(p.PrimeOrNot(a)){
            System.out.println(a+" is a prime number");
        }
        else{
            System.out.println(a+" is not a prime number");
        }
    }
}
