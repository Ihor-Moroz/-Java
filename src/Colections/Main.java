package Colections;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        Queue col=new PriorityQueue();

        col.offer("1");
        col.offer("2");
        col.offer("3");
        col.offer("4");
        Iterator it=col.iterator();
        while(it.hasNext()){
            System.out.println(col.poll());
        }
        System.out.println(col.size());

        Set col2=new HashSet();
        col2.add("1");
        col2.add("2");
        col2.add("2");
        col2.add("3");
        col2.add("3");
        col2.add("3");
        col2.add("4");
        col2.add("4");
        col2.add("4");
        col2.add("4");
        for (Object o:col
             ) {
            System.out.println(o);
        }

        Map col3=new HashMap();
        col3.put(1,"1");
        col3.put(2,"2");
        col3.put(3,"3");
        col3.put(4,"4");
        System.out.println(col3.get(3));
        Set set=col3.entrySet();
        for (Object o:set
             ) {
            System.out.println(o);
        }

        Collection col4=new TreeSet();
        col4.add("3");
        col4.add("1");
        col4.add("2");
        col4.add("4");
        for (Object o:col4
             ) {
            System.out.println(o);
        }
    }
}
