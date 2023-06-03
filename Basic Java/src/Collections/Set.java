package Collections;

import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;

public class Set {
    int id;
    String name;
    Set(int id, String name){
        this.id=id;
        this.name=name;
    }
    public static void main(String[] args) {
        Set s1=new Set(101,"Roshni");
        Set s2=new Set(103,"Khushi");
        Set s3=new Set(104,"Nikita");
        HashSet<Set> set=new HashSet<Set>();
        set.add(s1);
        set.add(s2);
        set.add(s3);
        System.out.println("Before sorting");
        for(Set l:set){
            System.out.println(l.id+" "+l.name);
        }
        System.out.println("The size of the arraylist is: "+set.size());

    }
}
