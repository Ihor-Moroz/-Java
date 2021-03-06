package EqualsAndHashCode;

import java.util.HashMap;
import java.util.Map;

class Book{
    String author;
    String name;
}

class Ticket{
    int number;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Ticket ticket = (Ticket) o;

        return number == ticket.number;
    }

    @Override
    public int hashCode() {
        return number;
    }
}
public class Main {
    public static void main(String[] args) {
        Ticket ticket=new Ticket();
        ticket.number=123;
        Book book=new Book();
        book.author="Lox";
        book.name="Key";
        Map<Ticket, Book> library = new HashMap<>();
        library.put(ticket,book);

        Ticket ticket2=new Ticket();
        ticket2.number=123;

        Book newBook=library.get(ticket2);
        System.out.println(newBook.author);
        System.out.println(newBook.name);
    }
}