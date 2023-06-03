package Collections;

import java.util.*;
class NameComparator implements Comparator<List> {
    public int compare(List s1,List s2){

        return s1.name.compareTo(s2.name);
    }}

