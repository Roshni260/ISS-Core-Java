// Exception is used to handle the runtime errors so that the normal flow of the application can be maintained.
// Keywords for handling exception are: try, catch, finally, throw, throws
import java.util.Scanner;

public class ExceptionHandling {
    static void Prime(int num) throws ArithmeticException{ // throws is used to declare an exception
        int count=0;
        for(int i=1;i<=num;i++){
            if(num%i==0)
                count++;
        }
        if(count!=2){
            throw new ArithmeticException(num+" is not prime number"); // throw keyword is used to throw an exception
        }else {
            System.out.println(num+" is a prime number");
        }
    }
    public static void main(String[] args) {
        int[] arr=new int[6];
        try{
            arr[10]=16; // since array length is 6. This will throw an error
        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println(e);
        }
        finally {
            System.out.println("This line will be printed irrespective of exception thrown or not");
        }
        Scanner s=new Scanner(System.in);
        System.out.print("Enter the number: ");
        int a=s.nextInt();
        Prime(a);
    }
}
