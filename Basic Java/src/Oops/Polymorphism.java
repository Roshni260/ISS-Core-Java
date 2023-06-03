// Polymorphism means "many forms", and it occurs when we have many classes that are related to each other by inheritance.
// Types: Runtime/Overriding and Compile time/Overloading.An example for both is given below.
package Oops;

import java.util.Scanner;

// Example of Overriding
class Circle{
    void perimeter(int r){
        double p= 2*3.142*r;
        System.out.println("The perimeter of circle is: "+p);
    }

    void area(int r){
        double a=3.142*r*r;
        System.out.println("The area of the circle is: "+a);
    }
}

class Square extends Circle{ // Subclass overrides the parent class
    void perimeter(int s){
        double p= 4*s;
        System.out.println("The perimeter of square is: "+p);
    }

    void area(int s){
        double a= s*s;
        System.out.println("The area of the square is: "+a);
    }
}

// Example Overloading
class Addition{
    int add(int a, int b){
        return a+b;
    }

    int add(int a){ // Method with same name but different number of parameters
        return a+a;
    }

    int add(){
        int a=10;
        int b=20;
        return a+b;
    }
}
public class Polymorphism {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Circle a= new Circle();
        Square b= new Square();
        System.out.println("Overriding Results");
        System.out.print("Enter radius of the circle: ");
        int r=sc.nextInt();
        a.perimeter(r);
        a.area(r);
        System.out.println("----------------");
        System.out.print("Enter side of the square: ");
        int s=sc.nextInt();
        b.perimeter(s);
        b.area(s);
        System.out.println("----------------");
        System.out.println("Overloading Results");
        Addition c= new Addition();
        System.out.println("result: "+c.add());
        System.out.println("result: "+c.add(2,5));
        System.out.println("result: "+c.add(6));
    }
}
