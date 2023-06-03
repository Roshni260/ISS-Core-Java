// Inheritance allows a class to inherit attributes or methods from its parent class using extends keyword.
// An interface is a fully abstract class. It includes a group of abstract methods (methods without a body). Other classes use interface using implements keyword
package Oops;

import java.util.Scanner;

interface area{
    public float square(int a);
    public float rectangle(int a, int b);
}
class Area implements area{ // Parent class
    protected float area; //protected means that it can be used by different class in the same package
    public float square(int a){ //Describes the implementation of the Abstract class in interface
       area=a*a;
       return area;
    }
    public float rectangle(int a, int b){ //Describes the implementation of the Abstract class in interface
        area=a*b;
        return area;
    }
}

class  Display extends Area{ // Child class
    public void display(){
        System.out.println("The area is: "+area);
    }
}
public class Inheritance {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        Display d=new Display();
        System.out.print("Enter the Length of the rectangle: ");
        int a=s.nextInt();
        System.out.print("Enter the Breadth of the rectangle: ");
        int b=s.nextInt();
        d.area=d.rectangle(a,b);
        d.display();
        System.out.println("-----------------");
        System.out.print("Enter the side of the square: ");
        int c=s.nextInt();
        d.area=d.square(c);
        d.display();
    }
}
