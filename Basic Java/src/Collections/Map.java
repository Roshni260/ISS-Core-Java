package Collections;

import java.util.Comparator;
import java.util.HashMap;

public class Map {
    public static void main(String args[]){
        HashMap<Integer,String> map=new HashMap<Integer,String>();
        map.put(101,"Roshni");
        map.put(102,"Vijay");
        map.put(103,"Rahul");
        //Elements can traverse in any order
        for(HashMap.Entry m:map.entrySet()){
            System.out.println(m.getKey()+" "+m.getValue());
        }
        System.out.println("After sorting in reverse order");
        map.entrySet().stream().sorted(HashMap.Entry.comparingByKey(Comparator.reverseOrder())).forEach(System.out::println);
    }}
