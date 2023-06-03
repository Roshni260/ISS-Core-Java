package Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class List {
    int id;
    String name;
    List(int id, String name){
        this.id=id;
        this.name=name;
    }
    public static void main(String[] args) {
        List s1=new List(101,"Roshni");
        List s2=new List(103,"Khushi");
        List s3=new List(104,"Nikita");
        ArrayList<List> arr=new ArrayList<List>();
        arr.add(s1);
        arr.add(s2);
        arr.add(s3);
        System.out.println("Before sorting");
        for(List l:arr){
            System.out.println(l.id+" "+l.name);
        }
        System.out.println("The size of the arraylist is: "+arr.size());
        System.out.println("After sorting");
        Collections.sort(arr,new NameComparator());
        Iterator itr=arr.iterator();
        for(List l:arr){
            System.out.println(l.id+" "+l.name);
        }
    }
}
