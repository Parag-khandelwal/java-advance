package javacollectionsframework;

import java.util.*;

public class LinkedListsInJava {
    public static void main(String[] args) {
        LinkedList<Integer> l1 = new LinkedList<>();
        LinkedList<Integer> l2 = new LinkedList<>();

        l1.add(10);
        l1.add(12);
        l1.add(14);
        l1.add(16);
        l1.add(18);
        l1.add(20);

        for(int i = 0;i < l1.size(); i++){
            System.out.print(l1.get(i));
            System.out.print(",");
        }
        
        l2.add(-1);
        l2.add(-1);
        l2.add(-1);
        
        l1.addAll(l2);

        System.out.println('\n');
        for(int i = 0;i < l1.size(); i++){
            System.out.print(l1.get(i));
            System.out.print(",");
        }
        System.out.println();

        System.out.println(l1.element()); // retrives 1st element from the list.

        


    }
}
