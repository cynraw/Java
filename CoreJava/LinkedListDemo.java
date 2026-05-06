package CoreJava;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class LinkedListDemo {
    public static void main(String[] args){
        LinkedList<Integer> linkedList = new LinkedList<>();

        linkedList.add(12);
        linkedList.add(1);
        linkedList.add(20);
        linkedList.add(30);

        System.out.println(linkedList);

        //Adding an element at an index
        linkedList.add(1, 100);
        System.out.println(linkedList);

        // for(int y : linkedList){
        //     System.out.println(y);
        // }

        Deque<Integer> linkedDeque = new LinkedList<>();
        linkedDeque.add(11);
        linkedDeque.add(12);
        linkedDeque.add(13);
        linkedDeque.add(15);

        //Adding an element at the end of a linked list
        linkedDeque.addLast(90);
        System.out.println(linkedDeque);

        Queue<String> linkedNames = new LinkedList<>();
        linkedNames.add("Joab");
        linkedNames.add("Abishai");
        linkedNames.add("Abimelech");


        System.out.println(linkedNames);

    }
}
