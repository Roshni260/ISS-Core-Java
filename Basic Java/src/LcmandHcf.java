import java.util.Scanner;
//Class in java is a group of functions and properties (also template of object)
//Method is a set of code that performs action mentioned in it when called
//Object is an instance of class
//Instance variables are variables that are declared inside the class but outside the scope of any method.
//This program is used to find LCM(Least Common Multiple) and HCF(Highest Common Factor) of two integers.
public class LcmandHcf { //LcmandHcf is a java class.public means that is can be accessed from anyone.
    // These are instance variables
    int x=0;
    int min=0;
    int max=0;

     int Lcm(int a, int b){ //Lcm is a method. int is a data type that indicates class Lcm will return an integer
         if(a>b){ //if-else is used for decision making
             min=b;
             max=a;
         }else {
             min=a;
             max=b;
         }
        for(int i=1;i<=min;i++){
            if(a%i==0&&b%i==0){
               x=i;
            }
        }
        return x;
     }

     int hcf(int a,int b){ //hcf is also a method that returns hcf of two numbers
         if(a>b){
             min=b;
             max=a;
         }else {
             min=a;
             max=b;
         }
         for(int i=max;i>=max;i++){
             if(i%a==0&&i%b==0){
                 max=i;
                 break; // this is use to break tha loop
             }
         }
         return max;
     }

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.print("Enter the first number:");
        int a=s.nextInt();
        System.out.print("Enter the second number:");
        int b=s.nextInt();
        LcmandHcf c=new LcmandHcf(); // Here an object c is created for class LcmandHcf
        System.out.println("The LCM of "+a+" and "+b+" is:"+c.Lcm(a,b)); // c.Lcm(a,b) is used to call the method Lcm which will return lcm of a and b
        System.out.println("The HCF of "+a+" and "+b+" is "+c.hcf(a,b)); // c.hcf(a,b) is used to call the method hcf
    }
}
