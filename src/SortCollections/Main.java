package SortCollections;

import java.util.*;

class Person{
    int age;

    public Person(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "age=" + age +
                '}';
    }
}

class ComparePerson implements Comparator<Person>{
    @Override
    public int compare(Person o1, Person o2) {
        return o1.age-o2.age;
    }
}

public class Main {
    public static void main(String[] args) {
        ComparePerson CP=new ComparePerson();
        Set set=new TreeSet(CP);
        set.add(new Person(2));
        set.add(new Person(1));
        set.add(new Person(4));
        set.add(new Person(3));
        for (Object o:set
             ) {
            System.out.println(o);
        }
    }
}
