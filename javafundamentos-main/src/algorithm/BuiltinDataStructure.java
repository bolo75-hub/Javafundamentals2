package algorithm;
import oopmodeling.Planet;

import java.util.*;
import java.util.concurrent.ConcurrentLinkedQueue;

public class BuiltinDataStructure {

    public static void main(String[] args) {

        //create two objects of class {@Link planet}
        Planet planet1 = new Planet();
        Planet planet2 = new Planet(123, "Mars");
        //create an object of array with a fixed size of 5
        Planet[] pls = new Planet[5];
        pls[0] = planet1;
        pls[1] = planet2;
        //create an object of class (@Link arrayList)
        ArrayList<Planet> planets = new ArrayList<>();
        //add an object to position 0
        planets.add(planet1);
        //add an object to position 1
        planets.add(planet2);
        //retrieve the value at index 1
        planets.get(1);

        LinkedList<String> names = new LinkedList<>();
        names.add("diego");
        names.add("rubibia");
        //less efficient than accessing in an Array when usin index
        names.get(1);

        Stack<Integer> callstack = new Stack<>();
        //add an element on the top of the stack object
        callstack.push(34);
        callstack.push(10);
        callstack.push(2);
        //peek method is used to read the element on the top
        System.out.println(callstack.peek());
        //remove the element from the top of the stack
        System.out.println(callstack.pop());
        System.out.println(callstack.peek());

        Queue<Integer> queue = new ConcurrentLinkedQueue<>();
        queue.add(123);
        queue.add(12);
        queue.add(12300);
        System.out.println(queue.poll());

        // poll is the system which the fist element of the  queue are eliminated
        System.out.println(queue.poll());
        Queue<String> printedTask = new LinkedList<>();
        printedTask.add("task 1");
        printedTask.add("task 2");
        printedTask.add("task 3");
        // we use the method "peek" to read the head element without remove
        System.out.println(printedTask.peek());
        System.out.println(printedTask.poll());
        System.out.println(printedTask.poll());
        TreeMap<String, Planet> tree;
        TreeMap<String, user> users;


    }
}
