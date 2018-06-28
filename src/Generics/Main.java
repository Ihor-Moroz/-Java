package Generics;

import java.io.Serializable;

class Car extends Main implements Comparable, Serializable{

    @Override
    public int compareTo(Object o) {
        return 0;
    }
}


public class Main <T extends Main & Comparable & Serializable> {

    T var;

    public static void main() throws Exception{
        Main<Car> main=new Main<>();
        main.var=new Car();
        System.out.println(main.method(main.var));
    }

    void someMethod(){
        System.out.println("HW");
    }
    T method(T type){
        type.someMethod();
        return type;
    }
}
