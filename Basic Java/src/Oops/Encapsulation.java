// Encapsulation wraps up the implementation of data members and methods in a class. It uses getter and setter method
// Modifiers type: public, protected, private
package Oops; // package is a container for classes

public class Encapsulation {
    private String name;// private means restricted access

    public String getName(){
        return name;
    }

    public String setName(String str){
        name=str;
        return name;
    }

    public static void main(String[] args) {
        Encapsulation e=new Encapsulation();
        e.setName("Roshni");
        System.out.println(e.getName());

    }
}
