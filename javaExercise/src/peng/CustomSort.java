package peng;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;


public class CustomSort {
	/*
	 * This is a sample code to illustrate custom sort.
	 * In this example, we can sort a list of key/value pairs by its name or value.
	 * 
	 * 
	 * In this example, we need to use Collections.sort() to sort list.
	 * If input type of LinkedList is String, we can apply directly because String implements interface Comparable;
	 * Reference:
	 * Collections.sort(List<T> list)
	 * 
	 * If sort in our custom way, we need to implement interface Comparator 
	 * and override its compare method.
	 * 
	 * Reference:
	 * Collections.sort(List<T> list, Comparator<? super T> c)
	 */
	
    LinkedList <Mountain> mtn = new LinkedList<>();

    public static void main (String [] args) {
        new CustomSort().go();
    }

    private void go(){
        mtn.add(new Mountain("Longs", 14255));
        mtn.add(new Mountain("Elbert", 14433));
        mtn.add(new Mountain("Maroon", 14156));
        mtn.add(new Mountain("Castle", 14265));
        System.out.println("as entered:\n" + mtn);
        // sort by name
        nameCompare nc = new nameCompare();
        Collections.sort(mtn, nc);
        System.out.println("by name\n" + mtn);
        //sort by height
        heightCompare hc = new heightCompare();
        Collections.sort(mtn, hc);
        System.out.println("by height\n" + mtn);
    }

    private class nameCompare implements Comparator<Mountain>{
        public int compare(Mountain one, Mountain two){
            return one.name.compareTo(two.name); // String compare
        }
    }

    private class heightCompare implements Comparator<Mountain>{
        public int compare(Mountain one, Mountain two){
            return (two.height - one.height);  // sort in reverse-order
        }
    }

}


// Define custom data structure
class Mountain{

    String name;
    int height;

    // Constructor
    Mountain(String name, int height){
        this.name = name;
        this.height = height;
    }

    //override toString method
    public String toString(){
        return name + " " + height;
    }
}

