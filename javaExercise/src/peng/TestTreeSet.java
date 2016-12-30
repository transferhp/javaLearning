package peng;

import java.util.Comparator;
import java.util.TreeSet;


/**
 * Created by Peng Hao on 30/12/2016.
 *
 * TreeSet's sole purpose in life is to keep your elements sorted,
 * so it has to know how to sort your element objects!
 */

public class TestTreeSet {
    public static void main (String [] args){
        new TestTreeSet().go();
    }

    void go() {
        Book b1 = new Book("How Cats Work");
        Book b2 = new Book("Remix your Body");
        Book b3 = new Book("Finding Emo");
        // Solution 1:
        //TreeSet<Book> bookSet = new TreeSet<>();
        // or
        // Solution 2:
        BookCompare bCompare = new BookCompare();
        TreeSet<Book> bookSet  = new TreeSet<> (bCompare);
        bookSet.add(b1);
        bookSet.add(b2);
        bookSet.add(b3);
        System.out.println(bookSet);
    }
}

//// Solution 1:
//// The elements in a TreeSet must be a type that implements Comparable
//class Book implements Comparable{
//    String title;
//    //constructor
//    Book(String t){
//        title = t;
//    }
//
//    @Override
//    public int compareTo(Object b) {
//        Book book = (Book) b;
//        return (title.compareTo(book.title));
//    }
//
//    public String toString (){
//        return title;
//    }
//}


// Solution2:
// Using the TreeSet's overloaded constructor that takes a Comparator
class BookCompare implements Comparator<Book> {
    @Override
    public int compare(Book b1, Book b2) {
        return (b1.title.compareTo(b2.title));
    }
}

class Book{
    String title;
    //constructor
    Book(String t){
        title = t;
    }

    public String toString (){
        return title;
    }
}
