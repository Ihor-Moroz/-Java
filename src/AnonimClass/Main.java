package AnonimClass;

public class Main {
    public static void main(String[] args) {
        Comparable pop=new Comparable(){//наслідування нового класу від класу Popcorn, клас без імені

            @Override
            public int compareTo(Object o) {
                return 0;
            }
        };
        pop.compareTo(new Object());
    }
}
