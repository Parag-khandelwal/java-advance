package javacollectionsframework;

import java.util.*;

public class ArrayListsInJava {
    public static void main(String[] args) {
        
        // This is a generics syntax. Meaning we can provide the dtype to the class which we want to work on...
        ArrayList <Integer> myList = new ArrayList<>();
        ArrayList <Integer> tempList = new ArrayList<>(5);

        myList.add(10);
        myList.add(20);
        myList.add(30);
        myList.add(3, 100);
        myList.add(3, 200);

        for (int i = 0; i < myList.size(); i++) {
            System.out.print(myList.get(i));
            System.out.print(", ");
        }

        tempList.add(-1);
        tempList.add(-1);
        tempList.add(-1);
        tempList.add(-1);

        // myList.addAll(tempList);
        myList.addAll(0, tempList);

        System.out.println("Added tempList");
        for (int i : myList) {
            System.out.print(i);
            System.out.print(", ");
        }
        System.out.println();

        System.out.println(myList.contains(50));

        // ensureCapacity =>
        System.out.println("ArrayList capacity: " + myList.size());
        myList.ensureCapacity(50); // ensures atleast 50 elements can be fitted into the array.

        int ind = myList.indexOf(-1);
        int lastInd = myList.lastIndexOf(-1);
        System.out.println(ind);
        System.out.println(lastInd);

        // .set
        tempList.set(2, 100);
        for (int i : tempList) {
            System.out.print(i);
            System.out.print(", ");
        }
    }
}
